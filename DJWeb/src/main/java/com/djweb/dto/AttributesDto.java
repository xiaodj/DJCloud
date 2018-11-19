package com.djweb.dto;

import java.util.ArrayList;

/**
 * Created by xiaodj on 2018/11/19.
 */
public class AttributesDto extends BaseDto {
    private ArrayList<AttributeInfo> Attrs;

    public ArrayList<AttributeInfo> getAttrs() {
        return Attrs;
    }

    public void setAttrs(ArrayList<AttributeInfo> attrs) {
        Attrs = attrs;
    }
}
