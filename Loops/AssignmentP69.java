/*

    A
   BCD
  EFGHI
 JKLMNOP
QRSTUVWXYZ

*/

public class AssignmentP69 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print(ch);
                if(i==5 && k==9){
                    System.out.print("Z");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
