package com.yushen.procurementservice.login.service;

/**
 * 
 * @class_name UserService.java
 * @package_name com.yushen.procurementservice.login.service
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月7日 下午2:34:41
 */
public interface UserService {

    public String login(String userName, String user_telephone,String password);

    public String register(String username, String user_telephone, String password);


}
