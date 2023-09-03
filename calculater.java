import java.util.Scanner;
class Calculater
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{	
			System.out.println("Your choice are \n\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplacation\n\t4 For Division");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			System.out.println("Enter First num");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Second num");
			int num2 = sc.nextInt();
			int ans;
			switch(choice)
			{
				case 1:
					ans = num1+num2;
					System.out.println("Sum of Two numbers = "+ans);
					break;
				
				case 2:
					ans = num1-num2;
					System.out.println("Subtraction of Two numbers = "+ans);
					break;
				case 3:
					ans = num1*num2;
					System.out.println("Multiplacation of Two numbers = "+ans);
					break;
				case 4:
					ans = num1/num2;
					System.out.println("division of Two numbers = "+ans);
					break;
				default :
					System.out.println("INVALIDE CHOICE !");
			}
			System.out.println("\nDo you want to perform more operation : y/n");
			ch = sc.next().charAt(0);
		}while(ch == 'y'||ch == 'Y');
	}
}