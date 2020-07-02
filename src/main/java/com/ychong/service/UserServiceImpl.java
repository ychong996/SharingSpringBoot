package com.ychong.service;

import com.ychong.dao.UserDto;
import com.ychong.service.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto selectByAccountAndPwd(String account, String password) {
        return userMapper.selectByAccountAndPwd(account,password);
    }

    @Override
    public int insertUserDto(UserDto userDto) {
        return userMapper.insert(userDto);
    }

    @Override
    public int deleteByUserDtoId(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int deleteByAccount(String account) {
        return 0;
    }

    @Override
    public int updateByUserDtoId(UserDto userDto) {
        return userMapper.updateByPrimaryKey(userDto);
    }

    @Override
    public UserDto selectByUserDtoId(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public UserDto selectByUserAccount(String account) {
        return userMapper.selectByAccount(account);
    }

    @Override
    public List<UserDto> selectAllUserDto() {
        return userMapper.selectAllUserDto();
    }
}
