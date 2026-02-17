/*

    1
   234
  56789
 10111213141516
171819202122232425

*/
public class AssignmentP70 {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<(2*i);k++){
                System.out.print(count );
                count++;
            }
            System.out.println();
        }
    }
}
