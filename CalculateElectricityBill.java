public class CalculateElectricityBill {
	double billpay;
	 
	CalculateElectricityBill (long units)
	{
  	  if(units<100)
		billpay=units*3.5;
	  else if(units<=300)
		billpay=100*3.5+(units-100)*2;
	  else if(units>300)
		billpay=100*3.5+200 *2+(units-300)*3;
	     
         }	 
}
