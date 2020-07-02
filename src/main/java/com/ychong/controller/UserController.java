package com.ychong.controller;

import com.ychong.dao.CommonResult;
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
    public CommonResult login(@RequestBody UserDto userDto){
       UserDto ud  = userService.selectByAccountAndPwd(userDto.getAccount(),userDto.getPassword());
        if (ud!=null){
            CommonResult<UserDto> commonResult = new CommonResult<UserDto>(ud);
            commonResult.setSuccess(true);
            return commonResult;
        }
        CommonResult<Object> commonResult = new CommonResult<Object>(null);
        commonResult.setSuccess(false);
        commonResult.setErrorMsg("暂无该用户");
        return commonResult;
    }

    @GetMapping(value = "/getUserInfo")
    public UserDto getUserInfo(@RequestParam(value = "uid") int uid){
        return userService.selectByUserDtoId(uid);
    }

    @PostMapping(value = "/updateUserInfo")
    public String updateUserInfo(@RequestBody UserDto userDto){
        UserDto ud =  userService.selectByUserAccount(userDto.getAccount());
        if (ud!=null){
            userDto.setId(ud.getId());
            int index = userService.updateByUserDtoId(userDto);
            return "修改行数 "+index;
        }
        return "修改失败";
    }
    @PostMapping(value = "/deleteUser")
    public String deleteUser(@RequestBody UserDto userDto){
        UserDto ud = userService.selectByUserAccount(userDto.getAccount());
        if (ud!=null){
            int index = userService.deleteByUserDtoId(ud.getId());
            return "删除成功 "+index;
        }
        return "没有此用户";
    }
}
