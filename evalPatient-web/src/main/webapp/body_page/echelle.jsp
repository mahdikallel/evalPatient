<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="css_declare.jsp"/>
        <title>JSP Page</title>
    </head>
    <body>
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
                        <div id="container" style="width: 800px; height: 500px;margin-left: 400px"></div>

                        <div id="_eval" style="right: 0; top: 0; position: absolute;margin-top: 25px;margin-right: 20px;">
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".bs-example-modal-lg">
                                <span class="glyphicon glyphicon-plus-sign"></span> 
                            </button>
                        </div>
                    </div>

                    <!-- end widget div -->
                </div>


            </div>
        </div>




        <!-- Modal -->
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

                            <!--div class="bar-holder">
                                <div class="progress">
                                    <div class="progress-bar bg-color-teal" id="_resultat" aria-valuetransitiongoal="25" aria-valuenow="25" ></div>
                                </div>
                            </div-->  

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
                        <button type="button" class="btn btn-primary" id="_insert_eval" data-dismiss="modal">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- Fin Modal -->
        <jsp:include page="js_declare.jsp"/>
        <script src="../body_page_js/echelle_function.js?version=<%=session.getAttribute("versionJS")%>"></script>
        <script src="../body_page_js/echelle.js?version=<%=session.getAttribute("versionJS")%>"></script>

    </body>
</html>
