package com.xiaoniu.service.impl;

import com.xiaoniu.mapper.auto.AdManagementMapper;
import com.xiaoniu.mapper.ext.AdManagementExtMapper;
import com.xiaoniu.model.auto.AdManagement;
import com.xiaoniu.service.AdManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lihoujing
 * @date 2019/11/5 18:24
 */
@Service
public class AdManagementServiceImpl implements AdManagementService {

    @Autowired
    private AdManagementMapper adManagementMapper;

    @Autowired
    private AdManagementExtMapper adManagementExtMapper;



    @Override
    public List<AdManagement> queryAdList() {
        return adManagementMapper.selectAll();
    }

    @Override
    public int insertBatch(List<AdManagement> adManagements) {
        return adManagementExtMapper.insertBatch(adManagements);
    }

    @Override
    public int insert(AdManagement adManagement) {
        return adManagementExtMapper.insert(adManagement);
    }
}
