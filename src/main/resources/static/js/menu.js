var menubtn = document.getElementById("menubtn");
var nav = document.getElementById("nav")
var navbox = document.getElementById("navbox")
menubtn.onclick = function() {
    nav.classList.toggle("opened");
    navbox.classList.toggle("opened");
    menubtn.classList.toggle("close");
};