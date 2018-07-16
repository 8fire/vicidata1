package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.Discuss;

import java.util.List;

public interface DiscussMapper {


    int insertComment(Discuss discuss);



    List<Discuss> selectCommentByWhere(Discuss discuss);

    int updateComment(Discuss discuss);


}