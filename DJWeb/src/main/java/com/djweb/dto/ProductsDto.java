package com.djweb.dto;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by xiaodj on 2018/11/19.
 */
public class ProductsDto extends BaseDto {

    private ArrayList<ProductInfo> PDPublic;
    private ArrayList<ProductInfo> PDPrivate;

    public ArrayList<ProductInfo> getPDPublic() {
        return PDPublic;
    }

    public void setPDPublic(ArrayList<ProductInfo> PDPublic) {
        this.PDPublic = PDPublic;
    }

    public ArrayList<ProductInfo> getPDPrivate() {
        return PDPrivate;
    }

    public void setPDPrivate(ArrayList<ProductInfo> PDPrivate) {
        this.PDPrivate = PDPrivate;
    }
}
