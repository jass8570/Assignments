/*
*
**
***
****
*****
*/


class AssignmentP10
{
	public static void main(String args[])
	{
		 int i,j,rows;
		 
		
		 
		 System.out.print("Enter the numbe rof rows: ");
		 rows=new java.util.Scanner(System.in).nextInt();
		 
		 for(i=1;i<=rows;i++)
		 {
			 for(j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
			 
		 }
	}
}