/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var $ = layui.$;
    //var element = layui.element;

    //获取用户所拥有的产品信息
    getProductsInfo($, fn);

    function fn(prodsInfo) {
        if (prodsInfo == "err"){
            layer.msg("net error");
            return false;
        }

        if (prodsInfo.code == 0){
            var htmlID = document.getElementById("pubcount");
            htmlID.innerHTML = prodsInfo.pubcount;
            htmlID = document.getElementById("pricount");
            htmlID.innerHTML = prodsInfo.pricount;

            var vprod = "";
            //公有协议
            htmlID = document.getElementById("pubprod");
            for (var i = 0; i < prodsInfo.pubcount; i++){
                var vpc = "<div class=\"product-list\">";
                vpc += "<div class=\"product-content\">";
                vpc += "<div class=\"product-name\">";
                vpc += "</div>";
                vpc += "</div>";
                vpc += "</div>";
                vprod += vpc;
            }
            htmlID.innerHTML = vprod;
            //私有协议
            vprod = "";
            htmlID = document.getElementById("priprod");
            for (var j = 0; j < prodsInfo.pricount; j++){
                var vpc = "<div class=\"product-list\">";
                vpc += "<div class=\"product-content\">";
                vpc += "<div class=\"product-name\">";
                vpc += "</div>";
                vpc += "</div>";
                vpc += "</div>";
                vprod += vpc;
            }
            htmlID.innerHTML = vprod;

        }else{
            //var elclass = document.getElementById("login_in");
            //elclass.style.display = "none";
        }
    }

    exports('develop', {});
});