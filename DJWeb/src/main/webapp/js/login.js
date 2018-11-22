/**
 * Created by xiaodj on 2018/7/16.
 */
layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    var $ = layui.$;

    form.on('submit(Login)', function (data) {
        $.ajax({
            url:Host + "/user/login",
            type:"post",
            contentType:"application/json",
            datatype:"json",
            data:JSON.stringify(data.field),
            success:function (msg) {
                if (msg.code == 0) {
                    uid = msg.uid;
                    location.href = '../index.html';
                }else if (msg.code == 1){
                    layer.msg(msg.Message);
                    return false;
                }
            },
            error:function (msg) {
                layer.msg("net error");
                return false;
            }
        });
    });

    exports('login', {});
});

