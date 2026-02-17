
/*

11111
 2222
  333
   44
    5

*/


public class AssignmentP45 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<6-i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
