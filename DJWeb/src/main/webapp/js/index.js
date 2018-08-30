/**
 * Created by xiaodj on 2018/7/13.
 */
layui.define(['layer', 'element'],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;

    $.ajax({
        url:"http://localhost:8080/userinfo",
        type:"get",
        datatype:"json",
        success:function (message) {
            if (message.code == 0){
                var elclass = document.getElementById("login_out");
                elclass.style.display = "none";
                elclass = document.getElementById("login_in");
                elclass.style.display = "inline";
                elclass = document.getElementById("username");
                elclass.innerHTML = message.username;
            }else{
                //var elclass = document.getElementById("login_in");
                //elclass.style.display = "none";
            }
        },
        error:function (message) {
            //var elclass = document.getElementById("login_in");
            //elclass.style.display = "none";
        }
    });

    exports('index', {});
});