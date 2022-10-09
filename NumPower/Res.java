
public class Res {
public void ans(int base, int power)
{
	int answer=1;
	for(int i=1;i<=power;i++)
	{
		answer=answer*base;
	}
	System.out.println("answer= "+answer);
}
}
