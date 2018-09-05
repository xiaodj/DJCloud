package com.djweb.dto;

import org.springframework.stereotype.Component;

@Component
public class TriggersInfo {
    private String tnm; //触发器名称
    private String anm; //属性名称
    private String tttt;    //触发条件
    private String ttt; //创建时间
    private boolean btt;    //触发器信息接收方式
    private String ddtt;    //接收触发器信息的地址
}
