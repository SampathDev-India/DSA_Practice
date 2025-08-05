package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.Callable;
/**
 * 1.
 * 2.JDBC jar is needed - download and import or add the maven dep 
 * 
 */
public class DemoJDBC {
	public static void main(String[] args) throws Exception {
		// Types of Statements 
		// 1. normal statment like -> createStatement
		// 2. prepared statment like -> PreparedStatement
		// 3. callable statment
		
		displayRecord();
		insertRecord();
	}
	
	/**
	 * Fetching the Records from the database
	 * @throws Exception
	 */
	public static void displayRecord() throws Exception {
		System.out.println("Hii");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		String query = "select * from employee";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query); // executeQuery is only for Reading or fetching 
		
		while(rs.next()){
			System.out.println("ID 1st coloum value :"+ rs.getString(1));
			System.out.println("Name 2nd coloum value :"+ rs.getString(2));							
		}
		
		con.close();
		st.close();	
	}
	
	/**
	 * Insert the Records from the database
	 * @throws Exception
	 */
	public static void insertRecord() throws Exception {
		System.out.println("Hii");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		String query = "insert into employee values (2,'prem',25000)";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query); // executeUpdate is only for insert or update  
		
		System.out.println("Number of rows affected :"+ rows);
		
		con.close();
		st.close();	
	}
	
	/**
	 * insert Record With Variables from the database
	 * @throws Exception
	 */
	public static void insertRecordWithVariables() throws Exception {
		System.out.println("Hii");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		int id =5;
		String name = "Varun";
		int salary = 25000;
//		String query = "insert into employee values (2,'prem',25000)";
		String query = "insert into employee values ("+ id +",'"+name + "',"+salary +	")";
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query); // executeUpdate is only for insert or update  
		
		System.out.println("Number of rows affected :"+ rows);
		
		con.close();
		st.close();	
	}

	/**
	 * insert Record With Variables  with prepare stament from the database
	 * @throws Exception
	 */
	public static void insertRecordsWithPreparedStatment() throws Exception {
		System.out.println("Hii");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		int id =5;
		String name = "Varun";
		int salary = 25000;
//		String query = "insert into employee values (2,'prem',25000)";
		String query = "insert into employee values (?,?,?)"; // this prepared query 
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id); // it means 1 st ? assign to id like that 
		pst.setString(2, name);
		pst.setInt(3, salary);		
		int rows = pst.executeUpdate(); 
		
		System.out.println("Number of rows affected :"+ rows);
		
		con.close();
	}
	

	/**
	 * delete Record With Variables from the database
	 * @throws Exception
	 */
	public static void deleteRecord() throws Exception {
		System.out.println("Delete Record using JDBC ");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		int id =5;
		String query = "delete from employee where emp_id = "+id;
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query); // executeUpdate is only for insert or update  
		
		System.out.println("Number of rows affected :"+ rows);
		
		con.close();
		st.close();	
	}
	

	/**
	 * update Record With Variables from the database
	 * @throws Exception
	 */
	public static void updateRecord() throws Exception {
		System.out.println("Delete Record using JDBC ");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		String query = "update employee set salary =10000 where id = 5 ";
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query); // executeUpdate is only for insert or update  
		
		System.out.println("Number of rows affected :"+ rows);
		
		con.close();
		st.close();	
	}
	
	/**
	 * store procedure callable from the database
	 * @throws Exception
	 */
	public static void readRecordsCallable() throws Exception {
		System.out.println(" Record using JDBC ");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		String query = "select * form employee ";
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		CallableStatement cst = con.prepareCall("{call GetEmp()}");
		ResultSet rs = cst.executeQuery(); 
				
		while(rs.next()){
			System.out.println("ID 1st coloum value :"+ rs.getString(1));
			System.out.println("Name 2nd coloum value :"+ rs.getString(2));							
		}				
		con.close();
	}
	
	
	
	
}
