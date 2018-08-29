package com.djweb.service.impl;

import com.djweb.dto.MsgDTO;
import com.djweb.entity.ProductEntity;
import com.djweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private ProductEntity productEntity;

    @Override
    public MsgDTO createProduct(Map<String, String> var) {

        String prodname = var.get("prodname");

        return msgDTO;
    }
}
