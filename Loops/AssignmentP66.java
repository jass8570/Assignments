/*
   1
   321
  54321
 7654321
987654321

*/

public class AssignmentP66 {
    public static void main(String[] args) {
      for(int i=0;i<5;i++){
      int x=1+(i*2);
      for(int space=(i+1);space<5;space++){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i+1);j++){
        System.out.print(x);
        x--;
      }
      System.out.println();
      }
     
    }
}
