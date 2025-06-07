document.querySelectorAll(".navbar li").forEach((li) => {
    li.addEventListener("click", () => {
        const link = li.querySelector("a");
        if (link) {
            // Redirect based on the link's href
            window.location.href = link.getAttribute("href");
        }
    });
});