package com.djweb.service.impl;

import com.djweb.dao.IProductDAO;
import com.djweb.dto.BaseDto;
import com.djweb.dto.ProductDto;
import com.djweb.dto.ProductInfo;
import com.djweb.dto.ProductsDto;
import com.djweb.entity.ProductEntity;
import com.djweb.service.IProductService;
import com.djweb.service.db.IProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by xiaodj on 2018/8/29.
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDB iProductDB;

    @Autowired
    private BaseDto baseDto;
    @Autowired
    private ProductDto productDto;
    @Autowired
    private ProductsDto productsDto;

    @Override
    public BaseDto AddProduct(Map<String, String> var) {

        String pdName = var.get("PDName");
        String pdIndustry = var.get("PDIndustry");
        String pdCategory = var.get("PDCategory");
        String pdProgress = var.get("PDProgress");
        String pdSummary = var.get("PDSummary");
        String pdos = var.get("PDOS");
        String pdNetwork = var.get("PDNetwork");
        String pdAccessWay = var.get("PDAccessWay");
        String pdNetWay = var.get("PDNetWay");
        String pdModule = var.get("PDModule");
        String pdProtocol = var.get("PDProtocol");
        String pdDateTime = var.get("PDDateTime");
        String pdkey = UUID.randomUUID().toString();
        String uid = var.get("UID");


        //判断产品是否存在
        if (iProductDB.IsExistOfProduct(pdName)){
            baseDto.setCode(1);
            baseDto.setMessage("产品名已存在");
            return baseDto;
        }

        ProductEntity productEntity = new ProductEntity();
        productEntity.setPDNAME(pdName);
        productEntity.setPDINDUSTRY(pdIndustry);
        productEntity.setPDCATEGORY(pdCategory);
        productEntity.setPDPROGRESS(pdProgress);
        productEntity.setPDSUMMARY(pdSummary);
        productEntity.setPDOS(pdos);
        productEntity.setPDNETWORK(pdNetwork);
        productEntity.setPDACCESSWAY(pdAccessWay);
        productEntity.setPDNETWAY(pdNetWay);
        productEntity.setPDMODULE(pdModule);
        productEntity.setPDPROTOCOL(pdProtocol);
        productEntity.setPDDATETIME(pdDateTime);
        productEntity.setPDKEY(pdkey);
        productEntity.setUID(Integer.parseInt(uid));

        if (!iProductDB.AddProduct(productEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("产品添加失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("产品添加成功");
            return baseDto;
        }
    }

    @Override
    public BaseDto UpdateProduct(Map<String, String> var) {

        String pid = var.get("PID");
        String pdName = var.get("PDName");
        String pdIndustry = var.get("PDIndustry");
        String pdCategory = var.get("PDCategory");
        String pdProgress = var.get("PDProgress");
        String pdSummary = var.get("PDSummary");
        String pdos = var.get("PDOS");
        String pdNetwork = var.get("PDNetwork");
        String pdAccessWay = var.get("PDAccessWay");
        String pdNetWay = var.get("PDNetWay");
        String pdModule = var.get("PDModule");
        String pdProtocol = var.get("PDProtocol");

        ProductEntity productEntity = new ProductEntity();
        productEntity.setPID(Integer.parseInt(pid));
        productEntity.setPDNAME(pdName);
        productEntity.setPDINDUSTRY(pdIndustry);
        productEntity.setPDCATEGORY(pdCategory);
        productEntity.setPDPROGRESS(pdProgress);
        productEntity.setPDSUMMARY(pdSummary);
        productEntity.setPDOS(pdos);
        productEntity.setPDNETWORK(pdNetwork);
        productEntity.setPDACCESSWAY(pdAccessWay);
        productEntity.setPDNETWAY(pdNetWay);
        productEntity.setPDMODULE(pdModule);
        productEntity.setPDPROTOCOL(pdProtocol);

        if (!iProductDB.UpdateProductByPID(productEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("更新产品信息失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("更新产品信息成功");
            return baseDto;
        }
    }

    @Override
    public ProductDto GetProduct(Integer pid) {

        ProductEntity productEntity = iProductDB.GetProductByPID(pid);
        if (productEntity == null){
            productDto.setCode(1);
            productDto.setMessage("获取产品(pid=" +String.valueOf(pid)+ ")信息失败");
            return productDto;
        }
        productDto.setCode(0);
        productDto.setMessage("获取产品信息成功");
        productDto.setPDName(productEntity.getPDNAME());
        productDto.setPDIndustry(productEntity.getPDINDUSTRY());
        productDto.setPDCategory(productEntity.getPDCATEGORY());
        productDto.setPDSummary(productEntity.getPDSUMMARY());
        productDto.setPDOS(productEntity.getPDOS());
        productDto.setPDNetwork(productEntity.getPDNETWORK());
        productDto.setPDNetWay(productEntity.getPDNETWAY());
        productDto.setPDProtocol(productEntity.getPDPROTOCOL());
        productDto.setPDDateTime(productEntity.getPDDATETIME());
        return productDto;
    }

    @Override
    public ProductsDto GetProducts(Integer uid) {

        List<ProductInfo> pubList = new ArrayList<ProductInfo>();
        List<ProductInfo> praList = new ArrayList<ProductInfo>();

        List<ProductEntity> productEntityList = iProductDB.GetProductsByUID(uid);
        for (ProductEntity productEntity:productEntityList) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setPID(productEntity.getPID());
            productInfo.setPDName(productEntity.getPDNAME());
            productInfo.setPDIndustry(productEntity.getPDINDUSTRY());
            productInfo.setPDProtocol(productEntity.getPDPROTOCOL());
            productInfo.setPDDateTime(productEntity.getPDDATETIME());
            productInfo.setDevNum(iProductDB.GetDeviceNumByPID(productEntity.getPID()));
            productInfo.setTriggNum(iProductDB.GetTriggerNumByPID(productEntity.getPID()));
            productInfo.setPDKey(productEntity.getPDKEY());
            //后面进行修改为0,1
            if (productEntity.getPDACCESSWAY().equals("公开协议")){
                pubList.add(productInfo);
            }else {
                praList.add(productInfo);
            }
        }

        productsDto.setCode(0);
        productsDto.setMessage("查询所有产品信息成功");
        productsDto.setPDPublic(pubList);
        productsDto.setPDPrivate(praList);
        return productsDto;
    }

    @Override
    public BaseDto DeleteProduct(Integer pid) {
        if (!iProductDB.DeleteProductByPID(pid)){
            baseDto.setCode(1);
            baseDto.setMessage("产品删除失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("产品删除成功");
            return baseDto;
        }
    }
}
