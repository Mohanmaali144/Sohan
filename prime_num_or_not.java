
//First Way For check number is prime or not

import java.util.Scanner;
class CheckPrime
{
	public static void main(String[]args)
	{
		
			Scanner sc = new Scanner(System.in);
			
			int count = 0;
			
			System.out.println("Enter any num ");
			int num = sc.nextInt();
			
			for(int i = 1; i<=num; i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Enter num is prime");
			}
			else
			{
				System.out.println("Enter num is not prime");
			}
	}
}