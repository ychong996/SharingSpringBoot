package com.ychong.controller;

import com.ychong.dao.CommonResult;
import com.ychong.dao.MenuDto;
import com.ychong.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {
    @Autowired
    MenuService menuService;
    @GetMapping(value = "/getMenuList")
    public CommonResult getMenuList(){
        List<MenuDto> list = menuService.getMenuList();
        CommonResult<List<MenuDto>> commonResult = new CommonResult<List<MenuDto>>(list);
        commonResult.setSuccess(true);
        return commonResult;
    }
}
