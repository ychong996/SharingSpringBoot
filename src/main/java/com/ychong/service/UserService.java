package com.ychong.service;

import com.ychong.dao.UserDto;

import java.util.List;

public interface UserService {
    UserDto selectByAccountAndPwd(String account,String password);
    int insertUserDto(UserDto userDto);
    int deleteByUserDtoId(Integer uid);
    int deleteByAccount(String account);
    int updateByUserDtoId(UserDto userDto);
    UserDto selectByUserDtoId(Integer uid);
    UserDto selectByUserAccount(String account);
    List<UserDto> selectAllUserDto();
}
