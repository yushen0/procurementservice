package com.yushen.procurementservice.login.daoImpl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.yushen.procurementservice.login.dao.UserDao;
import com.yushen.procurementservice.login.util.DBUtil;

/**
 * 
 * @class_name UserDaoImpl.java
 * @package_name com.yushen.procurementservice.login.daoImpl
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月8日 下午4:44:10
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String register(String username, String user_telephone, String password) {
        String tableName = "";
        String condition = "";
        String insertSQL = DBUtil.getInsertSQL(tableName, condition);

        String sql = "INSERT INTO user(username,user_telephone,password) VALUES(" + " '" + username
                + "','" + user_telephone + "','" + password + "')";
        Connection conn = DBUtil.getConn();
        QueryRunner queryRunner = new QueryRunner();
        try {
            queryRunner.insert(conn, sql, new ScalarHandler<>());
        } catch (SQLException e) {
            return "注册失败";
        }
        return "注册成功";
    }

}
