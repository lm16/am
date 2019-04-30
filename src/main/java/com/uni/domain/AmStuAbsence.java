package com.uni.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
public class AmStuAbsence {

    @TableId
    private Long id;
    private Long universityId;
    private Long studentId;

    private Long curriculumId;
    private Byte status;
    private Date datetime;

    private Long byWho;
    private Integer deleted;

}
