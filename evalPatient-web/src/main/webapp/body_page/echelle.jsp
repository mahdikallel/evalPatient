<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="css_declare.jsp"/>
        <title>JSP Page</title>
    </head>
    <body>
        <!--div style="float:left;margin-right: 20px;"><img class="_avatar_patient" src="../img/avatars/male.png" alt="me" style="height: 40px; width: 40px; margin-top: 3px; margin-left: 3px;vertical-align: top" ></div>
        <div style="width: auto;height: 60px;background-color:  ">

            <label class="control-label">Numéro</label>&nbsp;&nbsp;
            <input type="text" id="_numPatient" name="num" class="input-xs" disabled="true">
            <label class="control-label">Nom</label>
            <input type="text" id="_nomPatient" name="nom" class="input-xs" disabled="true" >
            <label class="control-label">Prénom</label>
            <input type="text" id="_prenomPatient" name="prenom" class="input-xs" disabled="true">
            <label class="control-label">Age</label>
            <input type="text" id="_agePatient" name="age" class="input-xs" disabled="true">
            <label class="control-label">Poids</label>
            <input type="text" id="_poidsPatient" name="poids" class="input-xs" disabled="true"><br>
            <label class="control-label">Chambre</label>
            <input type="text" id="_chambrePatient" name="chambre" class="input-xs" disabled="true">
            <label class="control-label">Motif d'admission</label>
            <input type="text" id="_motifAdmission" name="motif" class="input-xs" disabled="true">
        </div-->
        <div class="row">
            <div class="col-md-12">
                <div class="jarviswidget jarviswidget-color-greenLight jarviswidget-sortable" id="wid-id-3" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" role="widget">

                    <header role="heading">
                        <h2><strong>Score</strong> </h2>				
                        <span class="jarviswidget-loader" style="display: none;"><i class="fa fa-refresh fa-spin"></i></span>
                    </header>
                    <!-- widget div-->
                    <div role="content" >
                        <div id="buttons" style="float:left;">

                        </div>



                        <div id="container" style="width: 1000px; height: 500px;margin-left: 200px">
                            <div id="_chose_echelle" style="float:left;">
                            </div>  

                        </div>

                        <div id="_eval" style="right: 0; top: 0; position: absolute;margin-top: 25px;margin-right: 20px;">
                            <!-- Button to launch  modal evaluation -->
                            <button type="button" class="btn btn-default btn-sm" id="launch_eval_modal"  >
                                <span class="glyphicon glyphicon-plus-sign"></span> 
                            </button>


                        </div>

                    </div>

                </div>


            </div>
        </div>

        <!--Modal add echelle -->
        <div class="modal fade bs-example-modal-add-echelle" id="myModal-echelle" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog">  
                <div class="modal-content"><div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            ×
                        </button>
                        <h4 class="modal-title" id="myModalLabel2">Ajout</h4>
                    </div>
                    <div class="modal-body">
                        <div class="jarviswidget jarviswidget-sortable jarviswidget-color-blue" id="wid-id-1" data-widget-editbutton="false" data-widget-custombutton="false" role="widget" data-widget-attstyle="jarviswidget-color-blue">

                            <header role="heading">
                                <div class="jarviswidget-ctrls" role="menu"> 
                                    <a href="javascript:void(0);" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                        <i class="fa fa-minus"></i>
                                    </a> 


                                </div>

                                <span class="widget-icon">
                                    <i class="fa fa-edit">

                                    </i>
                                </span>
                                <h2>Ajouter échelle</h2>				

                                <span class="jarviswidget-loader" style="display: none;">
                                    <i class="fa fa-refresh fa-spin">

                                    </i>
                                </span>
                            </header>

                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="designation">Designation *</label>
                                        <input type="text" name="designation" id="_designation_echelle" class="form-control" placeholder="Designation"  required="true">
                                    </div>


                                </div>


                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="minimale">Valeur minimale *</label>
                                        <input type="number" name="minimale" id="_minimale" class="form-control" placeholder="Valeur minimale" required>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="moyenne">Valeur moyenne *</label>
                                        <input type="number" name="moyenne" id="_moyenne" class="form-control" placeholder="Valeur moyenne" required>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="maximale">Valeur maximale *</label>
                                        <input type="number" name="maximale" id="_maximale" class="form-control" placeholder="Valeur maximale" required>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="description">Description *</label>
                                        <textarea class="form-control" name="description" id="_description" placeholder="Description" rows="5" required=""></textarea>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <br>
                        
                        <div id="_content_Famille">
                        
                        </div>
                        <button type="button" class="btn btn-info btn-sm" id="_btn_ajout_famille_echelle" style="float:right;font-size : 15px;" data-toggle="#jobInfo">
                            <i class="fa fa-plus-circle">&nbsp &nbsp<b> Ajouter famille échelle</b></i>
                        </button>
                        <br>
                        <br>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                Annuler
                            </button>
                            <button type="button" class="btn btn-primary" id="_btn_ajouter_echelle" >
                                Ajouter
                            </button>
                        </div>
                    </div>  
                </div>
            </div>  
        </div>
        <!--Fin modal add echelle-->


        <!--Modal add Famille echelle 
        <div class="modal fade bs-example-modal-add-famille-echelle" id="myModal-famille-echelle" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog">  
                <div class="modal-content"><div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            ×
                        </button>
                        <h4 class="modal-title" id="myModalLabel3">Ajouter Echelle</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="designation">Designation</label>
                                    <input type="text" name="designation" id="_designation" class="form-control" placeholder="Designation" required>
                                </div>
                            </div>


                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="minimale">Valeur minimale</label>
                                    <input type="number" name="minimale" id="_minimale" class="form-control" placeholder="Valeur minimale" required>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="moyenne">Valeur moyenne</label>
                                    <input type="number" name="moyenne" id="_moyenne" class="form-control" placeholder="Valeur moyenne" required>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="maximale">Valeur maximale</label>
                                    <input type="number" name="maximale" id="_maximale" class="form-control" placeholder="Valeur maximale" required>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="description">Description</label>
                                    <textarea class="form-control" name="description" id="_description" placeholder="Description" rows="5" required=""></textarea>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">
                            Cancel
                        </button>
                        <button type="button" class="btn btn-primary" id="_btn_ajouter_echelle">
                            Ajouter
                        </button>
                    </div></div>  
            </div>  
        </div>
        <!--Fin modal add Famille echelle-->


        <!-- Modal evaluation -->
        <div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel"></h4>
                        <input type="hidden" id="idEchelle" >
                    </div>
                    <div class="modal-body">
                        <div class="alert alert-info fade in">

                            <i class="fa-fw fa fa-info"></i>
                            <strong>Info!</strong>
                            <div id="descEchelles">

                            </div>
                        </div>
                        <div id="_grid_eval">

                        </div>

                    </div>
                    <div class="modal-footer">
                        <center>
                            <li class="dd-item" data-id="11">
                                <div class="dd-handle">

                                    <div class="row">
                                        <div class="col-xs-8">
                                            TOTAL
                                            <span class="font-xs text-muted">

                                            </span>
                                        </div>
                                        <div class="col-xs-4">
                                           
                                                <div class="progress-bar progress-bar-primary" aria-valuemin="0" aria-valuemax="20" role="progressbar" id="_resultat" ></div>
                                            
                                        </div>
                                    </div>

                                </div>
                            </li>
                        </center>
                        <br>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
                        <button type="button" class="btn btn-primary" id="_insert_eval"  >Sauvgarder </button>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal evaluation -->



        <jsp:include page="js_declare.jsp"/>
        <script src="../body_page_js/echelle_function.js?version=<%=session.getAttribute("versionJS")%>"></script>
        <script src="../body_page_js/echelle.js?version=<%=session.getAttribute("versionJS")%>"></script>

    </body>
</html>
