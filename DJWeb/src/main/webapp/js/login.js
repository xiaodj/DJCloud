/**
 * Created by xiaodj on 2018/7/16.
 */
layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    var $ = layui.$;

    form.on('submit(loginbtn)', function (data) {
        login($, data, fn);
    }

    function fn(loginInfo) {
        if (loginInfo == "err"){
            layer.msg("net error");
            return false;
        }

        if (loginInfo.code == 0) {
            location.href = '../index.html';
        }else if (loginInfo.code == 1){
            layer.msg("");
        }
    }

    exports('login', {});
});

