package com.qiming.qimingdata.dao;

import com.qiming.qimingdata.model.MemberUser;
import com.qiming.qimingdata.model.MemberUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberUserMapper {


    int deleteByPrimaryKey(String id);

    int insert(MemberUser record);

    int insertSelective(MemberUser record);



    MemberUser selectByPrimaryKey(String id);

    MemberUser selectByName(MemberUser record);
}