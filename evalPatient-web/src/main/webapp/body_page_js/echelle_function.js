/* global Backbone, Backgrid, codeSousFamille */

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

function DrawChart(numDos, numEchelle)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=consult&function=GetResultByNumDossAndCodeEchelle&numEchelle=" + numEchelle + "&numDos=" + numDos + "",
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
            editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
            renderable: false,
            cell: Backgrid.StringCell.extend({
                className: 'string-cell'
            })

        }, {
            name: "codeSousFamille",
            label: "CodeSousFamille",
            editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
            renderable: false,
            cell: Backgrid.StringCell.extend({
                className: 'string-cell'
            })

        }
    ];
    /*, {
     , {
     name: "",
     label: "CodeSousFamille",
     editable: false, // By default every cell in a column is editable, but *ID* shouldn't be
     cell: Backgrid.Cell.extend({
     template: _.template('<button class="btn-danger">Delete</button>'),
     events: {
     click: "Click"
     
     },
     render: function () {
     this.$el.html(this.template());
     this.delegateEvents();
     return this;
     },
     Click: function () {
     alert("ffff");
     }
     })
     
     }
     
     
     
     */
    var nbLigneResponse = 0;
    FocusableRow = Backgrid.Row.extend({
        tabCodeFamille: [],
        tabCodeSousFamille: [],
        tabValeur: [],
        somme: 0,
        highlightColor: "lightBlue",
        LowColor: "White",
        gray: "#EFECCA",
        events: {
            click: "Click",
            render: "render"
        },
        Click: function () {
            // console.log(this.tabCodeFamille.length);

            var k = 0;
            var pos = -1;
            var codeFamille = this.model.get("codeFamille");
            var codeSousFamille = this.model.get("codeSousFamille");
            var valeur = this.model.get("valeur");

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


            } else {
                for (var i = 0; i <= this.tabCodeSousFamille.length; i++) {
                    if (this.tabCodeFamille[i] === codeFamille) {
                        this.tabCodeSousFamille[pos] = codeSousFamille;
                        this.tabValeur[pos] = valeur;
                    }
                }
            }
            var color = this.el.style.backgroundColor;
            this.somme = 0;
            for (var i = 0; i < this.tabValeur.length; i++) {
                this.somme = parseInt(this.somme) + parseInt(this.tabValeur[i]);
                if (pos === -1) {
                    this.el.id = this.model.get("codeFamille");
                } else {
                    this.el.id = this.tabCodeFamille[pos];
                    $("[id=" + this.tabCodeFamille[pos] + "]").css("background-color", color);
                }
                this.el.style.backgroundColor = this.highlightColor;
            }
            $("#_resultat").text(this.somme);
            sessionStorage.setItem("curVal", this.somme);
            if (this.somme >= sessionStorage.getItem("minVal") && this.somme < sessionStorage.getItem("moyVal")) {
                $("#_resultat").css('background-color', "#90E95D");

            }else
            if (this.somme === sessionStorage.getItem("moyVal")) {
                $("#_resultat").css('background-color', "#3EA502");
                alert("egal");
            }else
            if (this.somme > sessionStorage.getItem("moyVal") && this.somme < sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#EDA909");
            }else
            if (this.somme === sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#EA3519");
            }else
            if (this.somme > sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#951E1E");
            }
            $("#_resultat").width(this.somme + "%");

            //if(sessionStorage.getItem("maxVal")!==null){
            // refreshBar();
            // }


            sessionStorage.setItem("tabValeur", JSON.stringify(this.tabValeur));
            sessionStorage.setItem("tabCodeSousFamille", JSON.stringify(this.tabCodeSousFamille));
            sessionStorage.setItem("tabCodeFamille", JSON.stringify(this.tabCodeFamille));
        },
        render: function () {
            FocusableRow.__super__.render.apply(this, arguments);

            if (parseInt(this.model.get("codeFamille")) % 2 === 0) {
                this.el.style.backgroundColor = this.LowColor;
            } else {
                this.el.style.backgroundColor = this.gray;

            }
            if (this.model.get("famille") !== "") {
                nbLigneResponse++;
            }
            sessionStorage.setItem("nbLigneResponse", nbLigneResponse);


            return this;
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

function insertResultatEvaluation(numDos, codeSousFamille, valeur, dateSys)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=insertResultatEvaluation&numDos=" + numDos + "&codeSousFamille='" + codeSousFamille + "'&valeur=" + valeur + "&dateSys=" + dateSys,
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

function getCurrentDateTime() {
    var today = new Date();
    var dd = today.getDate();
    var mm = today.getMonth() + 1; //January is 0!
    var yyyy = today.getFullYear();
    var hh = today.getHours();
    var mmm = today.getMinutes();
    var ss = today.getSeconds();
    var mss = '000';

    if (dd < 10) {
        dd = '0' + dd;
    }

    if (mm < 10) {
        mm = '0' + mm;
    }

    today = yyyy + '-' + dd + '-' + mm + ' ' + hh + ':' + mmm + ':' + ss + '.' + mss;

    return today;
}

function insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=insertEchelle&codeEchelle='" + codeEchelle + "'&designation='" + designation + "'&valeurMinimale=" + valeurMinimale + "&valeurMoyenne=" + valeurMoyenne + "&ValeurMaximale=" + ValeurMaximale + "&description='" + description + "'",
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

function incrementID(code, tableName)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=incrementID&code=" + code + "&tableName=" + tableName + "",
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


function insertSousFamille(codeSousFamille, designation, codeFamille, valeur)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=insertSousFamille&codeSousFamille='" + codeSousFamille + "'&designation='" + designation + "'&codeFamille='" + codeFamille + "'&valeur=" + valeur + "",
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


function insertFamilleEchelle(codeFamilleEchelle, designation, codeEchelle, codeAide)
{
    var reponse;
    $.ajax({
        url: "../Echelle?type=update&function=insertFamilleEchelle&codeFamilleEchelle='" + codeFamilleEchelle + "'&designation='" + designation + "'&codeEchelle='" + codeEchelle + "'&codeAide='" + codeAide + "'",
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


/*function norm(value, min, max) {
    return (value - min) / (max - min);
}

function lerp(norm, min, max) {
    return (max - min) * norm + min;
}

function map(value, sourceMin, sourceMax, destMin, destMax) {
    return lerp(norm(value, sourceMin, sourceMax), destMin, destMax);
}

function isInt(value) {
    return !isNaN(value) &&
            parseInt(Number(value)) === value && !isNaN(parseInt(value, 10));
}

function refreshBar() {
    var min = sessionStorage.getItem("minVal"),
            max = sessionStorage.getItem("maxVal"),
            cur = sessionStorage.getItem("curVal");
    console.log("min" + min + "max" + max + "cur" + cur);


//    var result = map(cur, min, max, 0, 100);
    var result = (cur - min) * 100 / (max - min);
    console.log("result " + result);

    $("#_resultat").text(result + "%").css('width', result + "%");


    //$msg.hide();


}
*/