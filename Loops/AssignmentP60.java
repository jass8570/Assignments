/*
    1
   12
  123
 1234
12345
*/

public class AssignmentP60 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int space=5-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
