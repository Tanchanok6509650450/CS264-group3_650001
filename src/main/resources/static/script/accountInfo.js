function pullInfoFromSession() {
    document.getElementById("username1").innerHTML = sessionStorage.getItem("username")
    document.getElementById("username2").innerHTML = sessionStorage.getItem("username")
    document.getElementById("type").innerHTML = sessionStorage.getItem("type")
    document.getElementById("displayname_th").innerHTML = sessionStorage.getItem("displayname_th")
    document.getElementById("displayname_en1").innerHTML = sessionStorage.getItem("displayname_en")
    document.getElementById("displayname_en2").innerHTML = sessionStorage.getItem("displayname_en")
    document.getElementById("tu_status").innerHTML = sessionStorage.getItem("tu_status")
    document.getElementById("email").innerHTML = sessionStorage.getItem("email")
    document.getElementById("faculty").innerHTML = sessionStorage.getItem("faculty")
    document.getElementById("department").innerHTML = sessionStorage.getItem("department")
}