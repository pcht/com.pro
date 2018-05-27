package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;

import dto.AccountDTO;
import util.HibernateUtil;

public class AccountDAO {
	private static Connection dBConnection;
	private static PreparedStatement accountPreparedStatement;

	public AccountDAO(Connection dBConnection) {
		this.dBConnection = dBConnection;
	}

	public static void createDataToDB(AccountDTO accountDTO) {
		try {
			String insertQueryStatement = "INSERT  INTO  ACCOUNT  VALUES  (?,?,?,?,?,?,?,?)";
			accountPreparedStatement = dBConnection.prepareStatement(insertQueryStatement);
			accountPreparedStatement.setInt(1, accountDTO.getId());
			accountPreparedStatement.setString(2, accountDTO.getUserName());
			accountPreparedStatement.setString(3, accountDTO.getPassWord());
			accountPreparedStatement.setString(4, accountDTO.getEmail());
			accountPreparedStatement.setInt(5, accountDTO.getIsSuperUser());
			accountPreparedStatement.setInt(6, accountDTO.getIsStaff());
			accountPreparedStatement.setDate(7, accountDTO.getLastLogin());
			accountPreparedStatement.setDate(8, accountDTO.getDateJoined());
			
			accountPreparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataFromDB() {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();

	    // Check database version
	    String sql = "select * from account";

	    String result = (String) session.createNativeQuery(sql).getSingleResult();
	    System.out.println(result);

	    session.getTransaction().commit();
	    session.close();

	    
	    HibernateUtil.shutdown();
	}

}
