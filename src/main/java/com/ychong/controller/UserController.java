package com.ychong.controller;

import com.ychong.dao.UserDto;
import com.ychong.service.UserService;
import com.ychong.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public String login(@RequestBody UserDto userDto){
       UserDto ud  = userService.selectByAccountAndPwd(userDto.getAccount(),userDto.getPassword());
        if (ud!=null){
            return "登陆成功";
        }
        return "登陆失败";
    }

    @GetMapping(value = "/getUserInfo")
    public UserDto getUserInfo(@RequestParam(value = "uid") int uid){
        return userService.selectByUserDtoId(uid);
    }

    @PostMapping(value = "/updateUserInfo")
    public String updateUserInfo(@RequestBody UserDto userDto){
        UserDto ud =  userService.selectByUserAccount(userDto.getAccount());
        if (ud!=null){
            userDto.setUid(ud.getUid());
            int index = userService.updateByUserDtoId(userDto);
            return "修改行数 "+index;
        }
        return "修改失败";
    }
    @PostMapping(value = "/deleteUser")
    public String deleteUser(@RequestBody UserDto userDto){
        UserDto ud = userService.selectByUserAccount(userDto.getAccount());
        if (ud!=null){
            int index = userService.deleteByUserDtoId(ud.getUid());
            return "删除成功 "+index;
        }
        return "没有此用户";
    }
}
