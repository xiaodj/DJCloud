/**
 * Created by xiaodj on 2018/7/16.
 */

layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    var $ = layui.$;

    $(document).on('click', '#Login', function () {
        var UserName = document.getElementById('UserName').value;
        var PassWord = document.getElementById('PassWord').value;
        var reqdata = {
            "UserName":UserName,
            "PassWord":PassWord
        };
        console.log(reqdata);
        $.ajax({
            //async: false,
            url:Host + "/user/login",
            type:"post",
            contentType:"application/json",
            dataType:"json",
            data:JSON.stringify(reqdata),
            success:function (msg) {
                if (msg.code == 0) {
                    sessionStorage.setItem("UID", msg.uid);
                    sessionStorage.setItem("NickName", msg.nickName);
                    window.location.href = Host;
                }else if (msg.code == 1){
                    layer.msg(msg.Message.toString());
                }
            },
            error:function (msg) {
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
                layer.msg("net error");
            }
        });
    });

    exports('login', {});
});

