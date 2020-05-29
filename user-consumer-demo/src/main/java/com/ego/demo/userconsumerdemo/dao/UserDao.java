package com.ego.demo.userconsumerdemo.dao;

import com.ego.demo.userconsumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * 〈〉
 *
 * @author coach tam
 * @email 327395128@qq.com
 * @create 2019/5/23
 * @since 1.0.0
 * 〈坚持灵活 灵活坚持〉
 */
@Repository
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;
    public User getById(Long id) {
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//
//        ServiceInstance serviceInstance = instances.get(0);
//        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;

        String url = "http://localhost:8083/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }
}
