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
            prodInstrModle();
        }else if (data.text() == "设备管理"){
            devMng();
        }else if (data.text() == "数据流模板"){
            dataMoudle();
        }else if (data.text() == "设备群组"){
            document.getElementById("prodmanage").innerHTML="4";
        }else if (data.text() == "APIKey管理"){
            ApiMng();
        }else if (data.text() == "触发器管理"){
            TriggeMng();
        }else if (data.text() == "应用管理"){
            document.getElementById("prodmanage").innerHTML="7";
        }else if (data.text() == "第三方开发平台"){
            document.getElementById("prodmanage").innerHTML="8";
        }else if (data.text() == "在线调试"){
            document.getElementById("prodmanage").innerHTML="9";
        }
    });

    //添加表格
    function addTable(param){
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
        var thText = document.createTextNode("产品ID");
        thEnm.appendChild(thText);
        trEnm.appendChild(thEnm);
        thEnm = document.createElement("th");
        thText = document.createTextNode("创建时间");
        thEnm.appendChild(thText);
        trEnm.appendChild(thEnm);
        thEnm = document.createElement("th");
        thText = document.createTextNode("API KEY");
        thEnm.appendChild(thText);
        trEnm.appendChild(thEnm);
        thEnm = document.createElement("th");
        thText = document.createTextNode("用户ID");
        thEnm.appendChild(thText);
        trEnm.appendChild(thEnm);
        thdEnm.appendChild(trEnm);
        tbEnm.appendChild(thdEnm);

        //设置表的内容
        var tbdEnm = document.createElement("tbody");
        for (var i = 0; i < 1; i++){
            var trEmn = document.createElement("tr");

            var tdEnm = document.createElement("td");
            var tdText = document.createTextNode("118990");
            tdEnm.appendChild(tdText);
            trEmn.appendChild(tdEnm);

            tdEnm = document.createElement("td");
            tdText = document.createTextNode("2018-01-25 15:22:38");
            tdEnm.appendChild(tdText);
            trEmn.appendChild(tdEnm);

            tdEnm = document.createElement("td");
            tdText = document.createTextNode("xJrWiFxr6LeO=TrvshVknO6=ZU8=");
            tdEnm.appendChild(tdText);
            trEmn.appendChild(tdEnm);

            tdEnm = document.createElement("td");
            tdText = document.createTextNode("60717");
            tdEnm.appendChild(tdText);
            trEmn.appendChild(tdEnm);

            tbdEnm.appendChild(trEmn);
        }
        tbEnm.appendChild(tbdEnm);
        return tbEnm;
    }

    //产品概要模块
    function prodInstrModle() {
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

        var strparam = '{\n' +
            '"elmcount":4,\n' +
            '"vlcount":1,\n' +
            '"width":{\n' +
            '"wd0":"25%",\n' +
            '"wd1":"25%",\n' +
            '"wd2":"25%",\n' +
            '"wd3":"25%"\n' +
            '},\n' +
            '"name":{\n' +
            '"nm0":"产品ID",\n' +
            '"nm1":"创建时间",\n' +
            '"nm2":"API KEY",\n' +
            '"nm3":"用户ID"\n' +
            '},\n' +
            '"value":[\n' +
            '{"vl0":"118990","vl1":"2018-01-25 15:22:38","vl2":"xJrWiFxr6LeO=TrvshVknO6=ZU8=","vl3":"60717"}\n' +
            ']\n' +
            '}';
        var param = JSON.parse(strparam);
        //添加一个表格
        var tbEnm = addTable(param);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //设备管理
    function devMng() {
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
        var divhdText = document.createTextNode("智能机器人");
        divhdEnm.appendChild(divhdText);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var strparam = '{\n' +
            '"elmcount":4,\n' +
            '"vlcount":1,\n' +
            '"width":{\n' +
            '"wd0":"25%",\n' +
            '"wd1":"25%",\n' +
            '"wd2":"25%",\n' +
            '"wd3":"25%"\n' +
            '},\n' +
            '"name":{\n' +
            '"nm0":"产品ID",\n' +
            '"nm1":"创建时间",\n' +
            '"nm2":"API KEY",\n' +
            '"nm3":"用户ID"\n' +
            '},\n' +
            '"value":[\n' +
            '{"vl0":"118990","vl1":"2018-01-25 15:22:38","vl2":"xJrWiFxr6LeO=TrvshVknO6=ZU8=","vl3":"60717"}\n' +
            ']\n' +
            '}';
        var param = JSON.parse(strparam);
        //添加一个表格
        var tbEnm = addTable(param);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //数据流摸版
    function dataMoudle() {
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
        var divhdText = document.createTextNode("智能机器人");
        divhdEnm.appendChild(divhdText);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var strparam = '{\n' +
            '"elmcount":4,\n' +
            '"vlcount":1,\n' +
            '"width":{\n' +
            '"wd0":"25%",\n' +
            '"wd1":"25%",\n' +
            '"wd2":"25%",\n' +
            '"wd3":"25%"\n' +
            '},\n' +
            '"name":{\n' +
            '"nm0":"产品ID",\n' +
            '"nm1":"创建时间",\n' +
            '"nm2":"API KEY",\n' +
            '"nm3":"用户ID"\n' +
            '},\n' +
            '"value":[\n' +
            '{"vl0":"118990","vl1":"2018-01-25 15:22:38","vl2":"xJrWiFxr6LeO=TrvshVknO6=ZU8=","vl3":"60717"}\n' +
            ']\n' +
            '}';
        var param = JSON.parse(strparam);
        //添加一个表格
        var tbEnm = addTable(param);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //API 管理
    function ApiMng() {
        prodmnage.innerHTML = "";
        var fldEnm = document.createElement("fieldset");
        fldEnm.className = "layui-elem-field layui-field-title";
        var legEnm = document.createElement("legend");
        var legText = document.createTextNode("API 管理");
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

        var strparam = '{\n' +
            '"elmcount":4,\n' +
            '"vlcount":1,\n' +
            '"width":{\n' +
            '"wd0":"25%",\n' +
            '"wd1":"25%",\n' +
            '"wd2":"25%",\n' +
            '"wd3":"25%"\n' +
            '},\n' +
            '"name":{\n' +
            '"nm0":"产品ID",\n' +
            '"nm1":"创建时间",\n' +
            '"nm2":"API KEY",\n' +
            '"nm3":"用户ID"\n' +
            '},\n' +
            '"value":[\n' +
            '{"vl0":"118990","vl1":"2018-01-25 15:22:38","vl2":"xJrWiFxr6LeO=TrvshVknO6=ZU8=","vl3":"60717"}\n' +
            ']\n' +
            '}';
        var param = JSON.parse(strparam);
        //添加一个表格
        var tbEnm = addTable(param);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    //触发器管理
    function TriggeMng(){
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
        var divhdText = document.createTextNode("智能机器人");
        divhdEnm.appendChild(divhdText);
        divcdEnm.appendChild(divhdEnm);
        var divbdEnm = document.createElement("div");
        divbdEnm.className = "layui-card-body";

        var strparam = '{\n' +
            '"elmcount":4,\n' +
            '"vlcount":1,\n' +
            '"width":{\n' +
            '"wd0":"25%",\n' +
            '"wd1":"25%",\n' +
            '"wd2":"25%",\n' +
            '"wd3":"25%"\n' +
            '},\n' +
            '"name":{\n' +
            '"nm0":"产品ID",\n' +
            '"nm1":"创建时间",\n' +
            '"nm2":"API KEY",\n' +
            '"nm3":"用户ID"\n' +
            '},\n' +
            '"value":[\n' +
            '{"vl0":"118990","vl1":"2018-01-25 15:22:38","vl2":"xJrWiFxr6LeO=TrvshVknO6=ZU8=","vl3":"60717"}\n' +
            ']\n' +
            '}';
        var param = JSON.parse(strparam);
        //添加一个表格
        var tbEnm = addTable(param);

        divbdEnm.appendChild(tbEnm);
        divcdEnm.appendChild(divbdEnm);

        divEnm.appendChild(divcdEnm);
        prodmnage.appendChild(divEnm);
    }

    exports('manage', {});
});