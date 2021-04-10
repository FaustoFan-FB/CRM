package com.faustofan.crm.settings.service.impl;

import com.faustofan.crm.settings.dao.UserDao;
import com.faustofan.crm.settings.service.UserService;
import com.faustofan.crm.utils.SqlSessionUtil;


/**
 * @author: fausto
 * @date: 2021/4/10 18:15
 * @description:
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao=SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
	
}
