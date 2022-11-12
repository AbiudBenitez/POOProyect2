package com.project.model;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPool {
  private final String DB = "servitec";
  private final String URL = "jdbc:mysql://localhost:3306/" + DB;
  private final String USER = "root";
  private final String PASS = "";

  private static ConnectionPool dataSource;
  private BasicDataSource basicDataSource = null;

  private ConnectionPool() {
    basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    basicDataSource.setUsername(USER);
    basicDataSource.setPassword(PASS);
    basicDataSource.setUrl(URL);
  }

  public static ConnectionPool getInstance() {
    if (dataSource == null) {
      dataSource = new ConnectionPool();
      return dataSource;
    }
    return dataSource;
  }

  public Connection getConnection() throws SQLException {
    return this.basicDataSource.getConnection();
  }

  public void closeConnection(Connection connection) throws SQLException {
    connection.close();
  }
}
