package com.wangheng.dao.mapping;

import com.wangheng.dao.entity.TaccountInfo;
import com.wangheng.dao.entity.TaccountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaccountInfoMapper {
    long countByExample(TaccountInfoExample example);

    int deleteByExample(TaccountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaccountInfo record);

    int insertSelective(TaccountInfo record);

    List<TaccountInfo> selectByExample(TaccountInfoExample example);

    TaccountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaccountInfo record, @Param("example") TaccountInfoExample example);

    int updateByExample(@Param("record") TaccountInfo record, @Param("example") TaccountInfoExample example);

    int updateByPrimaryKeySelective(TaccountInfo record);

    int updateByPrimaryKey(TaccountInfo record);
}