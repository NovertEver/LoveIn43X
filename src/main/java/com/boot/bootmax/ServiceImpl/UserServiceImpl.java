package com.boot.bootmax.ServiceImpl;

import com.boot.bootmax.Bean.UserBean;
import com.boot.bootmax.Mapper.UserMapper;
import com.boot.bootmax.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}