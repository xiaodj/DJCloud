package com.djweb.service.db.impl;

import com.djweb.entity.ProductEntity;
import com.djweb.service.db.IProductDB;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class ProductImpl implements IProductDB {
    @Override
    public boolean IsExistOfProduct(String pdname) {
        return false;
    }

    @Override
    public boolean AddProduct(ProductEntity product) {
        return false;
    }

    @Override
    public boolean UpdateProductByPID(ProductEntity product) {
        return false;
    }

    @Override
    public ProductEntity GetProductByPID(Integer tid) {
        return null;
    }

    @Override
    public List<ProductEntity> GetProductsByUID(Integer uid) {
        return null;
    }

    @Override
    public boolean DeleteProductByPID(Integer tid) {
        return false;
    }
}
