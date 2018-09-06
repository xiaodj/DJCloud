/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer','element'],function (exports) {
    var layer = layui.layer;
    //var form = layui.form;
    var $ = layui.$;
    //var element = layui.element;

    //获取用户所拥有的产品信息
    getProductsInfo($, fn);

    function fn(prodsInfo) {
        if (prodsInfo == "err"){
            layer.msg("net error");
            return false;
        }

        if (prodsInfo.code == 0){
            var htmlID = document.getElementById("pubcount");
            htmlID.innerHTML = prodsInfo.pubcount;
            htmlID = document.getElementById("pricount");
            htmlID.innerHTML = prodsInfo.pricount;

            //公有协议
            htmlID = document.getElementById("pubprod");
            for (var i = 0; i < prodsInfo.pubcount; i++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("1");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var aEnm = document.createElement("a");
                aEnm.setAttribute("href", "./manage.html");
                tdText = document.createTextNode("手环");
                aEnm.appendChild(tdText);
                tdEnm.appendChild(aEnm);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("穿戴设备");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("MQTT");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:40:12");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("0");
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

                htmlID.appendChild(trEmn);
            }

            //私有协议
            htmlID = document.getElementById("priprod");
            for (var j = 0; j < prodsInfo.pricount; j++){
                var trEmn = document.createElement("tr");

                var tdEnm = document.createElement("td");
                var tdText = document.createTextNode("1");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var aEnm = document.createElement("a");
                tdText = document.createTextNode("手环");
                aEnm.appendChild(tdText);
                tdEnm.appendChild(aEnm);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("穿戴设备");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("MQTT");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("2018-09-01 22:40:12");
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode("0");
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

                htmlID.appendChild(trEmn);
            }
        }else{
            //var elclass = document.getElementById("login_in");
            //elclass.style.display = "none";
        }
    }

    exports('develop', {});
});