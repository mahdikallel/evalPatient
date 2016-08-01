/* global Backbone, Backgrid, date */

$(function () {


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
    for (var i = 0; i < list.length; i++)
    {
        $("#buttons").append('<a href="javascript:void(0);" id="_button' + i + '" class="btn btn-labeled btn-warning" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px">' + list[i].designation + '</a><br>');
        designation[i] = list[i].designation;
        idEchelles[i] = list[i].codeEchelle;
        descEchelles[i] = list[i].description;
    }



    $(document).ready(function () {
        for (var i = 0; i < list.length; i++) {
            $("#_button" + i).unbind("click");
            $('#_button' + i).click(createCallback(i));

        }
    });


    function createCallback(i) {

        return function () {
            $("#myModalLabel").text(designation[i]);
            $("#idEchelle").val(idEchelles[i]);
            var numEchelle = $("#idEchelle").val();
            $("#rechercher").remove();
            $("#descEchelles").text(descEchelles[i]);
            createBackgrid(numEchelle);
//9dima
            var donne = DrawChart(13015369,numEchelle);

            var date = [];
            var valeur = [];
            for (var j = 0; j < donne.length; j++) {
                date.push(donne[j].date);
                valeur.push(donne[j].valeur);
            }
            //alert(data.length);
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
                        data: valeur
                    }]
            });
            //9dima


        };
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

        insertResultatEvaluation('13015369', tabCodeSousFamille[i], tabValeur[i],getCurrentDateTime());
    }
    $("#_resultat").text("");
    $("#_resultat").width("0%");
    sessionStorage.removeItem("tabValeur");
    sessionStorage.removeItem("tabCodeSousFamille");
    sessionStorage.removeItem("tabCodeFamille");
    showNotification("Succes", "Bien", "success", 4000);

});