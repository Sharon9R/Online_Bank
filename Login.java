import java.util.*;
public class Login extends User {
	public String uname,pass,login;
    public Login(String name,String DOB,String Gender,int age,String Email,String Mobile1,String address,String Country,String State,String pass,String uname,String pass1,String login) {
        super(name, DOB, Gender, age, Email, Mobile1, address, Country, State, pass1);
    	this.uname=uname;
    	this.pass=pass;
    	this.login=login;
    	
    }
    
   
}
