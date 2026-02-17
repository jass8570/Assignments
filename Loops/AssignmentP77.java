/*

    *
   abc
  *****
 abcdefg
*********

*/
public class AssignmentP77 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch ='a';
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                if(i%2!=0)
                System.out.print("*");
                else
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }
    }
}
