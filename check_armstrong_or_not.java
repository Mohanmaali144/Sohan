
import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num ");
		int num = sc.nextInt();
		int count = 0,sum = 0;
		int temp = num;
		for(;num>0;num/=10)
		{
			count++;
		}
		//	System.out.println(count);
		num = temp;
		for(; num>0;num/=10)
		{
			int rem = num%10;
			int i, power;
			for(i = 1, power = 1; i<=count;)
			{
				power*=rem;
				i++;
			}
			sum+=power;
		}
		if(temp == sum)
		{
			System.out.println("Enter num is Armstrong");
		}
		else
		{
			System.out.println("Enter num is Not Armstrong");
		}
	}
}