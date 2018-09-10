/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var element = layui.element;



    element.on('nav(manage)', function (data) {
        var prodmnage = document.getElementById("prodmanage");
        if (data.text() == "产品概况"){
            prodmnage.innerHTML = "";
            var fldEnm = document.createElement("fieldset");
            fldEnm.className = "layui-elem-field layui-field-title";
            var legEnm = document.createElement("legend");
            var legText = document.createTextNode("产品概况");
            legEnm.appendChild(legText);
            fldEnm.appendChild(legEnm);
            prodmnage.appendChild(fldEnm);

            var divEnm = document.createElement("div");
            divEnm.className = "layui-row";
            var divcdEnm = document.createElement("div");
            divcdEnm.className = "layui-card";
            var divhdEnm = document.createElement("div");
            divhdEnm.className = "layui-card-header";
            var divhdText = document.createTextNode("标题");
            divhdEnm.appendChild(divhdText);
            divcdEnm.appendChild(divhdEnm);
            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("产品简介");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("产品ID：118990");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("设备接入协议：MQTT");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("创建时间：2018-01-25 15:22:38");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("APIKey：xJrWiFxr6LeO=TrvshVknO6=ZU8=");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";
            var divbdText = document.createTextNode("用户ID (user id)：60717");
            divbdEnm.appendChild(divbdText);
            divcdEnm.appendChild(divbdEnm);

            divEnm.appendChild(divcdEnm);
            prodmnage.appendChild(divEnm);

        }else if (data.text() == "设备管理"){
            prodmnage.innerHTML = "";
            var fldEnm = document.createElement("fieldset");
            fldEnm.className = "layui-elem-field layui-field-title";
            var legEnm = document.createElement("legend");
            var legText = document.createTextNode("触发器管理");
            legEnm.appendChild(legText);
            fldEnm.appendChild(legEnm);
            prodmnage.appendChild(fldEnm);

            var divEnm = document.createElement("div");
            divEnm.className = "layui-row";
            var divcdEnm = document.createElement("div");
            divcdEnm.className = "layui-card";
            var divhdEnm = document.createElement("div");
            divhdEnm.className = "layui-card-header";
            var divhdText = document.createTextNode("触发器数量：1个");
            divhdEnm.appendChild(divhdText);
            divcdEnm.appendChild(divhdEnm);
            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";

            //添加一个表格
            var tbEnm = document.createElement("table");
            tbEnm.className = "layui-table";
            //设置每列的范围
            var colgEnm = document.createElement("colgroup");
            for (var i = 0; i < 4; i++){
                var colEnm = document.createElement("col");
                colEnm.setAttribute("width", "25%");
                colgEnm.appendChild(colEnm);
            }
            tbEnm.appendChild(colgEnm);

            //设置每列的表头内容
            var thdEnm = document.createElement("thead");
            var trEnm = document.createElement("tr");
            var thEnm = document.createElement("th");
            var thText = document.createTextNode("触发器名称");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("触发条件");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("控制设备");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("操作");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thdEnm.appendChild(trEnm);
            tbEnm.appendChild(thdEnm);

            //设置表的内容
            var tbdEnm = document.createElement("tbody");
            for (var i = 0; i < 1; i++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("apikey");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:10");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("1个");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var btEnm = document.createElement("button");
                tdText = document.createTextNode("编辑");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                btEnm = document.createElement("button");
                tdText = document.createTextNode("删除");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                trEmn.appendChild(tdEnm);

                tbdEnm.appendChild(trEmn);
            }
            tbEnm.appendChild(tbdEnm);

            divbdEnm.appendChild(tbEnm);
            divcdEnm.appendChild(divbdEnm);

            divEnm.appendChild(divcdEnm);
            prodmnage.appendChild(divEnm);
        }else if (data.text() == "数据流模板"){
            prodmnage.innerHTML = "";
            var fldEnm = document.createElement("fieldset");
            fldEnm.className = "layui-elem-field layui-field-title";
            var legEnm = document.createElement("legend");
            var legText = document.createTextNode("触发器管理");
            legEnm.appendChild(legText);
            fldEnm.appendChild(legEnm);
            prodmnage.appendChild(fldEnm);

            var divEnm = document.createElement("div");
            divEnm.className = "layui-row";
            var divcdEnm = document.createElement("div");
            divcdEnm.className = "layui-card";
            var divhdEnm = document.createElement("div");
            divhdEnm.className = "layui-card-header";
            var divhdText = document.createTextNode("触发器数量：1个");
            divhdEnm.appendChild(divhdText);
            divcdEnm.appendChild(divhdEnm);
            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";

            //添加一个表格
            var tbEnm = document.createElement("table");
            tbEnm.className = "layui-table";
            //设置每列的范围
            var colgEnm = document.createElement("colgroup");
            for (var i = 0; i < 4; i++){
                var colEnm = document.createElement("col");
                colEnm.setAttribute("width", "25%");
                colgEnm.appendChild(colEnm);
            }
            tbEnm.appendChild(colgEnm);

            //设置每列的表头内容
            var thdEnm = document.createElement("thead");
            var trEnm = document.createElement("tr");
            var thEnm = document.createElement("th");
            var thText = document.createTextNode("触发器名称");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("触发条件");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("控制设备");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("操作");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thdEnm.appendChild(trEnm);
            tbEnm.appendChild(thdEnm);

            //设置表的内容
            var tbdEnm = document.createElement("tbody");
            for (var i = 0; i < 1; i++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("apikey");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:10");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("1个");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var btEnm = document.createElement("button");
                tdText = document.createTextNode("编辑");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                btEnm = document.createElement("button");
                tdText = document.createTextNode("删除");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                trEmn.appendChild(tdEnm);

                tbdEnm.appendChild(trEmn);
            }
            tbEnm.appendChild(tbdEnm);

            divbdEnm.appendChild(tbEnm);
            divcdEnm.appendChild(divbdEnm);

            divEnm.appendChild(divcdEnm);
            prodmnage.appendChild(divEnm);
        }else if (data.text() == "设备群组"){
            document.getElementById("prodmanage").innerHTML="4";
        }else if (data.text() == "APIKey管理"){
            prodmnage.innerHTML = "";
            var fldEnm = document.createElement("fieldset");
            fldEnm.className = "layui-elem-field layui-field-title";
            var legEnm = document.createElement("legend");
            var legText = document.createTextNode("APIKey 管理");
            legEnm.appendChild(legText);
            fldEnm.appendChild(legEnm);
            prodmnage.appendChild(fldEnm);

            var divEnm = document.createElement("div");
            divEnm.className = "layui-row";
            var divcdEnm = document.createElement("div");
            divcdEnm.className = "layui-card";
            var divhdEnm = document.createElement("div");
            divhdEnm.className = "layui-card-header";
            var divhdText = document.createTextNode("API Key数量：1个");
            divhdEnm.appendChild(divhdText);
            divcdEnm.appendChild(divhdEnm);
            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";

            //添加一个表格
            var tbEnm = document.createElement("table");
            tbEnm.className = "layui-table";
            //设置每列的范围
            var colgEnm = document.createElement("colgroup");
            for (var i = 0; i < 4; i++){
                var colEnm = document.createElement("col");
                colEnm.setAttribute("width", "25%");
                colgEnm.appendChild(colEnm);
            }
            tbEnm.appendChild(colgEnm);

            //设置每列的表头内容
            var thdEnm = document.createElement("thead");
            var trEnm = document.createElement("tr");
            var thEnm = document.createElement("th");
            var thText = document.createTextNode("API Key名称");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("创建时间");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("关联设备");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("操作");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thdEnm.appendChild(trEnm);
            tbEnm.appendChild(thdEnm);

            //设置表的内容
            var tbdEnm = document.createElement("tbody");
            for (var i = 0; i < 1; i++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("apikey");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:10");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("1个");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var btEnm = document.createElement("button");
                tdText = document.createTextNode("编辑");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                btEnm = document.createElement("button");
                tdText = document.createTextNode("删除");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                trEmn.appendChild(tdEnm);

                tbdEnm.appendChild(trEmn);
            }
            tbEnm.appendChild(tbdEnm);

            divbdEnm.appendChild(tbEnm);
            divcdEnm.appendChild(divbdEnm);

            divEnm.appendChild(divcdEnm);
            prodmnage.appendChild(divEnm);
        }else if (data.text() == "触发器管理"){
            prodmnage.innerHTML = "";
            var fldEnm = document.createElement("fieldset");
            fldEnm.className = "layui-elem-field layui-field-title";
            var legEnm = document.createElement("legend");
            var legText = document.createTextNode("触发器管理");
            legEnm.appendChild(legText);
            fldEnm.appendChild(legEnm);
            prodmnage.appendChild(fldEnm);

            var divEnm = document.createElement("div");
            divEnm.className = "layui-row";
            var divcdEnm = document.createElement("div");
            divcdEnm.className = "layui-card";
            var divhdEnm = document.createElement("div");
            divhdEnm.className = "layui-card-header";
            var divhdText = document.createTextNode("触发器数量：1个");
            divhdEnm.appendChild(divhdText);
            divcdEnm.appendChild(divhdEnm);
            var divbdEnm = document.createElement("div");
            divbdEnm.className = "layui-card-body";

            //添加一个表格
            var tbEnm = document.createElement("table");
            tbEnm.className = "layui-table";
            //设置每列的范围
            var colgEnm = document.createElement("colgroup");
            for (var i = 0; i < 4; i++){
                var colEnm = document.createElement("col");
                colEnm.setAttribute("width", "25%");
                colgEnm.appendChild(colEnm);
            }
            tbEnm.appendChild(colgEnm);

            //设置每列的表头内容
            var thdEnm = document.createElement("thead");
            var trEnm = document.createElement("tr");
            var thEnm = document.createElement("th");
            var thText = document.createTextNode("触发器名称");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("触发条件");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("控制设备");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thEnm = document.createElement("th");
            thText = document.createTextNode("操作");
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
            thdEnm.appendChild(trEnm);
            tbEnm.appendChild(thdEnm);

            //设置表的内容
            var tbdEnm = document.createElement("tbody");
            for (var i = 0; i < 1; i++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("apikey");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:10");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("1个");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var btEnm = document.createElement("button");
                tdText = document.createTextNode("编辑");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                btEnm = document.createElement("button");
                tdText = document.createTextNode("删除");
                btEnm.appendChild(tdText);
                tdEnm.appendChild(btEnm);

                trEmn.appendChild(tdEnm);

                tbdEnm.appendChild(trEmn);
            }
            tbEnm.appendChild(tbdEnm);

            divbdEnm.appendChild(tbEnm);
            divcdEnm.appendChild(divbdEnm);

            divEnm.appendChild(divcdEnm);
            prodmnage.appendChild(divEnm);
        }else if (data.text() == "应用管理"){
            document.getElementById("prodmanage").innerHTML="7";
        }else if (data.text() == "第三方开发平台"){
            document.getElementById("prodmanage").innerHTML="8";
        }else if (data.text() == "在线调试"){
            document.getElementById("prodmanage").innerHTML="9";
        }
    });
    exports('manage', {});
});