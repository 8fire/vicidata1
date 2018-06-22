package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.MemberUser;


import java.util.List;
import java.util.Map;


public interface MemberUserMapper {


    int deleteByPrimaryKey(Integer id);


    int insertSelective(MemberUser record);

    List<MemberUser> selectBywhere(MemberUser record);

    MemberUser selectByPrimaryKey(Integer id);

    int updateById(Map<String,Object> map);

    MemberUser selectByName(MemberUser record);
}