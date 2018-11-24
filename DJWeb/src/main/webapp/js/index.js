/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer', 'element'],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;

    //获取用户信息
    if (sessionStorage.getItem("UID") != null){
        document.getElementById("no_user").style.display = "none";
        document.getElementById("user").style.display = "inline";
        document.getElementById("NickName").innerHTML = sessionStorage.getItem("NickName");
    }

    exports('index', {});
});