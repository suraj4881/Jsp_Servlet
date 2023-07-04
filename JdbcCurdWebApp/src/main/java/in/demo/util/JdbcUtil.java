package in.demo.util;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource; 

public class JdbcUtil {

	private JdbcUtil() {
	}

	static {
		// Step1: loading and register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	
	
	public static Connection getJdbcConnection() throws SQLException, IOException {

		String fileLoc = "D:\\\\workspace3\\\\JdbcCurdWebApp\\\\src\\\\main\\\\java\\\\in\\\\demo\\\\properties\\\\application.properties";
		HikariConfig config = new HikariConfig(fileLoc);
		HikariDataSource dataSource = new HikariDataSource(config);

		return dataSource.getConnection();
	}

	public static Connection physicalConnection() throws SQLException, IOException {
		String fileLoc = "D:\\workspace3\\JdbcCurdWebApp\\src\\main\\java\\in\\demo\\properties\\application.properties";
		FileInputStream fis = new FileInputStream(fileLoc);
		Properties properties = new Properties();
		properties.load(fis);

		String url = properties.getProperty("jdbcurl");
		String username = properties.getProperty("user");
		String password = properties.getProperty("password");

		return DriverManager.getConnection(url, username, password);
	}

}
