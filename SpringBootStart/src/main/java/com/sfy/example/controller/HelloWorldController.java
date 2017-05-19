package com.sfy.example.controller;

import com.sfy.example.domain.UserInfo;
import com.sfy.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description: HelloWorldController.java
 * @User: sunfayun
 * @Date: 2017/05/18
 * @Version: 1.0
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/page")
    public ModelAndView getPage(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping("/save")
    public void addUser(UserInfo userInfo, HttpServletResponse response) throws IOException {
        userInfoService.saveUserInfo(userInfo);
        response.sendRedirect("/list");
    }

    @RequestMapping("/list")
    public ModelAndView getUserInfo(){
        ModelAndView mv = new ModelAndView("index");
        List<UserInfo> userList = userInfoService.getAllUser();
        return mv.addObject("list",userList);
    }

    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id, HttpServletResponse response) throws IOException {
        userInfoService.deleteUserInfo(id);
        response.sendRedirect("/list");
    }
}
