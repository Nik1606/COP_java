import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principle in rupees: ");
	double p=sc.nextDouble();

	System.out.println("Enter number of years: ");
	int y = sc.nextInt();
	
	System.out.println("Enter rate of interest: ");
	double r = sc.nextDouble();
	
	Interest i = new Interest();
	i.interest(p,y,r);
}
}
