/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var element = layui.element;

    var prodmnage = document.getElementById("prodmanage");
    prodInstrModle();
    element.on('nav(manage)', function (data) {
        if (data.text() == "产品概况"){
            prodInstrModle(data);
        }else if (data.text() == "设备管理"){
            devMng(data);
        }else if (data.text() == "数据流模板"){
            dataMoudle(data);
        }else if (data.text() == "设备群组"){
            document.getElementById("prodmanage").innerHTML="4";
        }else if (data.text() == "权限管理"){
            ApiMng(data);
        }else if (data.text() == "触发器管理"){
            TriggeMng(data);
        }else if (data.text() == "应用管理"){
            document.getElementById("prodmanage").innerHTML="7";
        }else if (data.text() == "第三方开发平台"){
            document.getElementById("prodmanage").innerHTML="8";
        }else if (data.text() == "在线调试"){
            document.getElementById("prodmanage").innerHTML="9";
        }
    });

    //添加表格
    function addTable(head, body){
        var tbEnm = document.createElement("table");
        tbEnm.className = "layui-table";
        //设置每列的范围
        var colgEnm = document.createElement("colgroup");
        for (var i = 0; i < head.count; i++){
            var colEnm = document.createElement("col");
            colEnm.setAttribute("width", head.width[i].wd);
            colgEnm.appendChild(colEnm);
        }
        tbEnm.appendChild(colgEnm);

        //设置每列的表头内容
        var thdEnm = document.createElement("thead");
        var trEnm = document.createElement("tr");
        for (var i = 0; i < head.count; i++){
            var thEnm = document.createElement("th");
            var thText = document.createTextNode(head.title[i].tt);
            thEnm.appendChild(thText);
            trEnm.appendChild(thEnm);
        }
        thdEnm.appendChild(trEnm);
        tbEnm.appendChild(thdEnm);

        //设置表的内容
        var tbdEnm = document.createElement("tbody");
        for (var i = 0; i < body.count; i++){
            var trEmn = document.createElement("tr");
            for (var j = 0; j < head.count; j++){
                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode(body.data[i][j].dt);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);
            }
            tbdEnm.appendChild(trEmn);
        }
        tbEnm.appendChild(tbdEnm);
        return tbEnm;
    }

    //产品概要模块
    function prodInstrModle(data) {
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
        var divhdText = document.createTextNode("智能机器人");
        divhdEnm.appendChild(divhdText);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var shead = "{\n" +
            "\t\"count\":4,\n" +
            "\t\"width\":[\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"}\n" +
            "\t],\n" +
            "\t\"title\":[\n" +
            "\t\t{\"tt\":\"产品ID\"},\n" +
            "\t\t{\"tt\":\"创建时间\"},\n" +
            "\t\t{\"tt\":\"API KEY\"},\n" +
            "\t\t{\"tt\":\"用户ID\"}\n" +
            "\t]\n" +
            "}";

        var head = JSON.parse(shead);
        var vl0 = 1;
        var vl1 = "2";
        var vl2 = "1";
        var vl3 = "2";
        var vl4 = "1";
        var sbody = "{\n" +
            "\t\"count\":" + vl0 +",\n" +
            "\t\"data\":[\n" +
            "\t\t[{\"dt\":\""+ vl1 +"\"}, {\"dt\":\""+ vl2 +"\"},{\"dt\":\""+ vl3 +"\"}, {\"dt\":\""+ vl4 +"\"}]\n" +
            "\t]\n" +
            "}";
        var body = JSON.parse(sbody);
        //添加一个表格
        var tbEnm = addTable(head, body);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //设备管理
    function devMng(data) {
        prodmnage.innerHTML = "";
        var fldEnm = document.createElement("fieldset");
        fldEnm.className = "layui-elem-field layui-field-title";
        var legEnm = document.createElement("legend");
        var legText = document.createTextNode("设备管理");
        legEnm.appendChild(legText);
        fldEnm.appendChild(legEnm);
        prodmnage.appendChild(fldEnm);

        var divEnm = document.createElement("div");
        divEnm.className = "layui-row";
        var divcdEnm = document.createElement("div");
        divcdEnm.className = "layui-card";
        var divhdEnm = document.createElement("div");
        divhdEnm.className = "layui-card-header";
        var divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md11";
        var divhdText = document.createTextNode("设备数量：1个");
        divtdEnm.appendChild(divhdText);
        divhdEnm.appendChild(divtdEnm);
        divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md1";
        var btEnm = document.createElement("button");
        btEnm.className = "layui-btn layui-btn-sm";
        var tdText = document.createTextNode("添加设备");
        btEnm.appendChild(tdText);
        divtdEnm.appendChild(btEnm);
        divhdEnm.appendChild(divtdEnm);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var sParam = "{\n" +
            "\t\"count\":4,\n" +
            "\t\"width\":[\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"}\n" +
            "\t],\n" +
            "\t\"title\":[\n" +
            "\t\t{\"tt\":\"设备名称\"},\n" +
            "\t\t{\"tt\":\"设备ID\"},\n" +
            "\t\t{\"tt\":\"数据保密性\"},\n" +
            "\t\t{\"tt\":\"操作\"}\n" +
            "\t]\n" +
            "}";
        var param = JSON.parse(sParam);
        //添加一个表格
        var tbEnm = addTable(param, data);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //数据流摸版
    function dataMoudle(data) {
        prodmnage.innerHTML = "";
        var fldEnm = document.createElement("fieldset");
        fldEnm.className = "layui-elem-field layui-field-title";
        var legEnm = document.createElement("legend");
        var legText = document.createTextNode("数据流摸版");
        legEnm.appendChild(legText);
        fldEnm.appendChild(legEnm);
        prodmnage.appendChild(fldEnm);

        var divEnm = document.createElement("div");
        divEnm.className = "layui-row";
        var divcdEnm = document.createElement("div");
        divcdEnm.className = "layui-card";
        var divhdEnm = document.createElement("div");
        divhdEnm.className = "layui-card-header";
        var divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md11";
        var divhdText = document.createTextNode("数据流数量：2个");
        divtdEnm.appendChild(divhdText);
        divhdEnm.appendChild(divtdEnm);
        divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md1";
        var btEnm = document.createElement("button");
        btEnm.className = "layui-btn layui-btn-sm";
        var tdText = document.createTextNode("添加数据流");
        btEnm.appendChild(tdText);
        divtdEnm.appendChild(btEnm);
        divhdEnm.appendChild(divtdEnm);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var sParam = "{\n" +
            "\t\"count\":4,\n" +
            "\t\"width\":[\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"}\n" +
            "\t],\n" +
            "\t\"title\":[\n" +
            "\t\t{\"tt\":\"序号\"},\n" +
            "\t\t{\"tt\":\"数据流名称\"},\n" +
            "\t\t{\"tt\":\"单位符号\"},\n" +
            "\t\t{\"tt\":\"操作\"}\n" +
            "\t]\n" +
            "}";
        var param = JSON.parse(sParam);
        //添加一个表格
        var tbEnm = addTable(param, data);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //权限管理
    function ApiMng(data) {
        prodmnage.innerHTML = "";
        var fldEnm = document.createElement("fieldset");
        fldEnm.className = "layui-elem-field layui-field-title";
        var legEnm = document.createElement("legend");
        var legText = document.createTextNode("权限管理");
        legEnm.appendChild(legText);
        fldEnm.appendChild(legEnm);
        prodmnage.appendChild(fldEnm);

        var divEnm = document.createElement("div");
        divEnm.className = "layui-row";
        var divcdEnm = document.createElement("div");
        divcdEnm.className = "layui-card";
        var divhdEnm = document.createElement("div");
        divhdEnm.className = "layui-card-header";
        var divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md11";
        var divhdText = document.createTextNode("API KEY数量：2个");
        divtdEnm.appendChild(divhdText);
        divhdEnm.appendChild(divtdEnm);
        divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md1";
        var btEnm = document.createElement("button");
        btEnm.className = "layui-btn layui-btn-sm";
        var tdText = document.createTextNode("添加API KEY");
        btEnm.appendChild(tdText);
        divtdEnm.appendChild(btEnm);
        divhdEnm.appendChild(divtdEnm);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var sParam = "{\n" +
            "\t\"count\":4,\n" +
            "\t\"width\":[\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"}\n" +
            "\t],\n" +
            "\t\"title\":[\n" +
            "\t\t{\"tt\":\"名称\"},\n" +
            "\t\t{\"tt\":\"APKey\"},\n" +
            "\t\t{\"tt\":\"关联设备\"},\n" +
            "\t\t{\"tt\":\"操作\"}\n" +
            "\t]\n" +
            "}";
        var param = JSON.parse(sParam);
        //添加一个表格
        var tbEnm = addTable(param, data);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //触发器管理
    function TriggeMng(data){
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
        var divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md11";
        var divhdText = document.createTextNode("触发器数量：2个");
        divtdEnm.appendChild(divhdText);
        divhdEnm.appendChild(divtdEnm);
        divtdEnm = document.createElement("div");
        divtdEnm.className = "layui-col-md1";
        var btEnm = document.createElement("button");
        btEnm.className = "layui-btn layui-btn-sm";
        var tdText = document.createTextNode("添加触发器");
        btEnm.appendChild(tdText);
        divtdEnm.appendChild(btEnm);
        divhdEnm.appendChild(divtdEnm);

        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var sParam = "{\n" +
            "\t\"count\":4,\n" +
            "\t\"width\":[\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"},\n" +
            "\t\t{\"wd\":\"%25\"}\n" +
            "\t],\n" +
            "\t\"title\":[\n" +
            "\t\t{\"tt\":\"触发器名称\"},\n" +
            "\t\t{\"tt\":\"触发条件\"},\n" +
            "\t\t{\"tt\":\"触发器信息接受方式\"},\n" +
            "\t\t{\"tt\":\"操作\"}\n" +
            "\t]\n" +
            "}";
        var param = JSON.parse(sParam);
        //添加一个表格
        var tbEnm = addTable(param, data);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    exports('manage', {});
});