package com.ychong.service;

import com.ychong.dao.MenuDto;
import com.ychong.service.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<MenuDto> getMenuList() {
        return menuMapper.selectAll();
    }
}
