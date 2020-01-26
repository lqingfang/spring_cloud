//package com.lqf.demo;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//@SpringBootApplication
//@Slf4j
//public class DataSourceDemoApplication implements CommandLineRunner {
//    public static void main(String[] args) {
//        SpringApplication.run(DataSourceDemoApplication.class,args);
//    }
//    @Autowired
//    private DataSource dataSource;
//
//    Logger log = LoggerFactory.getLogger(Logger.class);
//
//    public void run(String... args) throws Exception {
//        showConnection();
//    }
//
//    private void showConnection() throws SQLException {
//        log.info(dataSource.toString());
//        Connection conn = dataSource.getConnection();
//        log.info(conn.toString());
//        conn.close();
//    }
//}
