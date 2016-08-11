/* global Backbone, Backgrid */
/*Methodes utilisées (core)
 * getAllEchelle()
 * GetResultByNumDossAndCodeEchelle(numEchlle,numDossier)
 * GetListReponseParEchelle(numEchelle)
 * insertResultatEvaluation(numDos, codeSousFamille, valeur, dateSys)
 * incrementID(code, tableName)
 * insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description)
 * insertSousFamille(codeSousFamille, designation, codeFamille, valeur)
 * insertFamilleEchelle(codeFamilleEchelle, designation, codeEchelle, codeAide)
 * */

var tabValeur = [];
var tabCodeSousFamille = [];
var tabCodeFamille = [];

var designation = [];
var idEchelles = [];
var descEchelles = [];


$(function () {

    // $("#_chose_echelle").append('<div class="alert alert-info alert-block"><a class="close" data-dismiss="alert" href="#"></a><h4 class="alert-heading">Info!</h4>Best check yo self, youre not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</div>');
    //'<div class="alert alert-info alert-block"><a class="close" data-dismiss="alert" href="#"></a><h4 class="alert-heading">Info!</h4>Best check yo self, youre not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</div>'
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
        }
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


            designation = JSON.parse(sessionStorage.getItem("tabDesignation"));
            idEchelles = JSON.parse(sessionStorage.getItem("tabIdEchelles"));
            descEchelles = JSON.parse(sessionStorage.getItem("tabDescEchelles"));

            $("#myModalLabel").text(designation[sessionStorage.getItem("currentIdEchelle")]);
            $("#idEchelle").val(idEchelles[sessionStorage.getItem("currentIdEchelle")]);
            var numEchelle = $("#idEchelle").val();
            $("#descEchelles").text(descEchelles[sessionStorage.getItem("currentIdEchelle")]);
            createBackgrid(numEchelle);

            var donne = DrawChart(13015369, numEchelle);
            console.log("numEchelle  = " + numEchelle);

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
                    text: designation[sessionStorage.getItem("currentIdEchelle")],
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

            showNotification("Succes", designation[sessionStorage.getItem("currentIdEchelle")] + " est mis à jour avec une valeur " + $("#_resultat").text(), "success", 6000);
            sessionStorage.removeItem("tabValeur");
            sessionStorage.removeItem("tabCodeSousFamille");
            sessionStorage.removeItem("tabCodeFamille");
            sessionStorage.removeItem("nbLigneResponse");
            $("#_resultat").empty();
            $("#rechercher").remove();

            $("#myModal").modal('hide');

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
    var test = 0;
    if (designation === "") {
        $("#_designation_echelle").css("border-color", "red");

    } else {
        $("#_designation_echelle").css("border-color", "#cccccc");
        test++;
    }
    if (valeurMinimale === "") {
        $("#_minimale").css("border-color", "red");
    } else {
        $("#_minimale").css("border-color", "#cccccc");
        test++;
    }
    if (valeurMoyenne === "") {
        $("#_moyenne").css("border-color", "red");
    } else {
        $("#_moyenne").css("border-color", "#cccccc");
        test++;
    }
    if (ValeurMaximale === "") {
        $("#_maximale").css("border-color", "red");
    } else {
        $("#_maximale").css("border-color", "#cccccc");
        test++;
    }
    if (description === "") {
        $("#_description").css("border-color", "red");
    } else {
        $("#_description").css("border-color", "#cccccc");
        test++;
    }
    /* Fin Form ajout echelle  */
    insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description);

    for (var i = 0; i < tabIdDiv.length; i++) {
        var codeFamille = IncCodeFamilleEchelle();
        insertFamilleEchelle(codeFamille, $('#_designation_famille_echelle' + tabIdDiv[i]).val(), codeEchelle, codeAide);
        $('#_div_famille' + tabIdDiv[i]).find('#_div_sous_famille' + tabIdDiv[i]).each(function () {

            console.log("enter");

            //$('#_row_sous_famille' + tabIdDiv[i])
            // tabIdRowSousFamille.push($('#_div_sous_famille' + tabIdDiv[i]).children().children().children().children(".nabil").val());
            // tabIdRowSousFamille.push($('#_div_sous_famille' + tabIdDiv[i]).children().children().children().children(".mahdi").val());
            console.log("ids");
            var ids = $('#_div_sous_famille' + tabIdDiv[i]).children().children().children().children(".form-control ").map(function () {

                return $(this).attr('id');

            });
            //console.log("lentgh"+ids.get(k));
            for (var k = 0; k < ids.length; k = k + 2) {
                insertSousFamille(IncCodeSousFamille(), $('#' + ids.get(k)).val(), codeFamille, $('#' + ids.get(k + 1)).val());
            }

            // var codeSousFamille = IncCodeSousFamille();

            //$('#_div_sous_famille' + tabIdDiv[i]).children().children().children().children(".nabil").css("border-color", "green");
            /* console.log(" napillllllllllllllllll");
             for (var i = 0; i < tabIdRowSousFamille.length; i++) {
             console.log(tabIdRowSousFamille[i]);
             }*/
            // $('#_designation_sous_famille' + tabIdRowSousFamille[i]).css("border-color", "green");
            // $('#_valeur' + tabIdRowSousFamille[i]).css("border-color", "yellow");


        });
    }
    showNotification("Succes", designation + " est ajouté ", "success", 4000);
    $("#myModal-echelle").modal('hide');
    window.location.reload();
    /*    if (test === 5) {
     insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description);
     showNotification("Succes", designation + " est ajouté ", "success", 4000);
     $("#myModal-echelle").modal('hide');
     $("#myModal-famille-echelle").modal('show');
     }
     */
});





