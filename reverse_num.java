import java.util.Scanner;
class ReverseNum
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num ");
		int num = sc.nextInt();
		int reverse = 0;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			reverse=reverse*10+rem;
		}
		System.out.println("Reverse num = "+reverse);
		
	}
}
			