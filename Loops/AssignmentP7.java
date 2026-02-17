/* 
12345
23456
34567
45678
56789
*/


class AssignmentP7
{
	public static void main(String args[])
	{
		int i,j,rows;
	
		
		System.out.print("Enter the number of rows: ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		
		for(i=0;i<rows;i++)
		{
			int value=1+i;
			for(j=1;j<=rows;j++)
			{
				System.out.print(value);
				value++;
			}
			System.out.println();
		}
			
		
	}
}