package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firNum=0;
		int secNum=1;
		int sum=0;
		for (int i=1;i<=11;i++)

		{
			sum=firNum+secNum;
			firNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}
}
