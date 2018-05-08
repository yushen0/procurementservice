package com.yushen.procurementservice.login.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yushen.procurementservice.login.dao.UserDao;
import com.yushen.procurementservice.login.entity.User;
import com.yushen.procurementservice.login.service.UserService;
import com.yushen.procurementservice.repository.UserRepository;

/**
 * 
 * @class_name UserServiceImpl.java
 * @package_name com.yushen.procurementservice.login.serviceImpl
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月7日 下午2:37:50
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserDao userDao;

    @Override
    public String login(String userName, String user_telephone,String password) {
        // 通过登录名查询用户信息
        User user = userRepository.getUserbyUserName(userName,user_telephone);
        return checkUser(user, password);
    }

    /**
     * 进行登录用户的校验(暂未进行加解密)
     * 
     * @param user
     */
    private String checkUser(User user, String password) {
        if (null == user) {
            return "用户不存在，确认后输入";
        }

        if (!password.equals(user.getPassword())) {
            return "密码错误，请重新输入";
        }
        
        return "登录成功";
    }

    @Override
    public String register(String username, String user_telephone, String password) {
        return userDao.register(username, user_telephone, password);
    }


}
