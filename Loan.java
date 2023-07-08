import java.util.Scanner;
public class Loan{
  public String LoanType;
  public float Interest,Amount;
  int years;
  Scanner scan = new Scanner (System.in);
	        public void calc() {
	      	System.out.println("Enter Principal Amount : ");
	      	double a = scan.nextDouble(); 
	      	System.out.print("Enter Rate of Interest : ");
	      	double b = scan.nextDouble(); 
	      	b =( b/100); 
	      	System.out.print("Enter the number of times the interest is compounded per unit : ");
	      	double c = scan.nextInt();
	      	System.out.print("Enter Time period in years :");
	      	double d = scan.nextInt();
		Amount pay=new Amount(a,b,c,d);
		System.out.println("Amount to be paid including the interest : " + pay.A);
	        }
		public void gt_loan_details(String LoanType,float Interest,float Amount,int years) {
			System.out.println("Loan Type : "+LoanType);
			System.out.println("Total Principle : "+Amount);
			System.out.println("Interest Rate : "+Interest);
			System.out.println("Due time : "+years);
		}
		public void apply() {
			System.out.println("Loan Type : \nGold Loan\nPersonal Loan\nEducational Loan");
			LoanType = scan.next();
			if(LoanType.equals("Gold Loan")) {
				Interest = (float)4.899;
			}
			else if(LoanType.equals("Personal Loan")) {
				Interest = (float)6.7;
			}
			else {
				Interest = (float)3.2;
			}
			System.out.println("Amount Needed : ");
			Amount = scan.nextFloat();
			int ab=0;
			do {
			System.out.println("Submit necessary documents given below........After Upload, Press 1 for Submission");
            ab = scan.nextInt();
            if(ab==0) {
            	System.out.println("Kindly check your submission once again");
            }
            }while(ab==0);
			
            System.out.println("Your Request for Loan is Successfully submitted. We will reach you within"
            		+ "3 working days");
            System.out.println("-----------Thank you-------------");
		}
	}


