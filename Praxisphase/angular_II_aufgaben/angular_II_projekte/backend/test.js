const express = require("express");
const app = express();
var cors = require("cors");
const basicAuth = require("express-basic-auth");
const {
  PORT,
  ACTIVATE_CORS,
  ACTIVATE_AUTH,
  USERS,
  DEFAULT_POSTS,
} = require("./config");

let posts = [...DEFAULT_POSTS];

// JSON Verarbeitung in Express.js aktivieren
app.use(express.json());

// CORS aktivieren
if (ACTIVATE_CORS) {
  // CORS mit den entsprechenden Headern
  app.use(
    cors({
      origin: "*", // Beispiel: Deine Frontend-URL
      methods: ["GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"], // Erlaubte Methoden
      allowedHeaders: ["*"] // Erlaubte Header
    })
  );

  // Middleware, um CORS-Header zu jeder Anfrage hinzuzufügen
  app.use((req, res, next) => {
    res.header("Access-Control-Allow-Origin", "http://localhost:3100"); // oder '*' für alle
    res.header(
      "Access-Control-Allow-Methods",
      "GET, POST, PUT, PATCH, DELETE, OPTIONS"
    );
    res.header("Access-Control-Allow-Headers", "Content-Type, Authorization");
    next();
  });

  // Für OPTIONS-Anfragen, die für Preflight-Anfragen genutzt werden
  app.options("*", (req, res) => {
    res.sendStatus(200); // Erfolgreich, aber ohne weiteren Inhalt
  });
}

// Basic Auth
if (ACTIVATE_AUTH) {
  app.use(
    basicAuth({
      users: createUserPasswordMap(USERS),
      challenge: true,
    })
  );
}

// Server starten
app.listen(PORT, () => {
  console.log(`Angular blog server running on port ${PORT}`);
});

// Existierende Blog-Artikel ausgeben
app.get("/posts", (req, res) => {
  res.send(posts);
});

// Einen einzelnen Blog-Artikel über dessen ID ausgeben
app.get("/posts/:postId", (req, res) => {
  const id = parseInt(req.params.postId);
  const post = posts.find((p) => p.id === id);
  res.send(post);
});

// Neuen Blog-Artikel erstellen
app.post("/posts", (req, res) => {
  const lastId = posts.length > 0 ? Math.max(...posts.map((p) => p.id)) : 0;
  const newPost = { id: lastId + 1, ...req.body };
  posts.push(newPost);
  res.status(201).send(newPost);
});

// Blog-Artikel löschen
app.delete("/posts/:postId", (req, res) => {
  const id = parseInt(req.params.postId);
  posts = posts.filter((p) => p.id !== id);
  res.send(posts);
});

// Liste aller verfügbaren Benutzer
app.get("/users", (req, res) => {
  const userList = USERS.map((user) => ({
    username: user.username,
    name: user.name,
  }));
  res.send(userList);
});

// Details des autorisierten Benutzers
app.get("/users/me", (req, res) => {
  const currentUsername = req.auth?.user;
  if (!currentUsername) {
    res.status(401);
  }

  const userList = USERS.reduce((acc, user) => {
    return user.username == currentUsername
      ? { username: user.username, name: user.name, roles: user.roles }
      : acc;
  }, null);
  res.send(userList);
});

// Funktion zur Erstellung der User-Passwort-Map
// Sonstiges
function createUserPasswordMap(users) {
  return users.reduce((acc, { username, password }) => {
    acc[username] = password;
    return acc;
  }, {});
}
