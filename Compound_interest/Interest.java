
public class Interest {
	public void interest(double p, int y, double r)
	{
		
		double tempres=(1+(r/100));
		System.out.println("Principle "+p+" for "+y+" years with "+r+" interest rate" );
		for(int j=1;j<y;j++)
		{
			p=p*tempres;
		}
		
		double totalInterest=p*tempres;
		System.out.println("The total interest is"+totalInterest);
		
	}
}
