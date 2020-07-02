package com.ychong.service.mapper;

import com.ychong.dao.MenuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDto> selectAll();
}
