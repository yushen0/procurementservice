package com.yushen.procurementservice.login.dao;

/**
 * 
 * @class_name UserDao.java
 * @package_name com.yushen.procurementservice.login.dao
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月8日 下午4:43:01
 */
public interface UserDao {

    public String register(String username, String user_telephone, String password);
}
