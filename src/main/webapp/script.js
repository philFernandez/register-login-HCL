document.addEventListener("DOMContentLoaded", (e) => {
  let btn = document.getElementById("showpass");
  btn.addEventListener("click", () => {
    let hiddens = [];
    hiddens = document.getElementsByClassName("hide");
    // This would never be done in a real application because these elements being shown
    // contain the user password in clear text inside the client's html
    for (item of hiddens) {
      item.style.display = "block";
    }
  });
});
