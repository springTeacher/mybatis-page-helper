package com.xiaoniu.vo;

import com.xiaoniu.model.auto.AdManagement;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lihoujing
 * @date 2019/11/5 18:28
 */
@Data
@Builder
public class AdManagementVO implements Serializable {
    private static final long serialVersionUID = 362199455271562386L;


    /**
     * 记录列表
     */
    private List<AdManagement> list;

    /**
     * 总记录数
     */
    private Long total;


}
