package edu.uni.am.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.uni.am.domain.AmStuAbsence;
import edu.uni.am.domain.AmStuAbsenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmStuAbsenceMapper extends BaseMapper<AmStuAbsence> {

    int countByExample(AmStuAbsenceExample example);

    int deleteByExample(AmStuAbsenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmStuAbsence record);

    int insertSelective(AmStuAbsence record);

    List<AmStuAbsence> selectByExample(AmStuAbsenceExample example);

    AmStuAbsence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmStuAbsence record, @Param("example") AmStuAbsenceExample example);

    int updateByExample(@Param("record") AmStuAbsence record, @Param("example") AmStuAbsenceExample example);

    int updateByPrimaryKeySelective(AmStuAbsence record);

    int updateByPrimaryKey(AmStuAbsence record);
}