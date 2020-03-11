package com.xiaoniu.mapper.auto;

import com.xiaoniu.model.auto.Sheet1;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface Sheet1Mapper extends Mapper<Sheet1> {

    @Select("select *from sheet1")
    List<Sheet1> queryList();
}