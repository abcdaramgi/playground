function HideSideBar(){
    if(document.body.id == "tt-body-page"){
        $("#aside").css("display", "none");
    } else {
        $("#aside").css("display", "block");
    }
}