package com.example.provider.serivce.servuceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.UserService;

/**
 * UserServiceImpl:
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/19
 */
@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "你好! " + name;
    }
}
