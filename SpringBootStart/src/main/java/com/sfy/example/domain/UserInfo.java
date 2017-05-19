package com.sfy.example.domain;

import lombok.Data;

/**
 * @Description: User.java
 * @User: sunfayun
 * @Date: 2017/05/18
 * @Version: 1.0
 */
@Data
public class UserInfo {

    private Integer id;
    private String userName;
    private String password;
    private Integer status;

}
