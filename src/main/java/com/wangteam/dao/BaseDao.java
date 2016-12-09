package com.wangteam.dao;

import java.util.List;

/**
 * Created by Administrator on 2016/12/9.
 */
public interface BaseDao<T, I> {
    /**
     * 将对象数据保存到数据库
     *
     * @param obj 待保存数据
     * @return 返回sql操作状态 true成功 false失败
     */
    boolean save(T obj);

    /**
     * 根据主键删除数据库记录
     *
     * @param id 主键值
     * @return 返回sql操作状态 true成功 false失败
     */
    boolean delete(I id);

    /**
     * 根据对象id值，修改对应非空属性为对象的值
     *
     * @param obj 对象数据源
     * @return 返回sql操作状态 true成功 false失败
     */
    boolean updateById(T obj);

    /**
     * 将全表数据封装成对象类型，返回集合形式
     *
     * @return 一个保存了数据库记录的对象集合
     */
    List<T> selectAll();

    /**
     * 根据主键查询对应记录，并封装成对象类型返回
     *
     * @param i 主键值
     * @return 返回符合条件的对象类型，若没有 返回null'
     */
    T selectById(I i);
}
