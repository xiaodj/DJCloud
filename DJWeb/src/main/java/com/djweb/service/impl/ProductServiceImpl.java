package com.djweb.service.impl;

import com.djweb.dao.IProductDAO;
import com.djweb.dto.BaseDto;
import com.djweb.dto.ProductDto;
import com.djweb.dto.ProductsDto;
import com.djweb.entity.ProductEntity;
import com.djweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public BaseDto AddProduct(Map<String, String> var) {
        return null;
    }

    @Override
    public BaseDto UpdateProduct(Map<String, String> var) {
        return null;
    }

    @Override
    public ProductDto GetProduct(Integer pid) {
        return null;
    }

    @Override
    public ProductsDto GetProducts(Integer uid) {
        return null;
    }

    @Override
    public BaseDto DeleteProduct(Integer pid) {
        return null;
    }
}
