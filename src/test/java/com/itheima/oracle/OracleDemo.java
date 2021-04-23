package com.itheima.oracle;

import org.junit.Test;

import java.sql.*;

public class OracleDemo {

    @Test
    public void javaCallOracle() throws SQLException, ClassNotFoundException {
        Class.forName("");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.109.10:1521:orcl", "itheima", "root");

        PreparedStatement pstm = connection.prepareStatement("select * from emp where empno=?");

        pstm.setObject(1, 7788);

         ;
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("ename"));
        }

        rs.close();
        pstm.close();
        connection.close();
    }
}
