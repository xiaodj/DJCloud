/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer', 'element'],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;

    //获取用户信息
    if (uid != null){
        $.ajax({
            url:URL + "/user/1/info",
            type:"get",
            datatype:"json",
            success:function (msg) {
                if (msg.code == 0) {
                    var nouser = document.getElementById("no_user");
                    nouser.style.display = "none";
                    var user = document.getElementById("user");
                    user.style.display = "inline";
                    var usernm = document.getElementById("username");
                    usernm.innerHTML = userInfo.username;
                    return false;
                }else if (msg.code == 1){
                    layer.msg(msg.Message.toString());
                    return false;
                }
            },
            error:function (msg) {
                layer.msg("net error");
                return false;
            }
        });
    }

    exports('index', {});
});