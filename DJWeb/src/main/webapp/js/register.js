/**
 * Created by xiaodj on 2018/7/16.
 */
layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    //var element = layui.element;
    var $ = layui.$;

    form.on('submit(registerbtn)', function (data) {

        $.ajax({
            url:"http://localhost:8080/register.do",
            type:"post",
            contentType:"application/json",
            datatype:"json",
            data:JSON.stringify(data.field),
            success:function (message) {
                if (message.code == "0"){
                    location.href = '../index.html';
                    //layer.msg(message.msg);
                }
                else{
                    layer.msg(message.msg);
                }
            },
            error:function (message) {
                layer.msg("error");
            }
        });
        return false;
    });

    exports('register', {});
});