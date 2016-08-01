/* global Backbone, Backgrid */
/*Methodes utilisées (core)
 * getAllEchelle()
 * GetResultByNumDossAndCodeEchelle(numEchlle,numDossier)
 * GetListReponseParEchelle(numEchelle)
 * insertResultatEvaluation(numDos, codeSousFamille, valeur, dateSys)
 * 
 * */
$(function () {

    // $("#_chose_echelle").append('<div class="alert alert-info alert-block"><a class="close" data-dismiss="alert" href="#"></a><h4 class="alert-heading">Info!</h4>Best check yo self, youre not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</div>');
    //'<div class="alert alert-info alert-block"><a class="close" data-dismiss="alert" href="#"></a><h4 class="alert-heading">Info!</h4>Best check yo self, youre not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</div>'
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
        series: [{
                data: []
            }]
    });

    var list = getAllEchelle();
    $("#content").empty();
    var designation = [];
    var idEchelles = [];
    var descEchelles = [];
    $("#buttons").append('<button type="button"  class="btn  txt-color-white" data-toggle="modal" data-target=".bs-example-modal-add" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px;background-color:#71843f">Ajouter Echelle  </button><br>');
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

            var designation = [];
            var idEchelles = [];
            var descEchelles = [];

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
                    categories: date


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
                series: [{
                        name: 'Total',
                        data: valeur

                    }]
            });
        }
    }

});

$("#_insert_eval").unbind("click");
$("#_insert_eval").bind("click", function () {

    var tabValeur = [];
    var tabCodeSousFamille = [];
    var tabCodeFamille = [];

    tabValeur = JSON.parse(sessionStorage.getItem("tabValeur"));
    tabCodeSousFamille = JSON.parse(sessionStorage.getItem("tabCodeSousFamille"));
    tabCodeFamille = JSON.parse(sessionStorage.getItem("tabCodeFamille"));

    for (var i = 0; i < tabValeur.length; i++) {
        $("[id=" + tabCodeFamille[i] + "]").css("background-color", "White");
        insertResultatEvaluation('13015369', tabCodeSousFamille[i], tabValeur[i], getCurrentDateTime());
    }
    var designation = [];
    var idEchelles = [];
    var descEchelles = [];

    designation = JSON.parse(sessionStorage.getItem("tabDesignation"));
    idEchelles = JSON.parse(sessionStorage.getItem("tabIdEchelles"));
    descEchelles = JSON.parse(sessionStorage.getItem("tabDescEchelles"));

    $("#myModalLabel").text(designation[sessionStorage.getItem("currentIdEchelle")]);
    $("#idEchelle").val(idEchelles[sessionStorage.getItem("currentIdEchelle")]);
    var numEchelle = $("#idEchelle").val();
    $("#descEchelles").text(descEchelles[sessionStorage.getItem("currentIdEchelle")]);
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
            text: designation[sessionStorage.getItem("currentIdEchelle")],
            x: -20
        },
        xAxis: {
            title: {
                text: 'Date'
            },
            categories: date


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
        series: [{
                name: 'Total',
                data: valeur

            }]
    });

    showNotification("Succes", designation[sessionStorage.getItem("currentIdEchelle")] + " est mis à jour avec une valeur " + $("#_resultat").text(), "success", 6000);
    sessionStorage.removeItem("tabValeur");
    sessionStorage.removeItem("tabCodeSousFamille");
    sessionStorage.removeItem("tabCodeFamille");
    $("#_resultat").empty();
    $("#rechercher").remove();


});

$('#exampleModal').on('show.bs.modal', function (event) {
    var button = $(event.relatedTarget) // Button that triggered the modal
    var recipient = button.data('whatever') // Extract info from data-* attributes
    // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
    // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
    var modal = $(this)
    modal.find('.modal-title').text('New message to ' + recipient)
    modal.find('.modal-body input').val(recipient)
})