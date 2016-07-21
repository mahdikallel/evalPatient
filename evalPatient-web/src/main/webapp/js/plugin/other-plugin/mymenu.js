$(function () {
    $("#_echelle").unbind("click");
    $("#_echelle").bind("click", function (e)
    {
        $("nav li").removeClass("active");
        $(this).parents("li").addClass("active");
        $(".breadcrumb").html($(this).attr("title"));
        $("#content").empty();
        $("#content").append('<iframe id="iframe_cloturee" src="../body_page/echelle.jsp" width="100%" height="3000" frameborder="0" style="display:none" onload="this.style.display = \'block\';"/>');
        window.parent.$(".footerParent").hide();
        window.parent.$("#curseur_pancarte").hide();
    });
});