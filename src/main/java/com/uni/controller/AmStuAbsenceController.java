package com.uni.controller;

import com.uni.domain.AmStuAbsence;
import com.uni.mapper.AmStuAbsenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/stu/absence")
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