function  IncCodeFamilleEchelle() {
    return incrementID("Code_Famille", "Famille_Echelle");
}


function  IncCodeSousFamille() {
    return incrementID("Code_Sous_Famille", "Sous_Famille");
}


var codeSousfamille = IncCodeSousFamille();
var codeFamilleEchelle = IncCodeFamilleEchelle();
var compteur = 0;
var tabIdDiv = [];
var tabIdRowSousFamille = [];
$("#_btn_ajout_famille_echelle").bind("click", function () {

    codeFamilleEchelle++;
    var codeHTML = "";
    codeHTML += '<div id="_div_famille' + codeFamilleEchelle + '">';
    tabIdDiv.push(codeFamilleEchelle);
    console.log("tab");
    for (var i = 0; i < tabIdDiv.length; i++) {
        console.log(tabIdDiv[i]);
    }
    codeHTML += '<div class="jarviswidget jarviswidget-sortable jarviswidget-color-blue" id="wid-id-1" data-widget-editbutton="false" data-widget-custombutton="false" role="widget" data-widget-attstyle="jarviswidget-color-blue">';
    codeHTML += '<header role="heading">';
    codeHTML += '<div class="jarviswidget-ctrls" role="menu">';
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerDivFamille(' + codeFamilleEchelle + ');" class="button-icon jarviswidget-toggle-btn"  rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:#E60000;"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '<span class="widget-icon">';
    codeHTML += '<i class="fa fa-edit"></i>';
    codeHTML += '</span>';
    codeHTML += '<h2>Ajouter famille échelle</h2>';
    codeHTML += '</header>';
    codeHTML += '<div class="row">';
    codeHTML += '<div class="col-md-12">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<label for="designation">Designation *</label>';
    codeHTML += '<input type="text" name="designation" id="_designation_famille_echelle' + codeFamilleEchelle + '" class="form-control" placeholder="Designation"  required="true">';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="jarviswidget jarviswidget-sortable jarviswidget-color-blue" id="wid-id-1" data-widget-editbutton="false" data-widget-custombutton="false" role="widget" data-widget-attstyle="jarviswidget-color-blue">';
    codeHTML += '<header role="heading">';
    codeHTML += '<div class="jarviswidget-ctrls" role="menu">';
    codeHTML += '<a href="javascript:void(0);" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="fa fa-minus"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '<span class="widget-icon">';
    codeHTML += '<i class="fa fa-edit">';
    codeHTML += '</i>';
    codeHTML += '</span>';
    codeHTML += '<h2>Ajouter sous famille échelle</h2>';
    codeHTML += '<span class="jarviswidget-loader" style="display: none;">';
    codeHTML += '<i class="fa fa-refresh fa-spin">';
    codeHTML += '</i>';
    codeHTML += '</span>';
    codeHTML += '</header>';
    codeHTML += '<div id="_div_sous_famille' + codeFamilleEchelle + '">';
    codeHTML += '<div id="_row_sous_famille' + compteur + '">';
    codeHTML += '<div class="col-md-5">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<label for="designation">Designation sous famille*</label>';
    codeHTML += '<input type="text" name="designation" id="_designation_sous_famille' + compteur + '" class="form-control nabil" placeholder="Designation"  required="true">';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="col-md-5">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<label for="valeur">Valeur *</label>';
    codeHTML += '<input type="number" name="valeur" id="_valeur' + compteur + '" class="form-control mahdi" placeholder="Valeur"  required="true">';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="col-md-1">';
    codeHTML += '<div class="form-group">';
    /*tabIdRowSousFamille.push(compteur);
     console.log("tab id row sous famille");
     for (var j = 0; j < tabIdRowSousFamille.length; j++) {
     console.log(tabIdRowSousFamille[j]);
     }*/
    compteur++;
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerRowSousFamille(' + compteur + ');" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:#E60000;margin-top: 32px;margin-left: 5px;"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="col-md-1">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<button type="button" class="btn btn-default btn-sm" onClick="createCallbackEchelle(' + codeFamilleEchelle + ')" id="_btn_ajout_nouvelle_sous_famille' + codeSousfamille + '">';
    codeHTML += '<i class="glyphicon glyphicon-plus-sign" style="color:#456b7b;margin-top: 32px;margin-left: 5px;"></i>';
    codeHTML += '</button>';
    codeHTML += '</div>';
    codeHTML += '</div>';

    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    $("#_content_Famille").append(codeHTML);

    // $(document).ready(function () {
    //     $("#_btn_ajout_nouvelle_sous_famille" + codeSousfamille).unbind("click");
    //     $('#_btn_ajout_nouvelle_sous_famille' + codeSousfamille).click(createCallbackEchelle());
    // });

    // $('#_btn_ajout_nouvelle_sous_famille' + codeSousfamille).click(createCallbackEchelle());




});

