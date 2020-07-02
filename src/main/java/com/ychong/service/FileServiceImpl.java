package com.ychong.service;

import com.ychong.dao.FileDto;
import com.ychong.service.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    FileMapper fileMapper;
    @Override
    public List<FileDto> getFileList() {
        return fileMapper.selectAll();
    }
}
