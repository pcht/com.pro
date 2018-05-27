package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	static String DATABASE_TYPE = "mysql";
	static String CLASS_FORNAME = "com." + DATABASE_TYPE + ".jdbc.Driver";
	static String IP = "localhost";
	static String PORT = "3306";
	static String DATABASE_NAME = "crunchify";
	static String CONNECTION = "jdbc:" + DATABASE_TYPE + "://" + IP + ":" + PORT + "/" + DATABASE_NAME;
	static String USER_NAME = "root";
	static String PASSWORD = "root";

	public static Connection makeJDBCConnection() {
		Connection dBConnection = null;
		try {
			Class.forName(CLASS_FORNAME);
			log("MySQL database registered!");
		} catch (ClassNotFoundException e) {
			log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
			e.printStackTrace();
			return dBConnection;
		}

		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			dBConnection = DriverManager.getConnection(CONNECTION, USER_NAME, PASSWORD);
			if (dBConnection != null) {
				log("Connection Successful! Enjoy. Now it's time to push data");
			} else {
				log("Failed to make connection!");
			}
		} catch (SQLException e) {
			log("MySQL Connection Failed!");
			e.printStackTrace();
			return dBConnection;
		}
		return dBConnection;
	}

	private static String log(String string) {
		return string;
	}

}