function SupprimerRowSousFamille(compteur) {

    compteur--;
    /* for (var i = 0; i < tabIdRowSousFamille.length; i++) {
     if (tabIdRowSousFamille[i] === compteur) {
     tabIdRowSousFamille.splice(tabIdRowSousFamille.indexOf(compteur), 1);
     
     }
     }
     console.log("tabIdRowSousFamille del");
     for (var j = 0; j < tabIdRowSousFamille.length; j++) {
     console.log(tabIdRowSousFamille[j]);
     }
     */
    $("#_row_sous_famille" + compteur).remove();
}



function SupprimerDivFamille(compteurDivFamille) {
    for (var i = 0; i < tabIdDiv.length; i++) {
        if (tabIdDiv[i] === compteurDivFamille) {
            tabIdDiv.splice(tabIdDiv.indexOf(compteurDivFamille), 1);

        }
    }
    console.log("tabafter del");
    for (var i = 0; i < tabIdDiv.length; i++) {
        console.log(tabIdDiv[i]);
    }

    $("#_div_famille" + compteurDivFamille).remove();
}

function createCallbackEchelle(codeFamilleE) {

    var codeHTML = "";
    codeHTML += '<div id="_row_sous_famille' + compteur + '">';
    codeHTML += '<div class="col-md-5">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<label for="designation">Designation sous famille*</label>';
    codeHTML += '<input type="text" name="designation" id="_designation_sous_famille' + compteur + '" class="form-control nabil" placeholder="Designation"  required="true">';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="col-md-5">';
    codeHTML += '<div class="form-group">';
    codeHTML += '<label for="valeur">Valeur *</label>';
    codeHTML += '<input type="number" name="valeur" id="_valeur' + compteur + '" class="form-control mahdi" placeholder="Valeur"  required="true">';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="col-md-1">';
    codeHTML += '<div class="form-group">';
    /*  tabIdRowSousFamille.push(compteur);
     console.log("Apres insert tab id row sous famille");
     for (var j = 0; j < tabIdRowSousFamille.length; j++) {
     console.log(tabIdRowSousFamille[j]);
     }*/
    compteur++;
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerRowSousFamille(' + compteur + ');" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:#E60000;margin-top: 32px;margin-left: 5px;"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';


    $("#_div_sous_famille" + codeFamilleE).append(codeHTML);

}




