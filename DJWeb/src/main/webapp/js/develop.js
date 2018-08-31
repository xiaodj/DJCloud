/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var $ = layui.$;
    //var element = layui.element;

    $.ajax({
        url:"http://localhost:8080/products",
        type:"get",
        datatype:"json",
        success:function (message) {
            if (message.code == 0){
                var htmlID = document.getElementById("pubcount");
                htmlID.innerHTML = message.pubcount;
                htmlID = document.getElementById("pricount");
                htmlID.innerHTML = message.pricount;
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