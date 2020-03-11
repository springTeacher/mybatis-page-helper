package com.xiaoniu.vo;

import com.xiaoniu.model.auto.Sheet1;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@Builder
public class Sheet1VO implements Serializable {

    private static final long serialVersionUID = 362199455221562386L;

    /**
     * 记录列表
     */
    private List<Sheet1> list;

    /**
     * 总记录数
     */
    private Long total;

}
