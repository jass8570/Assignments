/* 
55555
44444
33333
22222
11111
*/


class AssignmentP12
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		System.out.print("Enter the number of rows: ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}