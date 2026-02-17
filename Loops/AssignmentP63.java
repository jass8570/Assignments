/*
     1
    32
   543
  7654
 98765
*/

public class AssignmentP63 {
    public static void main(String[] args) {
       
        for(int i=0;i<5;i++){
            int x=(1+i*2);
            for(int j=i+1;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}
