/*
     1
    23
   345
  4567
 56789

*/

public class AssignmentP62 {
    public static void main(String[] args) {
       
        for(int i=0;i<5;i++){
            int x=1+i;
            for(int j=i+1;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
