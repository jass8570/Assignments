/* 
54321
65432
76543
87654
98765
*/


class AssignmentP13
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		System.out.print("Enter the number of rows: ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		
		for(i=1;i<=rows;i++)
		{
			int start=i+(rows-1);  
			for(j=1;j<=rows;j++)
			{
				System.out.print(start);
				start--;
			}
			System.out.println();
		}
	}
}