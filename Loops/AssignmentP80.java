/*

*********
 *******
  *****
   ***
    *



*/


public class AssignmentP80 {
    public static void main(String[] args) {
      
        for(int i=5;i>=1;i--){
            for(int space=i;space<5;space++){
                System.out.print(" ");
            }
            for(int j=1;j<(2*i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
