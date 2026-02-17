
/*

1
22
333
4444
55555
666666

*/



public class AssignmentP22_2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows:");
        int n=new java.util.Scanner(System.in).nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
