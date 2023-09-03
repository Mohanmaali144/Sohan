import java.util.Scanner;
class Pattern_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int i=1 ,j,k;
	/*	for (i=1;i<=row;i++)
		{
			for(j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		do
		{
			j=row;
			do
			{
				System.out.print(" ");
				j--;
			}while(j>=i);
			
			k=1;
			do
			{
				System.out.print("*");
				k++;
			}while(k<=i);
			
			i++;
			System.out.print("\n");
		}while(i<=row);
	}
}