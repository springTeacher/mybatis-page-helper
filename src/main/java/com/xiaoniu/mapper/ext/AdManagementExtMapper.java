package com.xiaoniu.mapper.ext;

import com.xiaoniu.model.auto.AdManagement;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdManagementExtMapper extends Mapper<AdManagement> {


    int insertBatch(List<AdManagement> list);


    int insert(AdManagement adManagement);
}