package com.djweb.dao;

import java.util.List;

public interface IBaseDao<T> {
    //增
    public boolean insert(T var);
    //删
    public boolean delete(T var);
    //改
    public boolean update(T var);
    //查询
    public List<T> select(T var);
}
