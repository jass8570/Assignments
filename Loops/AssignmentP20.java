/*

*****
ABCDE
*****
ABCDE
*****

*/


public class AssignmentP20 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=1;j<=5;j++){
                if(i%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(ch);
                    ch++;
                }
            
            }
            System.out.println();
        }
    }
}
