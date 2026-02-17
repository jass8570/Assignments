/* 
11111
22222
33333
44444
55555
*/


class AssignmentP3
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
				System.out.print(i);
			}
			System.out.println();
		}
	}
}