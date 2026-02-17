/*
    A
   AB
  ABC
 ABCD
ABCDE
*/


public class AssignmentP64 {
    public static void main(String[] args) {
          for(int i=1;i<=5;i++){
            char ch='A';
            for(int space=5-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
