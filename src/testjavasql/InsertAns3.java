package testjavasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertAns3 extends connection{
	Statement st;
	checklogin clogin;
	String uname = clogin.uname;
	

	public InsertAns3() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	} 
	String qus1;
	public String getQus1() {
		return qus1;
	}
	public void setQus1(String qus1) {
		this.qus1 = qus1;
	}
	public void display(){
		
		System.out.println(this.getQus1());
		
	}
	
	public boolean InsertData(){
		
		try {
			
			this.qus1 = getQus1();
			String query = "update projecttable set Answer3 = ? where UserName = ?";
		    PreparedStatement preparedStmt = this.connection.prepareStatement(query);
		    preparedStmt.setString   (1, this.getQus1());
		    preparedStmt.setString(2, this.uname);

		      // execute the java preparedstatement
		    preparedStmt.executeUpdate();
		    return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
		
}
}
