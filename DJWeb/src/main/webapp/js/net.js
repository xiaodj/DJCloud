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
};

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
};

//注册
function register($, data, fn) {
    $.ajax({
        url:URL + "/register",
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

//获取产品信息
function getProductsInfo($, fn) {
    $.ajax({
        url:URL + "/products",
        type:"get",
        datatype:"json",
        success:function (msg) {
            fn(msg);
        },
        error:function (msg) {
            fn("err");
        }
    });
};


//创建产品
function createProduct($, data, fn) {
    $.ajax({
        url:URL + "/product",
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
};