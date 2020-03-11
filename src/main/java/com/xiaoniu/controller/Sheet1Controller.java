package com.xiaoniu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoniu.model.auto.Sheet1;
import com.xiaoniu.service.Sheet1Service;
import com.xiaoniu.vo.Sheet1VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Sheet1Controller {

    @Autowired
    private Sheet1Service sheet1Service;

    @GetMapping("/all")
    public List<Sheet1> queryAll(){

        return sheet1Service.queryList();
    }


    @GetMapping("/page")
    public Sheet1VO queryByPage(@RequestParam Integer pageIndex,
                                    @RequestParam Integer pageSize){
        //pageHelper物理分页
        PageHelper.startPage(pageIndex, pageSize);
        List<Sheet1> sheet1List = sheet1Service.queryList();
        PageInfo<Sheet1> pageInfo = new PageInfo<>(sheet1List);
        return Sheet1VO.builder().list(pageInfo.getList())
                .total(pageInfo.getTotal()).build();
    }
}
