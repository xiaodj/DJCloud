/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var element = layui.element;

    element.on('nav(manage)', function (data) {
        if (data.text() == "产品概况"){
            document.getElementById("pdtContextId").innerHTML="1";
        }else if (data.text() == "设备管理"){
            document.getElementById("pdtContextId").innerHTML="2";
        }else if (data.text() == "数据流模板"){
            document.getElementById("pdtContextId").innerHTML="3";
        }else if (data.text() == "设备群组"){
            document.getElementById("pdtContextId").innerHTML="4";
        }else if (data.text() == "APIKey管理"){
            document.getElementById("pdtContextId").innerHTML="5";
        }else if (data.text() == "触发器管理"){
            document.getElementById("pdtContextId").innerHTML="6";
        }else if (data.text() == "应用管理"){
            document.getElementById("pdtContextId").innerHTML="7";
        }else if (data.text() == "第三方开发平台"){
            document.getElementById("pdtContextId").innerHTML="8";
        }else if (data.text() == "在线调试"){
            document.getElementById("pdtContextId").innerHTML="9";
        }
    });
    exports('manage', {});
});