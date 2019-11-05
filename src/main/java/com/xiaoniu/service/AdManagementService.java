package com.xiaoniu.service;

import com.xiaoniu.model.auto.AdManagement;

import java.util.List;

/**
 * @author lihoujing
 * @date 2019/11/5 18:23
 */
public interface AdManagementService {



    List<AdManagement> queryAdList();


    int insertBatch(List<AdManagement> adManagements);

    int insert(AdManagement adManagement);
}
