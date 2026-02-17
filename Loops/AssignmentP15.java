/*
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI
FGHIJ
*/



class AssignmentP15
{
	public static void main(String args[])
	{
		int i,j,rows;
		
		
		System.out.print("Enter the number of rows: ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		
		for(i=0;i<rows;i++)
		{
			char ch=(char)('A'+i);
			for(j=1;j<=rows;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}