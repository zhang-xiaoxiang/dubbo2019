package com.example.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserApi:
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/19
 */
@RestController
public class UserApi {
    /**
     * dubbo的依赖注入
     */
    @Reference(version = "${demo.service.version}")
    private UserService userService;

    /**
     * rest接口
     * @param name
     * @return
     */
    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return userService.sayHello(name);
    }

}
