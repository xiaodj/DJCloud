package com.djweb.service;

import com.djweb.dto.MsgDTO;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
public interface IProductService {

    //创建产品
    public MsgDTO createProduct(Map<String, String> var);
}
