package com.easyzhang.user.service.ezshow.impl;


import com.easyzhang.frame.annotations.EZService;
import com.easyzhang.user.service.ezshow.HelloService;

/**
 * @author EasyZhang
 * @date 2018/8/25 -  17:01
 */
@EZService
public class HelloServiceImpl implements HelloService{

    @Override
    public String hello() {
        return "hello world from HelloService";
    }

    @Override
    public String china(String user) {
        return "hello world "+user;
    }
}
