/*

    1
   123
  12345
 1234567
123456789

*/
public class AssignmentP71 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print(k);
                
            }
            System.out.println();
        }
    }
}
