package com.gyb.dubboprovider.bootuserserviceprovider.service.impl;

import bean.UserAddress;
import bootuserserviceprovider.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 敲黑板，这里的Service可不是Spring提供的
 * 这是Dubbo中暴露接口的Service
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress address1 = new UserAddress(1, "河北省衡水市故城县西半屯镇", "1", "carson","12345678911","Y");
        UserAddress address2 = new UserAddress(1, "山东省德州市", "2", "eason", "4562144", "Y");

        return Arrays.asList(address1,address2);
    }
}
