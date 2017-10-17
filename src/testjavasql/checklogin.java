package testjavasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mpenderg
 */
public class checklogin extends connection{
    public checklogin() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
    static String uname;
	String UserName = "";
    String password = "";
   
    
   
  
   
  
  public void display(){
	  System.out.println(this.getUserName());
	  System.out.println(this.getPassword());
	  
  }
  
   public  String getUserName()
    {
      return UserName;
    }
  
   public void setUserName(String f)
   {
     UserName = f;
   }
  public  String getPassword()
    {
      return password;
    }
  
   public void setPassword(String p)
   {
     password = p;
   }
  
   public boolean login()
   {
	   boolean loggedIn = false;
   //   
   // database work
   //              
        try{
        	
         // open a connection
         // Connection con = null;
          //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
          //con = DriverManager.getConnection(url);
      //    con = DriverManager.getConnection("jdbc:sqlserver://rubble.checklogin.ad.fgcu.edu:1433;databaseName=sp12ism3232x;user=s12ISM3232;password=s12ISM3232;");
      // create the sql command
          PreparedStatement prep = this.connection.prepareStatement("Select UserName, Password from projecttable where UserName=? "); 
          prep.setString(1,this.getUserName());
         // prep.setString(2,password);
       
          ResultSet rs  = prep.executeQuery();
          if(rs.next())
          {
           this.UserName = rs.getString(1);
           this.password = rs.getString(2);
           this.uname = this.getUserName();
           loggedIn = true;
          }
          else
        	  loggedIn = false;
          
          
         
         }
        catch(Exception sqlex)
        {
        	loggedIn = false; 
        } 
       
        return loggedIn;
   }
  
 
}

