
import java.util.Random;
import java.util.Scanner;


public class Employee extends Person
{  
    Scanner a = new Scanner(System.in);
	public int r;
	public String name1,Mobile1,login1,password;
	Random rand=new Random();
	public Employee(String name1,String Mobile1,String login1,String password) {
		this.name1=name1;
		this.Mobile1=Mobile1;
		this.login1=login1;
		this.password=password;
	}
	public void gt_details() {
		System.out.println("\t\t========================\t\t");
		System.out.println("Employee Name :"+name1);
		System.out.println("Employee ID :"+login1);
		System.out.println("Mobile Number :"+Mobile1);
		
		
	};
    public void modify() {
    	System.out.println("1.Name\n2.Mobile number\n3.Password");
    	int ch = a.nextInt();
    	switch(ch) {
    	case 1:{
    		System.out.println("Enter the name : ");
    		name1 = a.next();
    		System.out.println("Enter the name again: ");
    		String name2 = a.next();
    		if(name1.equals(name2)) {
    			System.out.println("Name changed Successfully");
    		}
    		break;
    	}
    	case 2:{
    		System.out.println("Enter the Mobile number : ");
    		Mobile1 = a.next();
    		System.out.println("Enter the Mobile number again: ");
    		String mob2 = a.next();
    		if(Mobile1.equals(mob2)) {
    			System.out.println("Mobile number changed Successfully");
    		}
    		break;
    	}
    	case 3:{
    		System.out.println("Enter the Password : ");
    		Mobile1 = a.next();
    		System.out.println("Enter the new Password again: ");
    		String mob2 = a.next();
    		if(Mobile1.equals(mob2)) {
    			System.out.println("Password changed Successfully");
    		}
    		break;
    	}
    	}
    }
    public void print() {
    	
    }
    public void set_details() {
    	
    }
    
  
};