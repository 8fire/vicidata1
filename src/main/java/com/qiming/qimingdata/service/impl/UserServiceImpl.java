package com.qiming.qimingdata.service.impl;


import com.qiming.qimingdata.dao.MemberUserMapper;

import com.qiming.qimingdata.model.MemberUser;
import com.qiming.qimingdata.model.MemberUserExample;
import com.qiming.qimingdata.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Resource
    private MemberUserMapper memberUserMapper;

    @Override
    public MemberUser findByUsername(String name) {
        log.info("=========================servers====>");
        MemberUserExample memberUserExample=new MemberUserExample();
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(name);
      //  MemberUserExample.Criteria criteria = memberUserExample.createCriteria().andLoginEmailEqualTo(name);
      //  List<MemberUser> memberUsers = memberUserMapper.selectByExample(memberUser);
        MemberUser user = memberUserMapper.selectByName(memberUser);
        log.info("=========================servers====>"+user.getId());
        return user;
    }

    /*@Override
    public List<User> findAll() {
        return userRepository.findAll();
    }*/

}
