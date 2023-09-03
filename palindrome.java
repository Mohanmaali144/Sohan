import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int reverse = 0,temp = num;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			reverse = reverse*10+rem;
		}
		
		if(reverse==temp)
		{
			System.out.println("Enter num is palindrome");
		}
		else
		{
			System.out.println("Enter num is Not palindrome");
		}
	}
}