package com.djweb.dto;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class ProductsDto extends BaseDto {

    private List<ProductInfo> PDPublic;
    private List<ProductInfo> PDPrivate;

    public List<ProductInfo> getPDPublic() {
        return PDPublic;
    }

    public void setPDPublic(List<ProductInfo> PDPublic) {
        this.PDPublic = PDPublic;
    }

    public List<ProductInfo> getPDPrivate() {
        return PDPrivate;
    }

    public void setPDPrivate(List<ProductInfo> PDPrivate) {
        this.PDPrivate = PDPrivate;
    }
}
