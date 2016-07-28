<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="css_declare.jsp"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div style="float:left;margin-right: 20px;"><img class="_avatar_patient" src="../img/avatars/male.png" alt="me" style="height: 40px; width: 40px; margin-top: 3px; margin-left: 3px;vertical-align: top" ></div>
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
         </div>
        <div class="row">
            <div class="col-md-12">
                <div class="jarviswidget jarviswidget-color-greenLight jarviswidget-sortable" id="wid-id-3" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" role="widget">

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
