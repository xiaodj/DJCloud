/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer', 'element'],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;

    //获取用户信息
    if (sessionStorage.getItem("UID") != null){
        var nouser = document.getElementById("no_user");
        nouser.style.display = "none";
        var user = document.getElementById("user");
        user.style.display = "inline";
        $("#NickName").innerHTML = sessionStorage.getItem("NickName");
    }

    exports('index', {});
});