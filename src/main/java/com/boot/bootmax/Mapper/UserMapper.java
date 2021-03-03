package com.boot.bootmax.Mapper;

import com.boot.bootmax.Bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    UserBean getInfo(@Param("name") String name, @Param("password") String password);
}
