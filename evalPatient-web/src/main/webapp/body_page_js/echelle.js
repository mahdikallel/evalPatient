var tabValeur = [];
var tabCodeSousFamille = [];
var tabCodeFamille = [];

var designation = [];
var idEchelles = [];
var descEchelles = [];


$(function () {


    sessionStorage.clear();
    $('#container').highcharts({
        title: {
            text: "Courbe d'évaluation",
            x: -20 //center
        },
        subtitle: {
            text: '',
            x: -20
        },
        xAxis: {
            title: {
                text: 'Date'
            }

        },
        yAxis: {
            title: {
                text: 'Valeur'
            }

        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        scrollbar: {
            enabled: true
        },
        series: [{
                data: []
            }]
    });

    var list = getAllEchelle();
    $("#content").empty();

    $("#buttons").append('<button type="button"  class="btn  txt-color-white" data-toggle="modal" data-target=".bs-example-modal-add-echelle" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px;background-color:#71843f">Ajouter Echelle  </button><br>');
    for (var i = 0; i < list.length; i++)
    {
        $("#buttons").append('<a href="javascript:void(0);" id="_button' + i + '" class="btn btn-labeled btn-warning" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px">' + list[i].designation + '</a><br>');
        designation[i] = list[i].designation;
        idEchelles[i] = list[i].codeEchelle;
        descEchelles[i] = list[i].description;
    }

    sessionStorage.setItem("tabDesignation", JSON.stringify(designation));
    sessionStorage.setItem("tabIdEchelles", JSON.stringify(idEchelles));
    sessionStorage.setItem("tabDescEchelles", JSON.stringify(descEchelles));

    $(document).ready(function () {
        for (var i = 0; i < list.length; i++) {
            $("#_button" + i).unbind("click");
            $('#_button' + i).click(createCallback(i));
        }
    });

    function createCallback(i) {

        return function () {

            sessionStorage.removeItem("nbLigneResponse");
            sessionStorage.removeItem("tabCodeSousFamille");
            sessionStorage.removeItem("tabCodeFamille");
            sessionStorage.setItem("maxVal", list[i].valeurMaximale);
            sessionStorage.setItem("minVal", list[i].valeurMinimale);
            sessionStorage.setItem("moyVal", list[i].valeurMoyenne);
            $("#minVal").text(list[i].valeurMinimale);
            $("#moyVal").text(list[i].valeurMoyenne);
            $("#maxVal").text(list[i].valeurMaximale);
            sessionStorage.removeItem("tabValeur");
            designation = JSON.parse(sessionStorage.getItem("tabDesignation"));
            idEchelles = JSON.parse(sessionStorage.getItem("tabIdEchelles"));
            descEchelles = JSON.parse(sessionStorage.getItem("tabDescEchelles"));

            $("#myModalLabel").text(designation[i]);
            $("#idEchelle").val(idEchelles[i]);
            var numEchelle = $("#idEchelle").val();

            sessionStorage.setItem("currentIdEchelle", i);
            sessionStorage.setItem("numEchelle", numEchelle);

            $("#rechercher").remove();
            $("#descEchelles").text(descEchelles[i]);
            createBackgrid(numEchelle);

            var donne = DrawChart(13015369, numEchelle);

            var date = [];
            var valeur = [];
            for (var j = 0; j < donne.length; j++) {
                date.push(donne[j].date);
                valeur.push(donne[j].valeur);
            }

            $('#container').highcharts({
                title: {
                    text: "Courbe d'évaluation",
                    x: -20 //center
                },
                subtitle: {
                    text: designation[i],
                    x: -20
                },
                xAxis: {
                    title: {
                        text: 'Date'
                    },
                    categories: date,
                    max: 10



                },
                yAxis: {
                    title: {
                        text: 'Valeur'
                    }

                },
                legend: {
                    layout: 'vertical',
                    align: 'right',
                    verticalAlign: 'middle',
                    borderWidth: 0
                },
                scrollbar: {
                    enabled: true
                },
                series: [{
                        name: 'Total',
                        data: valeur

                    }]
            });
        };
    }

});


$("#launch_eval_modal").unbind("click");
$("#launch_eval_modal").bind("click", function () {
    if (sessionStorage.getItem("currentIdEchelle") === null) {
        showNotification("Error", "Choissisez une échelle  pour commencer l'evaluation ", "error", 0);
    } else {
        $("#myModal").modal('show');
    }
});
$("#_insert_eval").unbind("click");
$("#_insert_eval").bind("click", function () {
    tabValeur = JSON.parse(sessionStorage.getItem("tabValeur"));
    tabCodeSousFamille = JSON.parse(sessionStorage.getItem("tabCodeSousFamille"));
    tabCodeFamille = JSON.parse(sessionStorage.getItem("tabCodeFamille"));
    if (tabValeur === null) {
        showNotification("Error", "Commencez a cocher", "error", 0);
    } else {
        if (tabValeur.length === parseInt(sessionStorage.getItem("nbLigneResponse"))) {
            for (var i = 0; i < tabValeur.length; i++) {
                $("[id=" + tabCodeFamille[i] + "]").css("background-color", "White");
                insertResultatEvaluation('13015369', tabCodeSousFamille[i], tabValeur[i], getCurrentDateTime());
            }
            $("#_resultat").empty();
            $("#rechercher").remove();

            $("#myModal").modal('hide');
            $("#_button" + sessionStorage.getItem("currentIdEchelle")).trigger("click");
        } else {
            showNotification("Error", "Vous devez au moins choisir une reponse par famille echelle", "error", 0);
        }
    }
});
var codeEchelle;
var designation;
var valeurMinimale;
var valeurMoyenne;
var ValeurMaximale;
var description;


$("#_btn_ajouter_echelle").unbind("click");
$("#_btn_ajouter_echelle").bind("click", function () {
    /* Form ajout echelle  */
    codeEchelle = incrementID("Code_Echelle", "Echelle");
    designation = $("#_designation_echelle").val();
    valeurMinimale = $("#_minimale").val();
    valeurMoyenne = $("#_moyenne").val();
    ValeurMaximale = $("#_maximale").val();
    description = $("#_description").val();
    codeAide = "NULL";

    /* Fin Form ajout echelle  */
    insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description);

    for (var i = 0; i < tabIdDiv.length; i++) {
        var codeFamille = IncCodeFamilleEchelle();
        insertFamilleEchelle(codeFamille, $('#_designation_famille_echelle' + tabIdDiv[i]).val(), codeEchelle, codeAide);
        $('#_div_famille' + tabIdDiv[i]).find('#_div_sous_famille' + tabIdDiv[i]).each(function () {
            console.log("enter");
            console.log("ids");
            var ids = $('#_div_sous_famille' + tabIdDiv[i]).children().children().children().children(".form-control ").map(function () {
                return $(this).attr('id');
            });
            for (var k = 0; k < ids.length; k = k + 2) {
                insertSousFamille(IncCodeSousFamille(), $('#' + ids.get(k)).val(), codeFamille, $('#' + ids.get(k + 1)).val());
            }

        });
    }
    showNotification("Succes", designation + " est ajouté ", "success", 4000);
    $("#myModal-echelle").modal('hide');
    window.location.reload();
});





