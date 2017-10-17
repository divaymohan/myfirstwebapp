
package testjavasql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Testjavasql extends connection
{
public Testjavasql() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


private String firstName,lastName,email,userName,password1,password2,zip,city,notify;
private int age;
private Hashtable errors;

Statement st;

//try


public boolean validate() {
	boolean bool = true;
	try{

 
if (firstName.equals(""))
{
//errors.put("firstName","Please enter your first name");
firstName="";
bool=false;
}
if (lastName.equals(""))
{
//errors.put("lastName","Please enter your last name");
lastName="";
bool=false;
}
if (email.equals("") || (email.indexOf('@') == -1))
{
//errors.put("email","Please enter a valid email address");
email="";
bool=false;
}
 
if (age>130)
{
//errors.put("age","Please enter a valid Age");
age=0;
bool=false;
}
 
if (city.equals(""))
{
//errors.put("city","Please enter your city name");
city="";
bool=false;
}
 
if (zip.equals("") || zip.length() !=6 )
{
//errors.put("zip","Please enter a valid zip code");
zip="";
bool=false;
}
else
{
try {
int x = Integer.parseInt(zip);
} catch (NumberFormatException e)
{
//errors.put("zip","Please enter a valid zip code");
zip="";
bool=false;
}
}
 
if (userName.equals(""))
{
//errors.put("userName","Please enter a username");
userName="";
bool=false;
}
 
if (password1.equals("") )
{
//errors.put("password1","Please enter a valid password");
password1="";
bool=false;
}
 
if (!password1.equals("") && (password2.equals("") || !password1.equals(password2)))
{
//errors.put("password2","Please confirm your password");
password2="";
bool=false;
}


}
	catch(Exception e){
		e.printStackTrace();
	}
	return bool;
		
}

	


	
public String getErrorMsg(String s)
{
String errorMsg =(String)errors.get(s.trim());
return (errorMsg == null) ? "":errorMsg;
}
public void insertData()
{
	try{

st= this.connection.createStatement();
//String table = "create table if not exists projecttable(First_Name varchar(20),Last_Name varchar(20),EmailAddress varchar(40),Age int(4),City varchar(15),Zip_Code varchar(10),UserName varchar(15),Password varchar(15))";
//st.executeUpdate(table);
this.firstName=getFirstName();
this.lastName=getLastName();
this.email=getEmail();
this.age=getAge();
this.city=getCity();
this.zip=getZip();
this.userName=getUserName();
this.password1=getPassword1();
st.executeUpdate("insert into projecttable(First_Name,Last_Name,EmailAddress,Age,City,Zip_Code,UserName,Password) values('"+firstName+"','"+lastName+"','"+email+"','"+age+"','"+city+"','"+zip+"','"+userName+"','"+password1+"')");
System.out.println("Store into the database");
} catch (Exception ex)
{
System.out.println("Error in connection::"+ex.getCause());
}
}
 

 
public String getFirstName() {
return firstName;}
public String getLastName() {
return lastName;}
 
public String getEmail() {
return email;}
 
public int getAge() {
return age;}
 
public String getUserName() {
return userName;}
 
public String getPassword1() {
return password1;}
 
public String getPassword2() {
return password2;}
 
public String getCity() {
return city;}
 
public String getZip() {
return zip;}
 
public void setFirstName(String fname) {
this.firstName =fname;}
 
public void setLastName(String lname) {
this.lastName =lname;}
 
public void setEmail(String eml) {
	this.email=eml;}
 
public void setAge(int age) {
this.age=age;}
 
public void setUserName(String u) {
	this.userName=u;}
 
public void setPassword1(String p1) {
	this.password1=p1;}
 
public void setPassword2(String p2) {
	this.password2=p2;}
 
public void setCity(String city) {
this.city=city;}
 
public void setZip(String z) {
	this.zip=z;}
}