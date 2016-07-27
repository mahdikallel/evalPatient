/* global Backbone, Backgrid */

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
    for (var i = 0; i < list.length; i++)
    {
        $("#buttons").append('<a href="javascript:void(0);" id="_button' + i + '" class="btn btn-labeled btn-warning" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px">' + list[i].designation + '</a><br>');
        designation[i] = list[i].designation;
        idEchelles[i] = list[i].codeEchelle;
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
            createBackgrid(numEchelle);

            var data = DrawChart();
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
                        name: 'Population',
                        data: [
                            [data[0].item[1], data[0].item[0]],
                            [data[0].item[1], data[0].item[0]],
                            [data[0].item[1], data[0].item[0]],
                            [data[1].item[1], data[1].item[0]]




                        ],
                        dataLabels: {
                            enabled: true,
                            rotation: -90,
                            color: '#FFFFFF',
                            align: 'right',
                            format: '{point.y:.1f}', // one decimal
                            y: 8, // 10 pixels down from the top
                            style: {
                                fontSize: '8px',
                                fontFamily: 'Verdana, sans-serif'
                            }
                        }
                    }]
            });
        }
    }

});



$("#_insert_eval").unbind("click");
$("#_insert_eval").bind("click", function () {

    var tabValeur = [];
    var tabCodeSousFamille = [];

    tabValeur = JSON.parse(sessionStorage.getItem("tabValeur"));
    tabCodeSousFamille = JSON.parse(sessionStorage.getItem("tabCodeSousFamille"));

    for (var i = 0; i < tabValeur.length; i++) {
        insertResultatEvaluation('111111', tabCodeSousFamille[i], tabValeur[i]);
    }
    sessionStorage.removeItem("tabValeur");
    sessionStorage.removeItem("tabCodeSousFamille");

    showNotification("Succes", "Bien", "success", 4000);

});