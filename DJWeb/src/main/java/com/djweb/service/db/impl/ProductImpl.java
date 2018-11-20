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
        ProductEntity productEntity = iProductDao.selectByPDName(pdname);
        if (productEntity == null)
            return false;
        else
            return true;
    }

    @Override
    public boolean AddProduct(ProductEntity product) {
        return iProductDao.insert(product);
    }

    @Override
    public boolean UpdateProductByPID(ProductEntity product) {
        return iProductDao.update(product);
    }

    @Override
    public ProductEntity GetProductByPID(Integer pid) {
        return iProductDao.selectByPID(pid);
    }

    @Override
    public List<ProductEntity> GetProductsByUID(Integer uid) {
        return iProductDao.selectByUID(uid);
    }

    @Override
    public boolean DeleteProductByPID(Integer pid) {
        return iProductDao.deleteByPID(pid);
    }

    @Override
    public Integer GetDeviceNumByPID(Integer pid) {
        return iProductDao.GetDevNumByPID(pid);
    }

    @Override
    public Integer GetTriggerNumByPID(Integer pid) {
        return iProductDao.GetTrigNumByPID(pid);
    }
}
