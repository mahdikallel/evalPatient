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
                    <!-- widget options:
                            usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
                            
                            data-widget-colorbutton="false"	
                            data-widget-editbutton="false"
                            data-widget-togglebutton="false"
                            data-widget-deletebutton="false"
                            data-widget-fullscreenbutton="false"
                            data-widget-custombutton="false"
                            data-widget-collapsed="true" 
                            data-widget-sortable="false"
                            
                    -->
                    <header role="heading">
                        <h2><strong>Score</strong> </h2>				
                        <span class="jarviswidget-loader" style="display: none;"><i class="fa fa-refresh fa-spin"></i></span>
                    </header>
                    <!-- widget div-->
                    <div role="content" >
                        <div id="buttons" style="float:left">
                        </div>
                        <div id="container" style="width: 800px; height: 500px;margin-left: 400px"></div>
                    </div>

                    <!-- end widget div -->
                </div>


            </div>
        </div>


        <jsp:include page="js_declare.jsp"/>
         <script src="../body_page_js/echelle_function.js?version=<%=session.getAttribute("versionJS")%>"></script>
        <script src="../body_page_js/echelle.js?version=<%=session.getAttribute("versionJS")%>"></script>
       
    </body>
</html>
