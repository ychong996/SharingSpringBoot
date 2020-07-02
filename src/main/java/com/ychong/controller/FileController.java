package com.ychong.controller;

import com.ychong.dao.CommonResult;
import com.ychong.dao.FileDto;
import com.ychong.dao.MenuDto;
import com.ychong.service.FileService;
import com.ychong.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/File")
public class FileController {
    @Autowired
    FileService fileService;
    @GetMapping(value = "/getFileList")
    public CommonResult getFileList(){
        List<FileDto> list = fileService.getFileList();
        CommonResult<List<FileDto>> commonResult = new CommonResult<List<FileDto>>(list);
        commonResult.setSuccess(true);
        return commonResult;
    }
}
