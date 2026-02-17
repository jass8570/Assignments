/*
    E
   DDD
  CCCCC
 BBBBBBB
AAAAAAAAA

*/
public class AssignmentP68 {
    public static void main(String[] args) {
        char ch='E';
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }
    }
}
