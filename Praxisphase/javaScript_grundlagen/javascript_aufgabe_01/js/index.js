function verarbeiteFormular() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;

    alert("Name: " + name + "\nE-Mail: " + email);

    console.log("Name:", name);
    console.log("E-Mail:", email);

    document.getElementById("meinFormular").reset();
}