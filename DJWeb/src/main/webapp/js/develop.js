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
                var tdText = document.createTextNode(i+1);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var aEnm = document.createElement("a");
                aEnm.setAttribute("href", "./manage.html");
                tdText = document.createTextNode(prodsInfo.pubInfo[i].pnm);
                aEnm.appendChild(tdText);
                tdEnm.appendChild(aEnm);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.pubInfo[i].pindu);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.pubInfo[i].accprot);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.pubInfo[i].ctTime);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.pubInfo[i].devCount);
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
                var tdText = document.createTextNode(j+1);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                var aEnm = document.createElement("a");
                aEnm.setAttribute("href", "./manage.html");
                tdText = document.createTextNode(prodsInfo.priInfo[j].pnm);
                aEnm.appendChild(tdText);
                tdEnm.appendChild(aEnm);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.priInfo[j].pindu);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.priInfo[j].accprot);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.priInfo[j].ctTime);
                tdEnm.appendChild(tdText);
                trEmn.appendChild(tdEnm);

                tdEnm = document.createElement("td");
                tdText = document.createTextNode(prodsInfo.priInfo[j].devCount);
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