package com.djweb.dto;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class AttributesDto extends BaseDto {
    private List<AttributeInfo> Attrs;

    public List<AttributeInfo> getAttrs() {
        return Attrs;
    }

    public void setAttrs(List<AttributeInfo> attrs) {
        Attrs = attrs;
    }
}
