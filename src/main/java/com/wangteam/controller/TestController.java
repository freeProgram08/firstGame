package com.wangteam.controller;

import com.wangteam.dao.IUserDao;
import com.wangteam.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 */
@Controller
public class TestController {
    @Resource
    IUserDao dao;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(HttpServletRequest req){
        List<User> users = dao.selectAll();
        req.setAttribute("users",users);
        return "test";
    }
}
