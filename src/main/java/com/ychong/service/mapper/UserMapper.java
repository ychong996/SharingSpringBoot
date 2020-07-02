package com.ychong.service.mapper;

import com.ychong.dao.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(UserDto userDto);
    int deleteByPrimaryKey(Integer uid);
    int updateByPrimaryKey(UserDto userDto);
    UserDto selectByPrimaryKey(Integer id);
    UserDto selectByAccount(String account);
    List<UserDto> selectAllUserDto();
    UserDto selectByAccountAndPwd(@Param("account") String account, @Param("password") String password);
}
