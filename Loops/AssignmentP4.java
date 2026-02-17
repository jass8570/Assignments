/* 
12345
678910
1112131415
1617181920
2122232425
*/


class AssignmentP4
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		
		System.out.print("Enter the number of rows: ");
		rows= new java.util.Scanner(System.in).nextInt();
		
		
		int num=1;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}

