package com.uni;

import com.uni.domain.AmStuAbsence;
import com.uni.domain.AmTeacherAbsence;
import com.uni.mapper.AmStuAbsenceMapper;
import com.uni.mapper.AmStuLeaveConfirmMapper;
import com.uni.mapper.AmTeacherAbsenceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniApplicationTests {

    @Autowired
    private AmStuAbsenceMapper amStuAbsenceMapper;
    @Autowired
    private AmStuLeaveConfirmMapper amStuLeaveConfirmMapper;
    @Autowired
    private AmTeacherAbsenceMapper amTeacherAbsenceMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void amStuAbsence(){
//        amStuAbsenceMapper.selectList(null);
        AmStuAbsence amStuAbsence = new AmStuAbsence();
        amStuAbsence.setUniversityId(1L);
        amStuAbsence.setStudentId(133127L);
        amStuAbsence.setCurriculumId(158034L);
        amStuAbsence.setStatus((byte)2);
        amStuAbsence.setDatetime(new Date());
        amStuAbsence.setByWho(133101L);

        amStuAbsenceMapper.insert(amStuAbsence);
    }

    @Test
    public void amStuLeaveConfirm(){

    }

    @Test
    public void amTeacherAbsence(){
        amTeacherAbsenceMapper.selectList(null);
    }
}
