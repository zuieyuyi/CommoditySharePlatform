package com.commodityshareplatform.subject;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@ContextConfiguration(locations = { "classpath*:spring.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ConnectTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testConnect() throws SQLException {
        Connection connection = dataSource.getConnection();

        System.out.println(connection.toString());
    }

}
