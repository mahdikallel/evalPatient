/*function getPatientByNumDoss() {
 var listRep;
 $.ajax({
 url: "TestWEB?type=consult&function=getAllEchelle",
 type: 'POST',
 async: false,
 error: function(jqXHR, textStatus, errorThrown) {
 },
 complete: function(jqXHR, textStatus) {
 },
 success: function(data, textStatus, jqXHR) {
 listRep = eval('(' + data + ')');
 }
 });
 return listRep;
 }
 */


function login(a, b) {
    var listRep;

    $.ajax({
        url: "Authentification?mode=normal&login=" + a + "&password=" + b,
        type: 'POST',
        async: false,
        error: function (jqXHR, textStatus, errorThrown) {
        },
        complete: function (jqXHR, textStatus) {
        },
        success: function (data, textStatus, jqXHR) {
            if (data === "succes") {
                location.href = "master_page/index.jsp";

            } else {
                if (data === "error") {
                    code_html = "<div class='alert alert-danger alert-block'>";
                    code_html += "<a class='close' data-dismiss='alert' href='#'>×</a>";
                    code_html += "<h4 class='alert-heading'>Error!</h4>";
                    code_html += "Nom d'utilisateur ou mot de passe incorrect<p class='text-align-left'><br>";
                    code_html += "</a></p></div>";
                    document.getElementById("error").innerHTML = code_html;
                    //  $('#error').append(code_html);
                }

            }
        }
    });
    return listRep;
}
function  afficher() {
    alert($("#user").val());
}
