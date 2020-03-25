package com.fz.dubbo.provider.service.impl;

import com.fz.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName DemoServiceImpl
 * @Description DemoService实现类
 * @Author fangzheng
 * @Date 2020/3/4 22:35
 * @Version V1.0
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name + ", I'm provider!";
    }
}
