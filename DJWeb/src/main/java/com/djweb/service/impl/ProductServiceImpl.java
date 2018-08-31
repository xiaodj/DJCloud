package com.djweb.service.impl;

import com.djweb.dao.IProductDAO;
import com.djweb.dto.MsgDTO;
import com.djweb.dto.ProductsInfo;
import com.djweb.dto.ProductsInfoDTO;
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

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private ProductsInfoDTO prodsInfoDTO;
    @Autowired
    private ProductEntity productEntity;
    @Autowired
    private IProductDAO iprodDAO;

    @Override
    public ProductsInfoDTO getProductsInfo(int uid) {

        List<ProductEntity> listProduct = new ArrayList<ProductEntity>();
        listProduct = iprodDAO.selectByUID(uid);

        int pubcount = 0;
        int pracount = 0;
        List<ProductsInfo> pubList = new ArrayList<ProductsInfo>();
        List<ProductsInfo> priList = new ArrayList<ProductsInfo>();

        for (ProductEntity prodEntity: listProduct) {
            if (prodEntity.getACCESSWAY().equals("公开协议")){
                ProductsInfo prodsInfo = new ProductsInfo();
                prodsInfo.setPnm(prodEntity.getPRODNAME());
                prodsInfo.setPindu(prodEntity.getPRODINDUSTRY());
                prodsInfo.setAccprot(prodEntity.getACCPROTOCOL());
                pubcount++;
                pubList.add(prodsInfo);
            }else{
                ProductsInfo prodsInfo = new ProductsInfo();
                prodsInfo.setPnm(prodEntity.getPRODNAME());
                prodsInfo.setPindu(prodEntity.getPRODINDUSTRY());
                prodsInfo.setAccprot(prodEntity.getACCPROTOCOL());
                pracount++;
                priList.add(prodsInfo);
            }
        }

        prodsInfoDTO.setCode(0);
        prodsInfoDTO.setPubcount(pubcount);
        prodsInfoDTO.setPricount(pracount);
        prodsInfoDTO.setPubInfo(pubList);
        prodsInfoDTO.setPriInfo(priList);
        return prodsInfoDTO;
    }

    @Override
    public MsgDTO createProduct(Map<String, String> var) {

        String pnm = var.get("pnm");
        String pindu = var.get("pindu");	//产品行业
        String pcate = var.get("pcate");	    //产品类别
        String psched = var.get("psched");	//产品进度
        String pintrod = var.get("pintrod");	//产品简介
        String os = var.get("os");	//操作系统
        String mobile = var.get("mobile");	//移动
        String telecom = var.get("telecom");	//电信
        String unicom = var.get("unicom");	//联通
        String other = var.get("other");	//其它运营商
        String accway = var.get("accway");	//设备接入方式
        String netway = var.get("netway");	//联网方式
        //String mdsel = var.get("mdsel");	//模组选择
        String accprot = var.get("accprot");	//设备接入协议

        productEntity.setPRODNAME(pnm);
        productEntity.setPRODINDUSTRY(pindu);
        productEntity.setPRODCATEGORY(pcate);
        productEntity.setPRODSCHEDULE(psched);
        productEntity.setPRODINTRODUCE(pintrod);
        productEntity.setOS(os);
        productEntity.setMOBILE(mobile);
        productEntity.setTELECOM(telecom);
        productEntity.setUNICOM(unicom);
        productEntity.setOTHER(other);
        productEntity.setACCESSWAY(accway);
        productEntity.setNETWAY(netway);
        //productEntity.setMODUSELECT(mdsel);
        productEntity.setACCPROTOCOL(accprot);

        iprodDAO.insert(productEntity);

        msgDTO.setCode(0);
        return msgDTO;
    }
}
