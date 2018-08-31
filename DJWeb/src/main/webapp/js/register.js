/**
 * Created by xiaodj on 2018/7/16.
 */
layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    var $ = layui.$;

    form.on('submit(registerbtn)', function (data) {
        register($, data, fn);
    });

    function fn(msg) {
        if (msg == "err"){
            layer.msg("net error");
            return false;
        }

        if (msg.code == 0) {
            location.href = '../index.html';
        }else if (msg.code == 1){
            layer.msg("");
        }
    }

    exports('register', {});
});