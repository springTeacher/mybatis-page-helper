package com.xiaoniu.service.impl;

import com.xiaoniu.mapper.auto.Sheet1Mapper;
import com.xiaoniu.model.auto.Sheet1;
import com.xiaoniu.service.Sheet1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Sheet1ServiceImpl implements Sheet1Service {

    @Autowired
    private Sheet1Mapper sheet1Mapper;

    @Override
    public List<Sheet1> queryList() {
        return sheet1Mapper.queryList();
    }
}
