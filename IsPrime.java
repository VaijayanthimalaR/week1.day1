package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=4;
		boolean prime=false;
		for (int i=1;i<=n-1;i++)
		{
			if (n%i==0) {
				prime=false;
				break;
			}
			else {prime=true;}
		}
		if (prime){
			System.out.println("prime");
		}
		else
		{	System.out.println("not prime");}
	}

}
