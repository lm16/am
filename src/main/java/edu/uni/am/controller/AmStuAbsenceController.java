package edu.uni.am.controller;

import edu.uni.am.domain.AmStuAbsence;
import edu.uni.am.domain.AmStuAbsenceExample;
import edu.uni.am.mapper.AmStuAbsenceMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("am/stu/absence")
public class AmStuAbsenceController {


    @Autowired
    private AmStuAbsenceMapper amStuAbsenceMapper;

    @PostMapping
    public int postAmStuAbsence(@RequestBody AmStuAbsence amStuAbsence){

        amStuAbsence.setDatetime(new Date());
        return amStuAbsenceMapper.insert(amStuAbsence);
    }

    @GetMapping
    public List<AmStuAbsence> getAmStuAbsence(){
        return amStuAbsenceMapper.selectList(null);
    }

}