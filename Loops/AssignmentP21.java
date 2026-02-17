/*

ABCDE
abcde
ABCDE
abcde
ABCDE

*/



public class AssignmentP21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char CH='A';
            char ch='a';
            for(int j=1;j<=5;j++){
                if(i%2!=0){
                    System.out.print(CH);
                    CH++;
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
