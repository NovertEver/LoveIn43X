package com.boot.bootmax;


import com.boot.bootmax.Bean.UserBean;
import com.boot.bootmax.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplicationTests{

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("user","password");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}