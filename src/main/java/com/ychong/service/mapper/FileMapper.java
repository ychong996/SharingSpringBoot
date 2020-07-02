package com.ychong.service.mapper;

import com.ychong.dao.FileDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
    List<FileDto> selectAll();
}
