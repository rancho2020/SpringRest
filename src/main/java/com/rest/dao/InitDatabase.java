package com.rest.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class InitDatabase implements InitializingBean {
    @Autowired
    private DataSource dataSource;

    @Override
    public void afterPropertiesSet() throws Exception {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        statement.executeUpdate("CREATE TABLE billionaires (\n" +
                "  id INT AUTO_INCREMENT  PRIMARY KEY,\n" +
                "  first_name VARCHAR(250) NOT NULL,\n" +
                "  last_name VARCHAR(250) NOT NULL,\n" +
                "  career VARCHAR(250) DEFAULT NULL\n" +
                ")");

        statement.executeUpdate("INSERT INTO billionaires (first_name, last_name, career) VALUES\n" +
                "  ('DAGA', 'SATH', 'e-Commerce'),\n" +
                "  ('RANGA', 'BILLA', 'Entrepreneur'),\n" +
                "  ('TEJA', 'KUMAR', 'Hotel');");
        statement.close();
        connection.close();
    }
}
