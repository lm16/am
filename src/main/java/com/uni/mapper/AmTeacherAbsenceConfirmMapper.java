package com.uni.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uni.domain.AmTeacherAbsenceConfirm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AmTeacherAbsenceConfirmMapper extends BaseMapper<AmTeacherAbsenceConfirm> {

    @Select("select COUNT(*) from am_teacher_absence_confirm where employee_absence_id = #{employeeAbsenceId} and status=0")
    int getByEmployeeAbsenceId(Long employeeAbsenceId);
}
