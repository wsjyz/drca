package com.eighthinfo.drca.service.impl;

import com.eighthinfo.drca.dao.UserDAO;
import com.eighthinfo.drca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by dam on 14-1-12.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("UserDAO")
    private UserDAO userDAO;
}
