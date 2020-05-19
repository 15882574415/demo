package com.ego.demo.userservicedemo.service;


import com.ego.demo.userservicedemo.mapper.UserMapper;
import com.ego.demo.userservicedemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈〉
 *
 * @author coach tam
 * @email 327395128@qq.com
 * @create 2019/5/23
 * @since 1.0.0
 * 〈坚持灵活 灵活坚持〉
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
