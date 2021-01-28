package com.st.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: shentao
 * @Date: 2021/1/28 0028 16:12
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    /**真实姓名*/
    private String realName;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    /**性别*/
    private String gender;
    /**年龄*/
    private String age;
    /**手机号*/
    private String phoneNumber;
    /**用户等级*/
    private String level;
    /**访问权限*/
    private String accessLevel;
}
