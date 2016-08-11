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

            }
            if (this.somme === sessionStorage.getItem("moyVal")) {
                $("#_resultat").css('background-color', "#3EA502");
                alert("egal");
            }
            if (this.somme > sessionStorage.getItem("moyVal") && this.somme < sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#EDA909");
            }
            if (this.somme === sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#EA3519");
            }
            if (this.somme > sessionStorage.getItem("maxVal")) {
                $("#_resultat").css('background-color', "#951E1E");
            }

            $("#_resultat").width(this.somme + "%");

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
    codeHTML += '<div class="jarviswidget jarviswidget-sortable jarviswidget-color-red " id="wid-id-1" data-widget-editbutton="false" data-widget-custombutton="false" role="widget" data-widget-attstyle="jarviswidget-color-blue">';
    codeHTML += '<header role="heading">';
    codeHTML += '<div class="jarviswidget-ctrls" role="menu">';
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerDivFamille(' + codeFamilleEchelle + ');" class="button-icon jarviswidget-toggle-btn"  rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:white;"></i>';
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
    compteur++;
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerRowSousFamille(' + compteur + ');" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:#E60000;margin-top: 32px;margin-left: 5px;"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '<div class="row" style="height: 36px;padding-top: 2px;padding-bottom: 35px;">';
    codeHTML += '<button type="button" style="margin-left: 367px;margin-top: 0px;width: 170px;" class="btn btn-default btn-sm" onClick="createCallbackEchelle(' + codeFamilleEchelle + ')" id="_btn_ajout_nouvelle_sous_famille' + codeSousfamille + '">';
    codeHTML += '<i class="glyphicon glyphicon-plus-sign" style="color:#456b7b;margin-top: 3px;margin-left: 2px;">&nbsp<b>Ajouter Sous Famille</b></i>';
    codeHTML += '</button>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    $("#_content_Famille").append(codeHTML);
});

function SupprimerRowSousFamille(compteur) {

    compteur--;
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
    compteur++;
    codeHTML += '<a href="javascript:void(0);" onClick="SupprimerRowSousFamille(' + compteur + ');" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">';
    codeHTML += '<i class="glyphicon glyphicon-trash" style="color:#E60000;margin-top: 32px;margin-left: 5px;"></i>';
    codeHTML += '</a>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    codeHTML += '</div>';
    $("#_div_sous_famille" + codeFamilleE).append(codeHTML);
}
