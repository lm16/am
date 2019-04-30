package com.uni.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class AmTeacherAbsenceConfirm {

    @TableId
    private Long id;
    private Long universityId;
    private Long employeeAbsenceId;

    private Long studentId;
    private Byte status;
    private Date datetime;

    private Long byWho;
    private Integer deleted;

}