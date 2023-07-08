import java.util.*;
public class Online_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int log,age;
	  // age[1]=11;
		String name ,DOB,Gender,Email,Country,State,address,pass,Mobile1,uname,login,acc;		
		Scanner a = new Scanner(System.in);
		
               System.out.println("Welcome to United Bank");
              
               System.out.println("Age(as of now)* :");
               age=a.nextInt();
               try
       	    {
       	    if(age<=17)
       	    {
       	    	throw new ArithmeticException("AGE LIMIT SHOULD BE ABOVE 18");
       	    }
       	    }
       	    
       	    catch(Exception e) {
       	    	 System.out.println("AGE LIMIT SHOULD BE ABOVE 18");
       	    }
               if( age>=18) {
            	   
            	   System.out.println("Name* :");
            	   name=a.next();
            	   int x=0;
            	   do
              	    {
            		   System.out.println("AccountID(16 digits)* :");
                	   acc=a.next();
                      x=acc.length();
                      try
              	    {
              	    if(x!= 16)
              	    {
              	    	throw new ArithmeticException("ENTER A VALID ACCOUNT NUMBER");
              	    }
              	    }
              	    
              	    catch(Exception e) {
              	    	 System.out.println("ENTER A VALID ACCOUNT NUMBER");
              	    }
                  }while(x!=16);
            	   
            	   System.out.println("Date of Birth(YYYY-MM-DD)* :");
            	   DOB=a.next();
            	   System.out.println("Gender : ");
            	   Gender=a.next();
            	   
                   do
                   {
                   System.out.println("Email : ");
                    Email = a.next();
                   try
           	    {
           	    if(!Email.contains("@gmail.com"))
           	    {
           	    	throw new ArithmeticException("ENTER A VALID EMAIL ID");
           	    }
           	    }
           	    
           	    catch(Exception e) {
           	    	 System.out.println("ENTER A VALID EMAIL ID");
           	    }
               }while(!Email.contains("@gmail.com"));
                int c=0;
            	   do
           	    {
                   System.out.println("Contact Number : ");
                   Mobile1 = a.next();
                   c=Mobile1.length();
                   try
           	    {
           	    if(c!= 10 && Mobile1.indexOf(0)!=0)
           	    {
           	    	throw new ArithmeticException("ENTER A VALID PHONE NUMBER");
           	    }
           	    }
           	    
           	    catch(Exception e) {
           	    	 System.out.println("ENTER A VALID PHONE NUMBER");
           	    }
               }while(c!=10);

            	   System.out.println("Address(Current)* : ");
            	   address=a.next();
            	   System.out.println("Country* : ");
            	   Country=a.next();
            	   System.out.println("State* :");
            	   State=a.next();
            	   int y=0;
            	   do
             	    {
            		   System.out.println("Password* :");
                	   pass=a.next();
                     y=pass.length();
                     try
             	    {
             	    if(y!= 12)
             	    {
             	    	throw new ArithmeticException("ENTER A VALID PASSWORD");
             	    }
             	    }
             	    
             	    catch(Exception e) {
             	    	 System.out.println("ENTER A VALID PASSWORD");
             	    }
                 }while(y!=12);
            	  
            	  User u = new User(name,DOB,Gender,age,Email,Mobile1,address,Country,State,pass);
            	   u.set_details();
            	   u.gt_details();
            	   System.out.println("Registration Successfully Completed.....Try login using the User Login ID received");
            	  int b;
            	   do {
            	   System.out.println("Login into your account");
               
              
            	   System.out.println("UserName* :");
            	   uname=a.next();
            	   System.out.println("Password* :");
            	   pass=a.next();
            	   System.out.println("UserLoginID* :");
            	   login=a.next();
            	//   Login l = new Login(name,DOB,Gender,age,Email,Mobile1,address,Country,State,pass,acc,uname,pass,login);
            	   b= u.check(uname,pass,login);
            	   }while(b==0);
            	   do {
                       System.out.println("\nModify any of your personal detail --> Press 1\nPrint Details --> Press 2\nTransactions --> Press 3");
                       log = a.nextInt();
                      switch(log) {
                      case 1:{
                    	  u.modify();
                    	  break;
                      }
                      case 2 :{
                    	  u.print();
                    	  break;
                      }
                      case 3:{
                    	//  transaction t = new transaction();
                    	  break;
                      }
                      }
                   }while(log!=0);
            	   
               }
               
               
	}
}


