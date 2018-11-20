package com.djweb.service.db.impl;

import com.djweb.dao.IProductDAO;
import com.djweb.entity.ProductEntity;
import com.djweb.service.db.IProductDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class ProductImpl implements IProductDB {

    @Autowired
    private IProductDAO iProductDao;

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
    public ProductEntity GetProductByPID(Integer pid) {
        return null;
    }

    @Override
    public List<ProductEntity> GetProductsByUID(Integer uid) {
        return null;
    }

    @Override
    public boolean DeleteProductByPID(Integer pid) {
        return false;
    }

    @Override
    public Integer GetDeviceNumByPID(Integer pid) {
        return null;
    }

    @Override
    public Integer GetTriggerNumByPID(Integer pid) {
        return null;
    }
}
