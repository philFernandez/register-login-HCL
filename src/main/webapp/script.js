document.addEventListener("DOMContentLoaded", (e) => {
  let btn = document.getElementById("showpass");
  btn.addEventListener("click", () => {
    let hiddens = [];
    hiddens = document.getElementsByClassName("hide");
    for (item of hiddens) {
      item.style.display = "block";
    }
  });
});
