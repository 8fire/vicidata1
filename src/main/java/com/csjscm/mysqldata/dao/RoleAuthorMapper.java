package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.RoleAuth;

import java.util.List;
import java.util.Map;

/**
 * @author csjscm
 * create 2018-05-14 下午 1:46
 **/
public interface RoleAuthorMapper {
    List<RoleAuth> queryForWhere(Map<String,Object> map);
}
