/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['element'],function (exports) {
    //var layer = layui.layer;
    //var form = layui.form;
    var $ = layui.$;
    var element = layui.element;

    $.ajax({
        url:"http://localhost:8080/islogin.do",
        type:"get",
        datatype:"json",
        success:function (message) {
            if (message.code == "0"){
                elclass = document.getElementById("username");
                elclass.innerHTML = message.username;
            }else{
                //var elclass = document.getElementById("login_in");
                //elclass.style.display = "none";
            }
        },
        error:function (message) {
            //var elclass = document.getElementById("login_in");
            //elclass.style.display = "none";
        }
    });

    /*var eid = document.getElementById("public-dev");
    var vprod = "";
    for (var i = 0; i < 3; i++){
        var vpc = "<div class=\"product-list\">";
        vpc += "<div class=\"product-content\">";
        vpc += "<div class=\"product-name\">";
        vpc += "</div>";
        vpc += "</div>";
        vpc += "</div>";
        vprod += vpc;
    }
    eid.innerHTML = vprod;*/

    exports('develop', {});
});