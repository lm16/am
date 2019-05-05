package edu.uni.am.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class AmStuLeaveConfirm {

    @TableId
    private Long id;
    private Long universityId;
    private Long stuAbsenceId;

    private Long studentId;
    private String status;
    private Date datetime;

    private Long byWho;
    private Integer deleted;
    private Long leaveBarId;

}