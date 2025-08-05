package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJDBC_Advanced {
	public static void main(String[] args) throws Exception {
		
	}
	
	/**
	 * demoCommit from the database
	 * @throws Exception
	 */
	public static void demoCommit() throws Exception {
		System.out.println(" Record using JDBC ");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		String query = "select * form employee ";
		String query1 = "update employee set salary = 55000 where emp_id = 1";
		String query2 = "update employee set salary = 55000 where emp_id = 2";
		System.out.println("Query : "+query);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		con.setAutoCommit(false); // it means if commit the code it will update until pending state
		Statement cst = con.createStatement();
		int rows1 = cst.executeUpdate(query1 );  // number of row affected after update
		int rows2 = cst.executeUpdate(query2 );  // number of row affected after update
			
		if(rows1 > 0 && rows2 >0) {
			con.commit(); // it the condition statisfied commit the changes for the pending state 
		}
					
		con.close();
	}
	
	/**
	 * batchDemo from the database
	 * bulk of query execution at the same time its a batch 
	 * @throws Exception
	 */
	public static void batchDemo() throws Exception {
		System.out.println(" Record using JDBC ");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String userName = "root";
		String password ="root";
		
		String query1 = "update employee set salary = 55000 where emp_id = 1";
		String query2 = "update employee set salary = 55000 where emp_id = 2";
		String query3 = "update employee set salary = 55000 where emp_id = 3";
		String query4 = "update employee set salary = 55000 where emp_id = 4";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		// 1. auto commit false 
		con.setAutoCommit(false); // it means if commit the code it will update until pending state
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
		int [] res = st.executeBatch();		// execute batch 
		
		for(int i=0;i< res.length;i++) {
			System.out.println(" rows offected "+i);
			if(i>0) {
				continue;
			}else {
				// 2. roleBack 
				con.rollback();  // if anything has error rollback the changes
			}
		}
		
		// 3. commit --> 
		con.commit();
				
		con.close();
	}


}
