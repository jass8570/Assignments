/*
ABCDE
BCDE
CDE
DE
E
*/
public class AssignmentP50 {
    public static void main(String[] args) {
        int x=0;
        for(int i=5;i>=1;i--){
            char ch=(char)('A'+x);
            x++;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
