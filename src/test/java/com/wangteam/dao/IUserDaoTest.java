package com.wangteam.dao;


import com.wangteam.BaseTest;
import com.wangteam.entity.User;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class IUserDaoTest extends BaseTest {
    @Resource
    private IUserDao userDao;
    @Test
    public void selectAllTest(){
        List<User> users = userDao.selectAll();
        //断言，表示users!=null应该为true，若不是true测试不通过
        Assert.assertTrue("查询所有不正确",users!=null);
    }
}
