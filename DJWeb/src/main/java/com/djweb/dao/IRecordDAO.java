package com.djweb.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaodj on 2018/11/20.
 */
@Repository
public interface IRecordDAO {
    //创建表
    public boolean creatTableByName(@Param("tblName") String tblName);
    //删除表
    public boolean deleteTableByName(@Param("tblName") String tblName);
    //向表中添加字段
    public boolean addField(@Param("tblName") String tblName,
                            @Param("fieldName") String fieldName);
    //向表中删除字段
    public boolean deleteField(@Param("tblName") String tblName,
                               @Param("fieldName") String fieldName);
    //根据日期时间段查询记录
    public List<Map<String, Object>> select(@Param("tblName") String tblName,
                                            @Param("startDateTime") String startDateTime,
                                            @Param("endDateTime") String endDateTime);
    //根据设备编码查询记录
    public List<Map<String, Object>> selectByDID(@Param("tblName") String tblName,
                                                 @Param("did") Integer did,
                                                 @Param("startDateTime") String startDateTime,
                                                 @Param("endDateTime") String endDateTime);
}
