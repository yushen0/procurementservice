package com.yushen.procurementservice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yushen.procurementservice.login.entity.User;

/**
 * 
 * @class_name UserRepository.java
 * @package_name com.yushen.procurementservice.repository
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月7日 下午2:40:11
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT u.username as username,u.password as password FROM USER u WHERE u.username = ?1 AND u.user_telephone =?2")
    User getUserbyUserName(String username,String user_telephone);

}
