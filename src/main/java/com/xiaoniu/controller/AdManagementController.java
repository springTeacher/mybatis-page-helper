package com.xiaoniu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoniu.model.auto.AdManagement;
import com.xiaoniu.service.AdManagementService;
import com.xiaoniu.vo.AdManagementVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 广告配置
 *
 * @author lihoujing
 * @date 2019/11/5 18:19
 */
@RestController
@RequestMapping("/")
public class AdManagementController {

    @Autowired
    private AdManagementService adManagementService;


    @GetMapping("/list")
    public AdManagementVO selectByPage(@RequestParam Integer pageIndex,
                                       @RequestParam Integer pageSize){
        //pageHelper物理分页
        PageHelper.startPage(pageIndex, pageSize);
        List<AdManagement> adManagementList = adManagementService.queryAdList();
        PageInfo<AdManagement> pageInfo = new PageInfo<>(adManagementList);
        return AdManagementVO.builder().list(pageInfo.getList())
                .total(pageInfo.getTotal()).build();
    }


    @PostMapping("/batch")
    public int insertBatch(){
        List<AdManagement> adManagements = new ArrayList<>();
        AdManagement adManagement;
        for (int i=0; i<1000;i++){
            adManagement = new AdManagement();
            adManagement.setCodeId("0000"+i);
            adManagement.setCodeName("张三"+i);
            adManagement.setSource(i);
            adManagements.add(adManagement);
        }
        long startTime = System.currentTimeMillis();
        //批量插入
        int success = adManagementService.insertBatch(adManagements);
        System.out.println(System.currentTimeMillis() - startTime);
        return success;
    }




    @PostMapping("/one")
    public void insert(){

        for (int i=0; i<1000;i++){
        AdManagement adManagement = new AdManagement();
            adManagement.setCodeId("0000"+i);
            adManagement.setCodeName("张三"+i);
            adManagement.setSource(i);
            adManagementService.insert(adManagement);
        }

    }







}
