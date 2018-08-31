/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer', 'element'],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;

    //获取用户信息
    getUserInfo($, fn);

    function fn(userInfo) {
        if (userInfo == "err"){
            layer.msg("net error");
            return false;
        }

        if (userInfo.code == 0){
            var nouser = document.getElementById("no_user");
            nouser.style.display = "none";
            var user = document.getElementById("user");
            user.style.display = "inline";
            var usernm = document.getElementById("username");
            usernm.innerHTML = userInfo.username;
        }
    }

    exports('index', {});
});