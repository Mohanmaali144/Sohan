
// Second Way For check Num is prime or not
import java.util.Scanner;
class CheckPrimeNum
{
	public static void main(String[]args)
	{
		
			Scanner sc = new Scanner(System.in);
			
			int flage = 0;
			
			System.out.println("Enter any num ");
			int num = sc.nextInt();
			
			for(int i = 2; i<num; i++)
			{
				if(num%i==0)
				{
					flage = 1;
					break;
				}
			}
			if(flage==0)
			{
				System.out.println("Enter num is prime");
			}
			else
			{
				System.out.println("Enter num is not prime");
			}
	}
}