package com.djweb.service.impl;

import com.djweb.dto.MsgDTO;
import com.djweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
public class ProductServiceImpl implements IProductService {

    @Autowired
    private MsgDTO msgDTO;

    @Override
    public MsgDTO createProduct(Map<String, String> var) {

        String prodname = var.get("pdtname");

        return msgDTO;
    }
}
