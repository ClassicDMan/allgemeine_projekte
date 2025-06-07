document.addEventListener("DOMContentLoaded", function () {
  if (typeof particlesJS !== "undefined") {
      particlesJS("particles-js", {
          "particles": {
              "number": { "value": 100 },
              "size": { "value": 3 },
              "color": { "value": "#ffffff" },
              "opacity": { "value": 0.7 },
              "move": { "speed": 2 },
              "shape": { "type": "circle" }
          },
          "interactivity": {
              "events": { "onhover": { "enable": true, "mode": "repulse" } }
          }
      });
  } else {
      console.error("Particles.js konnte nicht geladen werden!");
  }
});
