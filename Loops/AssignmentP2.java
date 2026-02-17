/* 
12345
12345
12345
12345
12345
*/


class AssignmentP2
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		
		System.out.print("Enter the number of rows: ");
		rows= new java.util.Scanner(System.in).nextInt();
		
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}