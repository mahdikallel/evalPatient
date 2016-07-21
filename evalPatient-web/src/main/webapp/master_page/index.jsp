<%
  /*  String User = (String) session.getAttribute("user");
    if (User == null || User.equalsIgnoreCase("null")) {
        out.println("<script>window.location.href='../index.jsp';</script>");
    }*/
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinisys -- DMI</title>
        <meta name="description" content="">
        <meta name="author" content="">

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <jsp:include page="../body_page/css_declare.jsp"/>

        <style>
            @media all and (max-device-width: 768px) 
            {
                #width_image
                {
                    width: 90% !important;

                }
            }

            @media screen and (min-width: 1200px) 
            {
                #width_image
                {
                    width: 50% !important;
                }
            }

            @media print 
            {
                .no_print
                {
                    display:none;
                }
                .print
                {
                    display:block;
                }

            }
            .minified nav ul>li>a {
                padding: 15px 11px;
                display: block;
                cursor: pointer;
            }
            .minified nav>ul>li {
                border-bottom: 1px solid #1A1817;
                border-top: 1px solid #525151;
                cursor: pointer;
            }
            body{
                cursor: pointer;
            }
        </style>

    </head>
    <body class="minified fixed-header fixed-navigation no_print" oncontextmenu="return false;">

        <!-- #HEADER -->
       

        <aside id="left-panel">
            <nav>
                <ul>
                    <li class="active"  style=" height: 40px;     cursor: pointer;">
                        <a href="#"  title="Echelle" id="_echelle">
                            <i class="fa fa-lg fa-fw fa-line-chart"></i> 
                            <span class="menu-item-parent">Echelle</span>
                        </a>
                    </li>
                    
                    <li class="active"  style=" height: 40px;     cursor: pointer;">
                        <a href="#"  title="Liste des patients" id="_liste_patients">
                            <i class="fa fa-lg fa-fw fa-list"></i> 
                            <span class="menu-item-parent">Liste des patients</span>
                        </a>
                    </li>
                    <li class=""  style=" height: 40px;    cursor: pointer; ">
                        <a href="#"  title="Dossier Malade" id="_interface_acceuil">
                            <i class="fa fa-lg fa-fw fa-home"></i> 
                            <span class="menu-item-parent">Acceuil</span>
                        </a>
                    </li>
                    <li class=""  style=" height: 40px;     cursor: pointer;">
                        <a href="#"  title="Feuille de Rea" id="_feuil_rea">
                            <i class="fa fa-lg fa-fw fa-file"></i> 
                            <span class="menu-item-parent">Feuille de Soins</span>
                        </a>
                    </li>
                   
                </ul>
            </nav>
            <span class="minifyme" data-action="minifyMenu"> 
                <i class="fa fa-arrow-circle-left hit"></i> 
            </span>

        </aside>
        <!-- END NAVIGATION -->

        <!-- #MAIN PANEL -->
        <div id="main" role="main">

            <!-- RIBBON -->
            <div id="ribbon">
                <div style="display: inline;">
                    <span class="ribbon-button-alignment"> 
                        <span id="_refresh" class="btn btn-ribbon"rel="tooltip" data-placement="bottom" data-original-title="Actualiser" ><i class="fa fa-refresh"></i></span> 
                    </span>
                    <strong>
                        <ol class="breadcrumb"></ol>
                    </strong>
                </div>
            </div>
            <div id="content"></div>
        </div>

        <div id="shortcut">
            <ul>
                <li>
                    <a href="#ajax/inbox.html" class="jarvismetro-tile big-cubes bg-color-blue"> <span class="iconbox"> <i class="fa fa-envelope fa-4x"></i> <span>Mail <span class="label pull-right bg-color-darken">14</span></span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/calendar.html" class="jarvismetro-tile big-cubes bg-color-orangeDark"> <span class="iconbox"> <i class="fa fa-calendar fa-4x"></i> <span>Calendar</span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/gmap-xml.html" class="jarvismetro-tile big-cubes bg-color-purple"> <span class="iconbox"> <i class="fa fa-map-marker fa-4x"></i> <span>Maps</span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/invoice.html" class="jarvismetro-tile big-cubes bg-color-blueDark"> <span class="iconbox"> <i class="fa fa-book fa-4x"></i> <span>Invoice <span class="label pull-right bg-color-darken">99</span></span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/gallery.html" class="jarvismetro-tile big-cubes bg-color-greenLight"> <span class="iconbox"> <i class="fa fa-picture-o fa-4x"></i> <span>Gallery </span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/profile.html" class="jarvismetro-tile big-cubes selected bg-color-pinkDark"> <span class="iconbox"> <i class="fa fa-user fa-4x"></i> <span>My Profile </span> </span> </a>
                </li>
            </ul>
        </div>

        <div class="print" style="display: none;">Veuillez utiliser le bouton d'impression !</div>

         
        <jsp:include page="../body_page/js_declare.jsp"/>
        
        <script src="../js/plugin/other-plugin/mymenu.js"></script>
        <script src="../js/plugin/other-plugin/summernote.min.js"></script>

        <script>

                                var video;
                                var dataURL;
                                var localStream;

                                function setup() {
                                    navigator.myGetMedia = (navigator.getUserMedia ||
                                            navigator.webkitGetUserMedia ||
                                            navigator.mozGetUserMedia ||
                                            navigator.msGetUserMedia);
                                    navigator.myGetMedia({video: true}, connect, error);
                                }

                                function connect(stream) {
                                    video = document.getElementById("video");
                                    video.src = window.URL ? window.URL.createObjectURL(stream) : stream;
                                    video.play();
                                    localStream = stream;
                                }

                                function error(e) {
                                    console.log(e);
                                }

                                function captureImage() {
                                    var canvas = document.createElement('canvas');
                                    canvas.id = 'hiddenCanvas';
                                    //add canvas to the body element
                                    document.body.appendChild(canvas);
                                    //add canvas to #canvasHolder
                                    document.getElementById('canvasHolder').appendChild(canvas);
                                    var ctx = canvas.getContext('2d');
                                    canvas.width = video.videoWidth / 4;
                                    canvas.height = video.videoHeight / 4;
                                    ctx.drawImage(video, 0, 0, canvas.width, canvas.height);
                                    //save canvas image as data url
                                    dataURL = canvas.toDataURL();
                                    //set preview image src to dataURL
                                    document.getElementById('preview').src = dataURL;
                                    // place the image value in the text box
                                    document.getElementById('imageToForm').value = dataURL;
                                    $("#canvasHolder").hide();
                                }

                                // Camera 
                                function uploadImagePatient()
                                {
                                    $("#modal_image_patient").modal('show');
                                    setup();
                                }

                                $('#_valider_image_patient').bind("click", function () {
                                    captureImage();
                                    var image = $("#imageToForm").val();
                                    var numdoss = $("[class~='_num_dossier_patient']").text().split(":")[1].replace(" ", "");
                                    var res = updateImagePatient(numdoss, image);
                                    if (res.indexOf("true") > -1)
                                    {
                                        showNotification("Succés", "Changement d'image effectué avec succés !", "success", 2000);
                                        setTimeout(function () {
                                            location.reload();
                                        }, 2500);
                                    } else
                                        showNotification("Echec !!", "Changement d'image non effectué !", "error", 0);

                                    localStream.stop();
                                    video.src = "";
                                    document.getElementById('preview').src = "";
                                });

                                $('#modal_image_patient').on('hidden.bs.modal', function () {
                                    localStream.stop();
                                    video.src = "";
                                    document.getElementById('preview').src = "";
                                });
        </script>
    </body>
</html>