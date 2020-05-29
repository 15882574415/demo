package com.ego.demo.userconsumerdemo.controller;

import com.ego.demo.userconsumerdemo.pojo.User;
import com.ego.demo.userconsumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈〉
 *
 * @author coach tam
 * @email 327395128@qq.com
 * @create 2019/5/23
 * @since 1.0.0
 * 〈坚持灵活 灵活坚持〉
 */
@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getList(@RequestParam("ids") List<Long> ids)
    {
        return userService.getList(ids);
    }
}
