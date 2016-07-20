//getPatientByNumDoss();
//afficher();
$("#submit").unbind();
$("#submit").bind("click", function () {
    var a = $("#user").val();
    var b = $("#password").val();
    login(a, b); 
});