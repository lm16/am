package com.uni.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.uni.domain.AmTeacherAbsence;
import com.uni.domain.AmTeacherAbsenceConfirm;
import com.uni.mapper.AmTeacherAbsenceConfirmMapper;
import com.uni.mapper.AmTeacherAbsenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/am/teacher/absence/confirm")
public class AmTeacherAbsenceConfirmController {

    @Autowired
    private AmTeacherAbsenceConfirmMapper amTeacherAbsenceConfirmMapper;
    @Autowired
    private AmTeacherAbsenceMapper amTeacherAbsenceMapper;


    /*

     */

    @PostMapping
    public int postTeacherAbsenceConfirm(@RequestBody AmTeacherAbsenceConfirm amTeacherAbsenceConfirm){
        int id = amTeacherAbsenceConfirmMapper.insert(amTeacherAbsenceConfirm);

        System.out.println("dddddddddddd"+id);
        return id;
    }


    @GetMapping
    public List<AmTeacherAbsenceConfirm> getAmTeacherAbsenceConfirm(@RequestParam(value = "studentId", required = false)Integer studentId){
        if(studentId == null)
            return amTeacherAbsenceConfirmMapper.selectList(null);
        else
            return amTeacherAbsenceConfirmMapper.selectList(new QueryWrapper<AmTeacherAbsenceConfirm>().eq("student_id", studentId));
    }

    /*

     */

    @PutMapping
    public int putAmTeacherAbsenceConfirm(@RequestBody AmTeacherAbsenceConfirm amTeacherAbsenceConfirm){
        int flag = amTeacherAbsenceConfirmMapper.updateById(amTeacherAbsenceConfirm);

        long id = amTeacherAbsenceConfirm.getEmployeeAbsenceId();
        int count = amTeacherAbsenceConfirmMapper.getByEmployeeAbsenceId(id);

        if(count == 3){
            AmTeacherAbsence amTeacherAbsence = amTeacherAbsenceMapper.selectById(id);
            amTeacherAbsence.setValid((byte)0);
            amTeacherAbsenceMapper.updateById(amTeacherAbsence);
        }

        return flag;
    }
}