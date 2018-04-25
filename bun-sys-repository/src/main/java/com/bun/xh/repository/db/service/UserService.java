package com.bun.xh.repository.db.service;

import com.bun.xh.repository.db.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xin on 2018/4/7.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


}
