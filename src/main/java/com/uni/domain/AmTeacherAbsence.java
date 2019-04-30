package com.uni.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class AmTeacherAbsence {

    @TableId
    private Long id;
    private Long universityId;
    private Long employeeId;

    private Long curriculumId;
    private Byte status;
    private Byte valid;

    private Date datetime;
    private Long byWho;
    private Integer deleted;

}
