import java.io.IOException;
import java.util.*;
public class Online_bank1 {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
		int log=0,age,log1=0,log2;
//	   age[1]=11;
		String name ,DOB,Gender,Email,Country,State,address,pass,Mobile1,uname,login,acc,eid;		
		Scanner a = new Scanner(System.in);
		
               System.out.println("Welcome to United Bank");
               System.out.println("Admin(11) or User(12)");
               log2 = a.nextInt();
              if(log2==12) {
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
            	/*   int x=0;
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
                  }while(x!=16);*/
            	   
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
            	   Login l = new Login(name,DOB,Gender,age,Email,Mobile1,address,Country,State,pass,uname,pass,login);
            	   b= u.check(uname,pass,login);
        	   }while(b==0);
            	   do {
                       System.out.println("\nPersonal Details --> Press 1\nAccount Details --> Press 2\nTransactions --> Press 3\nRenewal of Cards --> Press 4"
                    		   +"\nSupport system ---> Press 5\nRaise Ticket ---> Press 6\nLoan Details ---> Press 7"
                    		   + "\nPay Bills ---> Press 8\nLog out ---> Press 9");
                       log = a.nextInt();
                      switch(log) {
                      case 1:{
                    	  System.out.println("1.Modify Personal Details\n2.Print Details");
        					log1 = a.nextInt();
        		
        					switch(log1) {
        					case 1:{
        						  u.modify();
        						break;
        					}
        					case 2:{
        						  u.print();
        						break;
        					}
                    	  
                      }
        					break;
                      }
                      case 2 :{
                    	accounts a1 = new accounts("ABCD123","Savings account","544332212",(float)46000.20); //benifi
      					accounts base = new accounts("EFGH567","Savings account","632451157",(float)200000.30); //sender
      					System.out.println("1.Check for Minimal Balance\n2.Check Balance\n3.Print Account Details");
      					log1 = a.nextInt();
      		
      					switch(log1) {
      					case 1:{
      						System.out.println("Enter your Current Balance : ");
      						float bal = a.nextFloat();
      						a1.checkBalanceForMinBal(bal);
      						break;
      					}
      					case 2:{
      						float a11=a1.getBalance();
      						System.out.println("Current Balance : "+a11);
      						break;
      					}
      					case 3:{
      					    System.out.println("Account Number : "+a1.getAccNum());
      					    System.out.println("Account Type : "+a1.getAccDetails());
      					    System.out.println("Bank IFSC code : "+a1.getIFSC());
      					    System.out.println("Current Balance : "+a1.getBalance());
      					    System.out.println("Account Status : "+a1.getAccStatus());
      						break;
      					}
      					}
      					
      					
                    	  break;
                      }
                      case 3:{
                    	 accounts a1 = new accounts("ABCD123","Savings account","544332212",(float)46000.20); //benifi
        				accounts base = new accounts("EFGH567","Savings account","632451157",(float)200000.30); //sender
                    	 // transaction t = new transaction();
                   	    end_banking_system sy = new end_banking_system();
                    	System.out.print("----------------Balances----------------\nSender Account: "
                   	    +Float.toString(base.getBalance())+"\nBenificiary Account: "+Float.toString(a1.getBalance())+"\n\n");
                        sy.bankTransfer(a1, base);
                   		System.out.print("\n\n----------------Balances updated----------------"+"\nSender Account: "
                        +Float.toString(base.getBalance())+"\nBenificiary Account: "+Float.toString(a1.getBalance())+"\n");                     	 
                    	  
                    	  break;
                      }
                      case 4:{
                    	Renewal rw = new Renewal();
                    	rw.request();
                  		break;
                  		
                      }
                      case 6:{
                    	  float amount=0;
                    	  String fail = a.next();
                    	  System.out.println("Failed Transaction ID : "+fail);
                    	  System.out.println("Amount : "+amount);
                    	  Support sp = new Support(name,Mobile1,Email,"544332212",fail,amount);
                    	  break;
                      }
                      case 5:{
                    	  Support sp = new Support(name,Mobile1,Email,"544332212");
                    	  sp.suporthelp();
                    	  
                    	  break;
                      }
                      case 7:{
                    	  Loan ln = new Loan();
                    	  System.out.println("1.Get Loan Details\n2.Calculate Amount to pay\n3.Apply for Loan");
                    	  log1 = a.nextInt();
                    	  switch(log1) {
                    	  case 1:{
                    		  ln.gt_loan_details("Gold Loan", (float) 4.89, 300000, 2);
                    		  break;
                    	  }
                    	  case 2:{
                    		  ln.calc();
                    		  break;
                    	  }
                    	  case 3:{
                    		  ln.apply();
                    		  break;
                    	  }
                    	  }
                    	  break;
                      }
                      case 8:{
                    	 ComputeBill cb = new ComputeBill();
                    	 cb.pay();
                    	  break;
                      }
                      case 9:{
                    	  System.out.println("Logged out Successfully");
                    	  break;
                      }
                      }
                   }while(log!=0);
            	   
               }
              }
              else {  //admin;
            	  uname =null;
            	  System.out.println("UserName : ");
            	  uname = a.next();
            	  pass = null;
            	  System.out.println("Password : ");
            	  pass = a.next();
            	  eid = null;
            	  System.out.println("Employee ID : ");
            	  eid = a.next();
            	  Employee e = new Employee(uname,"9988776655",eid,pass);
            	  System.out.println("Logged In Successfully");
            	  do {
            	  System.out.println("1.Get Details\n2.Modify Details\n3.Log out");
            	  log2 = a.nextInt();
            	  switch(log2) {
            	  case 1:{
            		  e.gt_details();
            		  break;
            	  }
            	  case 2:{
            		  e.modify();
            		  break;
            	  }
            	  }
              }while(log2!=3);
            	  System.out.println("Successfully Logged out");
	}
}
}
               
	


