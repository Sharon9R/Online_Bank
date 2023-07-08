import java.util.Random;
import java.util.Scanner;


public class Support 
{

    Scanner a = new Scanner(System.in);
    public int i;
    public int r;
    public String name,Mobile1,email,acc,tran,post;
    public float amount;
    Random rand=new Random();
   

    public Support(String name, String mobile1,String email,String acc,String tran,float amount) {
        this.name = name;
        this.Mobile1 = mobile1;
        this.email = email;
        this.acc = acc;
        this.tran = tran;
        this.amount=amount;
        
    }
    public Support(String name, String mobile1,String email,String acc) {
        this.name = name;
        this.Mobile1 = mobile1;
        this.email = email;
        this.acc = acc;

        
    }
    public void Ticket() {
    	r = rand.nextInt(10000);
    	System.out.println("Raised Ticket Number : "+r);
    	System.out.println("Name : "+name);
    	System.out.println("Account Number : "+acc);
    	System.out.println("Transaction ID : "+tran);
    	System.out.println("Amount : "+amount);
    	
    }

    public void suporthelp(){
        do{
          System.out.print("1.How can I change my password?\n2.When will I receive my changed ATM pin?  "
          		+ "\n3.Can I get my newly generated pin through online? /n"
          		+ "4.Is there any charge for the billpay service? /n"
          		+ "5.Will I have a confirmation of my payment using PayBill service?");
            int j = a.nextInt();
            switch(j){
            case 1:System.out.println("Go to Personal Details, enter into Modify details and there you can change your password "
            		+ "after a verification process, this will intimated to your Mobile number and E-mail");break;
            case 2:System.out.println("You will receive your new ATM pin by post within 10days of request submission");break;
            case 3:System.out.println("no ,for security purpose we send your ATM pin by post");break;
            case 5:System.out.println("you will be give an refernece number for successful transaction . your account statement will also include  the details of transaction.");break;
            case 4:System.out.println("no ,there is no charge for billpay");break;
            case 0 :{
            	System.out.println("If any other, Post your queries here");
            	do {
            		System.out.println("!!!!Atleast 30 characters!!!!");
            	post = a.next();
            	}while(post.length()<20);
            	System.out.println("Your Response is Successfully Submitted....We will reach you soon\n"
            			+ "In case any Emergency, Dial toll-free number 04554-253999");
            	System.out.println("----------------------------------------------------------------------");
            	
            }


            }
             System.out.println("press 1 to continue /n press 0 to exit");
            i=a.nextInt();
        }while(i==1);
    }}