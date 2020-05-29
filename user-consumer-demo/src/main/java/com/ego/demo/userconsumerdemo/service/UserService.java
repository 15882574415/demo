package com.ego.demo.userconsumerdemo.service;

import com.ego.demo.userconsumerdemo.dao.UserDao;
import com.ego.demo.userconsumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getList(List<Long> ids) {
        List<User> result = new ArrayList<>();
        if(ids!=null&&ids.size()>0)
        {
            for (Long id : ids) {
                User user = userDao.getById(id);
                result.add(user);
            }
        }
        return result;
    }
}
