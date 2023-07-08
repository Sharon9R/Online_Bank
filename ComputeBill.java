import java.util.Scanner;

public class ComputeBill
{
    public void pay(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Electricity bill");
        System.out.println("Enter 2 for Gas bill");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
       
        switch (choice) {
            case 1:
            	long units;
            	 
        	    Scanner sc=new Scanner(System.in);
         
        	    System.out.println("Enter number of units : ");
        	   
                    units=sc.nextLong();
         
                    CalculateElectricityBill b=new CalculateElectricityBill(units);
                	
              	    System.out.println("Bill to be paid : " + b.billpay); 
            break;
            
            case 2:
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of cylinders purchased : ");
            int a = scan.nextInt();
            int c = 750 * a;
            System.out.print("Number of Cylinders purchased : " + a);
            System.out.print("\nCost per Cylinder : 750 rupees");
            System.out.print("\nGas bill to be paid : " + c);
            break;
            
            
            default:
            System.out.println("Incorrect Choice!!!");
        }
    }
}

