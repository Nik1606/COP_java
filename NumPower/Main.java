import java.util.Scanner;
public class Main {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Base and power repectively: ");
	int base = sc.nextInt();
	int power=sc.nextInt();
	
	Res r= new Res();
	r.ans(base,power);
	
}
}
