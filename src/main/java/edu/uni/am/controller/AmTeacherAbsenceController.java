package edu.uni.am.controller;

import edu.uni.am.domain.AmTeacherAbsence;
import edu.uni.am.domain.AmTeacherAbsenceConfirm;
import edu.uni.am.domain.AmTeacherAbsenceExample;
import edu.uni.am.mapper.AmTeacherAbsenceConfirmMapper;
import edu.uni.am.mapper.AmTeacherAbsenceMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/am/teacher/absence")
public class AmTeacherAbsenceController {


    @Autowired
    private AmTeacherAbsenceMapper amTeacherAbsenceMapper;
    @Autowired
    private AmTeacherAbsenceConfirmMapper amTeacherAbsenceConfirmMapper;

    @PostMapping()
    private int postTeacherAbsence(@RequestBody AmTeacherAbsence amTeacherAbsence){
        int flag = amTeacherAbsenceMapper.insert(amTeacherAbsence);

        Long id = amTeacherAbsence.getId();
        AmTeacherAbsenceConfirm amTeacherAbsenceConfirm = new AmTeacherAbsenceConfirm();
        amTeacherAbsenceConfirm.setEmployeeAbsenceId(id);
        for(int i=0; i<3; i++){
            amTeacherAbsenceConfirm.setStudentId(133127+(long)i);
            amTeacherAbsenceConfirmMapper.insert(amTeacherAbsenceConfirm);
        }

        return flag;
    }

    @GetMapping()
    public List<AmTeacherAbsence> getTeacherAbsence(){
        return amTeacherAbsenceMapper.selectList(null);
    }

}