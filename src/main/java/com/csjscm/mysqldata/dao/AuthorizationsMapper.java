package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.Authorizations;

import java.util.List;


public interface AuthorizationsMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Authorizations record);

    int insertSelective(Authorizations record);

    Authorizations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authorizations record);
    List<Authorizations> selectAll();
    int countAuthorizations();
}