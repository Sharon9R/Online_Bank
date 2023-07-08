class Amount
{
	double A;
	Amount(double p,double r,double n,double t)
	{  
      	A= p* (Math.pow((1+(r/n)),(n*t)));
      	A= Math.round(A* 100) / 100;
	}
}
