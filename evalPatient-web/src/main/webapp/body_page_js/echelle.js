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
    for (var i = 0; i < list.length; i++)
    {
        $("#buttons").append('<a href="javascript:void(0);" id="_button' + i + '" class="btn btn-labeled btn-warning" style="width:200px;margin-bottom: 5px;height: 35px;padding-top: 9px">' + list[i].designation + '</a><br>');

        designation[i] = list[i].designation;

    }

    for (var i = 0; i < list.length; i++)
    {
        $("#_button" + i).unbind("click");

        $(document).ready(function () {
            for (var i = 0; i < list.length; i++) {
                $('#_button' + i).click(createCallback(i));
            }
        });
    }

 var data = DrawChart();
// var nabil;
//for(var x in data) { 
//  if (data.hasOwnProperty(x))
//    for(var y in data[x]) {
//      if (data[x].hasOwnProperty(y)) {
//        
//        nabil[x][y];
//      }
//    }
//}
var population = [];
for(var i=0;i<population.length;i++)
{
    for(var j=i;j<i;j++)
    {
        population[i][j];
    }
}


    function createCallback(i) {
        return function () {
           
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
                        data: population
                        
                    }]
            });
        };
    }



});


/* BackGrid*/
var collection;
var gridColumns;
var FocusableRow;
var idElement;
var pagination;
var model = Backbone.Model.extend({});

var Echelles = Backbone.Collection.extend({
    model: model,
    url: "../Echelle?type=consult&function=getAllEchelle",
    mode: "client"
});

collection = new Echelles();

gridColumns = [{
        name: "codeEchelle", // The key of the model attribute
        label: "ID Echelle", // The name to display in the header
        editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
        // Defines a cell type, and ID is displayed as an integer without the ',' separating 1000s.
        cell: Backgrid.StringCell.extend({
            className: 'string-cell-2'
        })
    },
    {
        name: "description",
        label: "Description",
        editable: false,
        // The cell type can be a reference of a Backgrid.Cell subclass, any Backgrid.Cell subclass instances like *id* above, or a string
        cell: Backgrid.StringCell.extend({
            className: 'string-cell-5'
        })
    },
    {
        name: "designation",
        label: "Designation",
        cell: "string" // An integer cell is a number cell that displays humanized integers
    }];


FocusableRow = Backgrid.Row.extend({
    highlightColor: "lightYellow",
    events: {
        click: "Click",
        focusout: "rowLostFocus"
    },
    Click: function () {
        this.el.style.backgroundColor = this.highlightColor;
        /*
         * pour selectionner code ou designation    
         * */
    },
    rowLostFocus: function () {
        delete this.el.style.backgroundColor;
    }
});
idElement = "_grid_eval";
pagination = false;
function createBackgrid(pageableGrid, idElement, gridColumns, collection, pagination, FocusableRow) {
    var columns = gridColumns;

    if (pagination === true) {
        pageableGrid = new Backgrid.Grid({
            emptyText: "Pas de resultat !",
            columns: columns,
            row: FocusableRow,
            collection: collection,
            footer: Backgrid.Extension.Paginator.extend({
                template: _.template('<tr><td colspan="<@= colspan @>"><ul class="pagination"><@ _.each(handles, function (handle) { @><li <@ if (handle.className) { @>class="<@= handle.className @>"<@ } @>><a href="#" <@ if (handle.title) {@> title="<@= handle.title @>"<@ } @>><@= handle.label @></a></li><@ }); @></ul></td></tr>')
            }),
            className: 'table table-bordered table-striped table-editable no-margin table-hover',
        });
    } else {
        pageableGrid = new Backgrid.Grid({
            emptyText: "",
            columns: columns,
            row: FocusableRow,
            collection: collection,
            className: 'table table-bordered table-striped table-editable no-margin table-hover',
        });
    }
    $("#" + idElement).html(pageableGrid.render().$el);
    /*
     if (idElement === "_grid_examen_demande_pharm")
     {
     var clientSideFilter = new Backgrid.Extension.ClientSideFilter({
     collection: collection,
     placeholder: "Recherche",
     id: "rechercher",
     fields: ['desart', 'codart'],
     wait: 150
     });
     
     $("#_grid_examen_demande_pharm").before(clientSideFilter.render().el);
     
     document.getElementById("search").focus();
     } else if (idElement === "xxxxxxxx")
     {
     var clientSideFilter = new Backgrid.Extension.ClientSideFilter({
     collection: collection,
     placeholder: "Recherche",
     id: "rechercher",
     fields: ['desart', 'codart'],
     wait: 150
     });
     
     $("#xxxxx").before(clientSideFilter.render().el);
     
     document.getElementById("search").focus();
     } else if (idElement === "_grid_medecin")
     {
     var clientSideFilter = new Backgrid.Extension.ClientSideFilter({
     collection: collection,
     placeholder: "Recherche",
     id: "rechercher",
     fields: ['nomMed', 'codMed', 'libSpec'],
     wait: 150
     });
     
     $("#_grid_medecin").before(clientSideFilter.render().el);
     
     document.getElementById("search").focus();
     }
     
     */


    // document.getElementById("_grid_eval").innerHTML =' code_html';
    alert(pageableGrid.toString());
    return pageableGrid;
}
/* fin  BackGrid*/