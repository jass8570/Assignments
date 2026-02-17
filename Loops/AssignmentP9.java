/* 
*****
22222
*****
44444
*****
*/


class AssignmentP9
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		
		System.out.print("Enter the number of rows: ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				if(i%2==1)
					System.out.print("*");
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
