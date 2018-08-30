/**
 * Created by xiaodj on 2018/7/18.
 */
layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    //var element = layui.element;
    var $ = layui.$;
    
    form.on('select(accprot)', function (data) {
        if (data.value == "HTTP"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>HTTP 协议基本功能介绍：</b>";
            var vp = "<p>1、上报传感器数据点</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("HTTP");
        }else if (data.value == "EDP"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>EDP 协议基本功能介绍：</b>";
            var vp = "<p>1、上报传感器数据点</p>";
            vp = vp + "<p>2、接收实时命令或离线命令</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("EDP");
        }else if (data.value == "MQTT"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>MQTT 协议基本功能介绍：</b>";
            var vp = "<p>1、上报传感器数据点</p>";
            vp = vp + "<p>2、订阅自定义TOPIC</p>";
            vp = vp + "<p>3、接收实时消息或离线消息</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("MQTT");
        }else if (data.value == "Modbus"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>Modbus 协议基本功能介绍：</b>";
            var vp = "<p>1、自定义采集命令与采集周期</p>";
            vp = vp + "<p>2、接收实时命令或离线命令</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("Modbus");
        }else if (data.value == "JT/T808"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>JT/T808 协议基本功能介绍：</b>";
            var vp = "<p>1、上报传感器数据点</p>";
            vp = vp + "<p>2、接收实时命令或离线命令</p>"
            eid.innerHTML = vb+vp;
            //layer.msg("JT/T808");
        }else if (data.value == "TCP透传"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>TCP透传基本功能介绍：</b>";
            var vp = "<p>1、数据透传</p>";
            vp = vp + "<p>2、不需要对设备进行开发</p>";
            vp = vp + "<p>3、命令下发</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("TCP透传");
        }else if (data.value == "RTMP"){
            var eid = document.getElementById("argument-details");
            var vb = "<b>RTMP协议基本功能介绍：</b>";
            var vp = "<p>1、rtmp实时流媒体推送</p>";
            vp = vp + "<p>2、支持多协议(rtmp、hls)流媒体分发</p>";
            vp = vp + "<p>3、本地视频远程查看</p>";
            eid.innerHTML = vb+vp;
            //layer.msg("RTMP");
        }
        return false;
    });
    
    form.on('submit(ok)', function (data) {
        //var prodname = document.getElementsByName("prodname");

        //layer.msg(JSON.stringify(data.field));

        $.ajax({
            url:"http://localhost:8080/product",
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

    form.on('submit(cancel)', function (data) {
        location.href = '../views/develop.html';
    });

    exports('product', {});
});