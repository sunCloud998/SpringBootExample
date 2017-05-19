package com.sfy.example.service;

import com.sfy.example.dao.UserInfoDao;
import com.sfy.example.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: UserInfoService.java
 * @User: sunfayun
 * @Date: 2017/05/18
 * @Version: 1.0
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public boolean saveUserInfo(UserInfo userInfo){
        return userInfoDao.saveUserInfo(userInfo) == 1;
    }

    public List<UserInfo> getAllUser(){
        return userInfoDao.selectUserInfo();
    }

    public boolean deleteUserInfo(int id){
        return userInfoDao.deleteUserInfo(id) == 1;
    }

}
