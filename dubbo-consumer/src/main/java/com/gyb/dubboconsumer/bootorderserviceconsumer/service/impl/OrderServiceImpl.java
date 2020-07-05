package com.gyb.dubboconsumer.bootorderserviceconsumer.service.impl;

import bean.UserAddress;
import bootuserserviceprovider.service.OrderService;
import bootuserserviceprovider.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  将服务提供者注册到注册中心(暴漏服务)
 *     导入 dubbo 依赖
 *     配置服务提供者
 *
 *  让服务消费者去注册中心订阅服务提供者的服务地址
 * */

@Service
public class OrderServiceImpl implements OrderService {

    /**
     *  @Reference: 远程调用UserService, 自己会去注册中心去发现
     * */
    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:"+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
