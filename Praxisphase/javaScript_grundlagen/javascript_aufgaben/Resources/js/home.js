document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector(".new-blog form"); 
    const blogOverview = document.querySelector(".blog-overview");
    const newBlogSection = document.querySelector(".new-blog");

    form.addEventListener("submit", function (event) {
        event.preventDefault(); 

        // eingegebene Texte in consts speichern
        const title = document.getElementById("titel").value;
        const content = document.getElementById("content").value;

        // die Feldern müssen nicht leer sein
        if (title.trim() === "" || content.trim() === "") {
            alert("Bitte fülle alle Felder aus!"); 
            return;
        }

        // article tag erstellen und nenne den class: blog-post
        const newArticle = document.createElement("article");
        newArticle.classList.add("blog-post");

        // hier wurden die tags: h3, a --> read-more und p --> teaser erstellt und hizugefügt 
        // --> wegen der href = schau mal node.js --> wie java und python logs
        const newTitle = document.createElement("h3");
        const newLink = document.createElement("a");
        newLink.href = "#";
        newLink.textContent = title;

        const newContent = document.createElement("p");
        newContent.classList.add("teaser");
        newContent.textContent = content;

        const readMore = document.createElement("a");
        readMore.href = "#";
        readMore.classList.add("read-more");
        readMore.textContent = "Weiterlesen";

        // jetzt kommt der Teil wo alles zusammengebaut werden (rebuild)
        newTitle.appendChild(newLink);
        newArticle.appendChild(newTitle);
        newArticle.appendChild(newContent);
        newArticle.appendChild(readMore);

        // das neue Artikel sollte zwischen der letzte Artikel und dem Bereich Neuen-Blog-Artikel erstellen --> insertBefore(T1, T2)
        blogOverview.insertBefore(newArticle, newBlogSection);

        // dann reset
        form.reset();
    });
});

