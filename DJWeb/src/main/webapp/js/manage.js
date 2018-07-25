/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var element = layui.element;

    element.on('nav(manage)', function (data) {
        if (data.text() == "产品概况"){
            var content = "<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 10px;\">\n" +
                "                <legend style=\"font-size: 16px\">产品概况</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 10px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-header\">标题</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品简介</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品ID：118990</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">设备接入协议：MQTT</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">创建时间：2018-01-25 15:22:38</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\" >\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\" >APIKey：xJrWiFxr6LeO=TrvshVknO6=ZU8=</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">用户ID (user id)：60717</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>";
            document.getElementById("pdtContextId").innerHTML=content;
        }else if (data.text() == "设备管理"){
            var content = "<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 10px;\">\n" +
                "                <legend style=\"font-size: 16px\">接入设备</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 16px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">标题<br/>标题<br/>标题</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 15px;\">\n" +
                "                <legend style=\"font-size: 16px\">操作设备</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 10px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-header\">标题</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品简介</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品ID：118990</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">设备接入协议：MQTT</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">创建时间：2018-01-25 15:22:38</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\" >\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\" >APIKey：xJrWiFxr6LeO=TrvshVknO6=ZU8=</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">用户ID (user id)：60717</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>";
            document.getElementById("pdtContextId").innerHTML=content;
        }else if (data.text() == "数据流模板"){
            var content = "<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 15px;\">\n" +
                "                <legend style=\"font-size: 16px\">数据流模板</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 10px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-header\">标题</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品简介</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品ID：118990</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">设备接入协议：MQTT</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">创建时间：2018-01-25 15:22:38</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\" >\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\" >APIKey：xJrWiFxr6LeO=TrvshVknO6=ZU8=</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">用户ID (user id)：60717</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>";
            document.getElementById("pdtContextId").innerHTML=content;
        }else if (data.text() == "设备群组"){
            document.getElementById("pdtContextId").innerHTML="4";
        }else if (data.text() == "APIKey管理"){
            var content = "<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 15px;\">\n" +
                "                <legend style=\"font-size: 16px\">APIKey管理</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 10px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-header\">标题</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品简介</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品ID：118990</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">设备接入协议：MQTT</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">创建时间：2018-01-25 15:22:38</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md3\" >\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\" >APIKey：xJrWiFxr6LeO=TrvshVknO6=ZU8=</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"layui-col-md2\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">用户ID (user id)：60717</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>";
            document.getElementById("pdtContextId").innerHTML=content;
        }else if (data.text() == "触发器管理"){
            var content = "<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 15px;\">\n" +
                "                <legend style=\"font-size: 16px\">触发器管理</legend>\n" +
                "            </fieldset>\n" +
                "            <div class=\"layui-row\" style=\"font-size: 10px\">\n" +
                "                <div class=\"layui-col-md12\">\n" +
                "                    <div class=\"layui-card\">\n" +
                "                        <div class=\"layui-card-body\">产品简介</div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>";
            document.getElementById("pdtContextId").innerHTML=content;
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