package com.green.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigTest06DatasourceApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getData() throws SQLException {
        System.out.println(dataSource.getClass());
        //获取链接信息
        Connection connection = dataSource.getConnection();
        System.out.println("获取数据库信息"+connection);
    }
}
