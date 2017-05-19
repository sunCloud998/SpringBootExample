package com.sfy.example.dao;

import com.sfy.example.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: UserDao.java
 * @User: sunfayun
 * @Date: 2017/05/18
 * @Version: 1.0
 */
@Repository
public interface UserInfoDao {

    int saveUserInfo(UserInfo userInfo);

    List<UserInfo> selectUserInfo();

    int deleteUserInfo(int id);

}
