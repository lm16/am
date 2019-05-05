package edu.uni.am.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.uni.am.domain.AmTeacherAbsence;
import edu.uni.am.domain.AmTeacherAbsenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmTeacherAbsenceMapper extends BaseMapper<AmTeacherAbsence> {
    int countByExample(AmTeacherAbsenceExample example);

    int deleteByExample(AmTeacherAbsenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmTeacherAbsence record);

    int insertSelective(AmTeacherAbsence record);

    List<AmTeacherAbsence> selectByExample(AmTeacherAbsenceExample example);

    AmTeacherAbsence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmTeacherAbsence record, @Param("example") AmTeacherAbsenceExample example);

    int updateByExample(@Param("record") AmTeacherAbsence record, @Param("example") AmTeacherAbsenceExample example);

    int updateByPrimaryKeySelective(AmTeacherAbsence record);

    int updateByPrimaryKey(AmTeacherAbsence record);
}