var URL = "http://localhost:8080";

//获取用户信息
function getUserInfo($, fn) {
    $.ajax({
        url:URL + "/userinfo",
        type:"get",
        datatype:"json",
        success:function (msg) {
            fn(msg);
        },
        error:function (msg) {
            fn("err");
        }
    });
}

//登陆
function login($, data, fn) {
    $.ajax({
        url:URL + "/login",
        type:"post",
        contentType:"application/json",
        datatype:"json",
        data:JSON.stringify(data.field),
        success:function (msg) {
            fn(msg);
        },
        error:function (msg) {
            fn("err");
        }
    });
}

//注册
function register($, data, fn) {

}

//获取产品信息
function getProductsInfo($, fn) {

}


//创建产品
function createProduct($, data, fn) {

}