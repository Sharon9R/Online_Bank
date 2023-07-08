import java.util.Random;
import java.util.Scanner;
public class User extends Person{
	Scanner a= new Scanner(System.in);
	public int age,r;
	public String name,DOB,Gender,Email,Country,State,address,name1,login1,pass1,Mobile1,acc;
	Random rand=new Random();
	public User(String name,String DOB,String Gender,int age,String Email,String Mobile1,String address,String Country,String State,String pass1) {
		this.name=name;
		this.DOB=DOB;
		this.Gender=Gender;
		this.age=age;
		this.Email=Email;
		this.Mobile1=Mobile1;
		this.address=address;
		this.Country=Country;
		this.State=State;
		this.pass1=pass1;
		this.acc="544332212";
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public void gt_details() {
		System.out.println("\t\t========================\t\t");
		System.out.println("Userame :"+name1);
		System.out.println("UserLoginID :"+login1);
		System.out.println("Password :"+pass1.substring(0,3)+"*********");
		
		
	};
    public void modify() {
    	System.out.println("1.Name\n2.DOB\n3.Password\n4.Gender\n5.Email\n6.Mobile number\n7.Address");
    	int ch = a.nextInt();
    	switch(ch) {
    	case 1:{
    		System.out.println("Enter the name : ");
    		name = a.next();
    		System.out.println("Enter the name again: ");
    		String name2 = a.next();
    		if(name.equals(name2)) {
    			System.out.println("Name changed Successfully");
    		}
    		break;
    	}
    	case 2:{
    		System.out.println("Enter the Date of Birth : ");
    		DOB = a.next();
    		System.out.println("Enter the Date of Birth again: ");
    		String DOB2 = a.next();
    		if(DOB.equals(DOB2)) {
    			System.out.println("Date of Birth changed Successfully");
    		}
    		break;
    	}
    	case 3:{
    		System.out.println("Enter the Password : ");
    		pass1 = a.next();
    		System.out.println("Enter the Password again: ");
    		String pass2 = a.next();
    		if(pass1.equals(pass2)) {
    			System.out.println("Password changed Successfully");
    		}
    		break;
    	}
    	case 4:{
    		System.out.println("Enter the Gender : ");
    		Gender = a.next();
    		System.out.println("Gender changed Successfully");
    		
    		break;
    	}
    	case 5:{
    		System.out.println("Enter the E-Mail : ");
    		Email = a.next();
    		System.out.println("Enter the E-Mail again: ");
    		String email2 = a.next();
    		if(Email.equals(email2)) {
    			System.out.println("E-mail address changed Successfully");
    		}
    		break;
    	}
    	case 6:{
    		System.out.println("Enter the Mobile number : ");
    		Mobile1 = a.next();
    		System.out.println("Enter the Mobile number again: ");
    		String mob2 = a.next();
    		if(Mobile1.equals(mob2)) {
    			System.out.println("Mobile number changed Successfully");
    		}
    		break;
    	}
    	case 7:{
    		System.out.println("Enter the  Address: ");
    		address = a.next();
    		System.out.println("Enter the State: ");
    		 State = a.next();
    		 System.out.println("Enter the Country: ");
     		 Country = a.next();
    		System.out.println("Address changed Successfully");
    		
    		break;
    	}
    	}
    }
    public void print() {
    	System.out.println("Name : "+name+"\nDate of Birth : "+DOB+"\nE-Mail : "+Email+"\nMobile number"+Mobile1.substring(0,3)+"*******");
    	System.out.println("Gender : "+Gender+"\nAddress : "+address+"\nState : "+State+"\nCountry : "+Country);
    	System.out.println("UserName : "+name1+"\nUser Login ID : "+login1.substring(0,4)+"*****"+"\nPassword : "+pass1.substring(0,3)+"*********");
    }
    public void set_details() {
    	r=rand.nextInt(1000);
    	//System.out.println(rand);
    	name1=name.substring(0,4)+r;
    	login1="9000"+DOB.substring(5,7)+r;
    	//System.out.println(Mobile1);
    }
    public int check(String uname,String pass,String login) {
    	int a=0;
       if(this.name1.equals(uname) && this.pass1.equals(pass) && this.login1.equals(login)) {
    	   System.out.println("Successfully Logged in");
    	   a=1;
    	   
       }
       else {
    	   System.out.println("Wrong credentials");
       }
       return a;
    }
    
    
}
