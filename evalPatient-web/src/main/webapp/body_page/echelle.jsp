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



                        <div id="container" style="width: 800px; height: 500px;margin-left: 400px">
                            <div id="_chose_echelle" style="float:left;">
                            </div>  

                        </div>

                        <div id="_eval" style="right: 0; top: 0; position: absolute;margin-top: 25px;margin-right: 20px;">
                            <!-- Button to launch  modal evaluation -->
                            <button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".bs-example-modal-lg"  >
                                <span class="glyphicon glyphicon-plus-sign"></span> 
                            </button>
                            
                            
                        </div>
                        <!-- Button to launch  modal add echelle -->
                         <button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".bs-example-modal-add" >
                                <span class="glyphicon glyphicon-plus-sign"></span> 
                            </button>
                       
                    </div>

                    <!-- end widget div -->
                </div>


            </div>
        </div>

        <!--Modal add -->
        <div class="modal fade bs-example-modal-add" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog">  
                <div class="modal-content"><div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            ×
                        </button>
                        <h4 class="modal-title" id="myModalLabel2">Article Post</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Title" required="">
                                </div>
                                <div class="form-group">
                                    <textarea class="form-control" placeholder="Content" rows="5" required=""></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="category"> Category</label>
                                    <select class="form-control" id="category">
                                        <option>Articles</option>
                                        <option>Tutorials</option>
                                        <option>Freebies</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="tags"> Tags</label>
                                    <input type="text" class="form-control" id="tags" placeholder="Tags">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="well well-sm well-primary">
                                    <form class="form form-inline " role="form">
                                        <div class="form-group">
                                            <input type="text" class="form-control" value="" placeholder="Date" required="">
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control">
                                                <option>Draft</option>
                                                <option>Published</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-success btn-sm">
                                                <span class="glyphicon glyphicon-floppy-disk"></span> Save
                                            </button>
                                            <button type="button" class="btn btn-default btn-sm">
                                                <span class="glyphicon glyphicon-eye-open"></span> Preview
                                            </button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">
                            Cancel
                        </button>
                        <button type="button" class="btn btn-primary">
                            Post Article
                        </button>
                    </div></div>  
            </div>  
        </div>
         <!--Fin modal Add-->
        
        
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
                                            <div class="progress progress-striped active no-margin">
                                                <div class="progress-bar progress-bar-primary" role="progressbar" id="_resultat" ></div>
                                            </div> 
                                        </div>
                                    </div>

                                </div>
                            </li>
                        </center>
                        <br>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="_insert_eval" data-dismiss="modal" >Save changes</button>
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
