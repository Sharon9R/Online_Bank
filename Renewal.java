import java.util.Scanner;

public class Renewal {

    Scanner sc=new Scanner(System.in);

    public Renewal() {
    }

    public int number;
    public int j=1;
    public int i;
   public  void request(){
   while(j==1){
        System.out.println("What do you want to renew /n1.Renew credit card/n2.Renew debit card /n3.Issue cheque");
        i= sc.nextInt();
        if(i==1){
            System.out.println("Credit card number : ");
            number= sc.nextInt();
            System.out.println("--------Your request is submitted------------");
            System.out.println(" Your credit card "+number+" will be renewed and issued within two weeks");

        }
        if(i==2){
            System.out.println("Debit card number : ");
            number= sc.nextInt();
            System.out.println("----------Your request is submitted------------");
            System.out.println(" Your debit card "+number+" will be renewed and issued within two weeks");

        }
        if(i==3){
            System.out.println("Cheque book number : ");
            number= sc.nextInt();
            System.out.println("Your request is submitted");
            System.out.println("Your cheque book "+number+" will be issued within two weeks");
        }
        System.out.println("Do you want to continue?/n press 1 to continue /n press 0 to exit");
        j=sc.nextInt();

    }
}}