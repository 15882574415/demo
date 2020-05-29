package com.ego.demo.userconsumerdemo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈〉
 *
 * @author coach tam
 * @email 327395128@qq.com
 * @create 2019/5/23
 * @since 1.0.0
 * 〈坚持灵活 灵活坚持〉
 */
public class User implements Serializable {


    private Long id;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 姓名
    private String phone;


    // 创建时间
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
