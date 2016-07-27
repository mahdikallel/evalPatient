/* global Backbone, Backgrid */


function getAllEchelle()
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=consult&function=getAllEchelle",
        type: 'POST',
        async: false,
        dataType: "json",
        error: function (jqXHR, textStatus, errorThrown)
        {
        },
        success: function (data, textStatus, jqXHR)
        {
            reponse = data;
        }
    });
    return reponse;
}


function DrawChart()
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=consult&function=GetResultByNumDossAndCodeEchelle",
        type: 'POST',
        async: false,
        dataType: "json",
        error: function (jqXHR, textStatus, errorThrown)
        {
        },
        success: function (data, textStatus, jqXHR)
        {
            reponse = data;
        }
    });
    return reponse;
}


function createBackgrid(numEchelle) {
    var echelle = Backbone.Model.extend({});
    var Echelles = Backbone.Collection.extend({
        model: echelle,
        url: "../Echelle?type=consult&function=GetListReponseParEchelle&numEchelle=" + numEchelle + ""
    });
    var echelles = new Echelles();
    var columns = [{
            name: "famille", // The key of the model attribute
            label: "Famille", // The name to display in the header
            editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
            // Defines a cell type, and ID is displayed as an integer without the ',' separating 1000s.
            cell: Backgrid.StringCell.extend({
                className: 'string-cell-6'
            })
        }, {
            name: "sousFamille",
            label: "Sous Famille",
            editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
            // The cell type can be a reference of a Backgrid.Cell subclass, any Backgrid.Cell subclass instances like *id* above, or a string
            cell: Backgrid.StringCell.extend({
                className: 'string-cell-5'
            })
        }, {
            name: "valeur",
            label: "Valeur",
            editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
            // The cell type can be a reference of a Backgrid.Cell subclass, any Backgrid.Cell subclass instances like *id* above, or a string
            cell: Backgrid.StringCell.extend({
                className: 'string-cell-3'
            })
        }, {
            name: "codeFamille",
            label: "CodeFamille",
            editable: true, // By default every cell in a column is editable, but *ID* shouldn't be
            renderable: true,
            cell: Backgrid.StringCell.extend({
                className: 'string-cell'
            })

        }, {
            name: "codeSousFamille",
            label: "CodeSousFamille",
            editable: true, // By default every cell in a column is editable, but *ID* shouldn't be
            renderable: true,
            cell: Backgrid.StringCell.extend({
                className: 'string-cell'
            })

        }];

    
    FocusableRow = Backgrid.Row.extend({
        tabCodeFamille: [],
        tabCodeSousFamille: [],
        tabValeur: [],
        somme: 0,
        highlightColor: "lightBlue",
        LowColor: "White",
        events: {
            click: "Click"
        },
        Click: function () {
            // console.log(this.tabCodeFamille.length);
            var k = 0;
            var test;
            var pos;
            var codeFamille = this.model.get("codeFamille");
            var codeSousFamille = this.model.get("codeSousFamille");
            var valeur = this.model.get("valeur");
            //  var index = this.echelle.indexOf(this.model);
            // var modelAbove = this.echelles.at(index - 1);
            // while (k === 0 && i <= tab.length) {
            for (var i = 0; i <= this.tabCodeFamille.length; i++) {
                if (this.tabCodeFamille[i] === codeFamille) {
                    k = 1;
                    pos = i;
                }
            }
            if (k === 0) {
                this.tabCodeFamille[this.tabCodeFamille.length] = codeFamille;
                this.tabCodeSousFamille[this.tabCodeSousFamille.length] = codeSousFamille;
                this.tabValeur[this.tabValeur.length] = valeur;

                test = true;
                this.el.style.backgroundColor = this.highlightColor;
                console.log("tab de code Famille        {" + this.tabCodeFamille + " }");
                console.log("tab de code Sous Famille   {" + this.tabCodeSousFamille + " }");
                console.log("tab de Valeur              {" + this.tabValeur + " }");
                // console.log("INDEX au BACKGRID             {" + this.index + " }");
            } else {
                for (var i = 0; i <= this.tabCodeSousFamille.length; i++) {
                    if (this.tabCodeFamille[i] === codeFamille) {
                        this.tabCodeSousFamille[pos] = codeSousFamille;
                        this.tabValeur[pos] = valeur;
                    }
                }
                console.log("tab de code Famille             {" + this.tabCodeFamille + " }");
                console.log("tab de code Sous Famille Modif  {" + this.tabCodeSousFamille + " }");
                console.log("tab de Valeur   Modif           {" + this.tabValeur + " }");
                // console.log("INDEX au BACKGRID             {" + this.index + " }");
                this.el.style.backgroundColor = this.LowColor;
                test = true;
            }


            this.somme = 0;
            for (var i = 0; i < this.tabValeur.length; i++) {
                console.log("VALEUR      " + this.tabValeur[i]);

                this.somme = parseInt(this.somme) + parseInt(this.tabValeur[i]);
                console.log("SOMME      " + this.somme);
            }
            $("#_resultat").text(this.somme);
            $("#_resultat").width(this.somme + "%");
            sessionStorage.setItem("tabValeur", JSON.stringify(this.tabValeur));
            sessionStorage.setItem("tabCodeSousFamille", JSON.stringify(this.tabCodeSousFamille));
            /*  if (test) {
             this.el.style.backgroundColor = this.highlightColor;
             } else {
             this.el.style.backgroundColor = this.LowColor;
             }*/

        }
    });
// Initialize a new Grid instance
    var grid = new Backgrid.Grid({
        columns: columns,
        collection: echelles,
        row: FocusableRow,
        className: 'table table-bordered  table-editable no-margin table-hover'

    });
    var clientSideFilter = new Backgrid.Extension.ClientSideFilter({
        collection: echelles,
        placeholder: "Recherche selon famille",
        id: "rechercher",
        fields: ['famille'],
        wait: 150
    });
    $("#_grid_eval").before(clientSideFilter.render().el);
    document.getElementById("search").focus();
    $("#_grid_eval").empty();
// Render the grid and attach the root to your HTML document
    $("#_grid_eval").append(grid.render().el);
// Fetch some countries from the url
    echelles.fetch({reset: true});
}




function insertResultatEvaluation(numDos, codeSousFamille, valeur)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=insert&numDos=" + numDos + "&codeSousFamille=" + codeSousFamille + "&valeur="+ valeur,
        type: 'POST',
        async: false,
        dataType: "json",
        error: function (jqXHR, textStatus, errorThrown)
        {
        },
        success: function (data, textStatus, jqXHR)
        {
            reponse = data;
        }
    });
    return reponse;
}

