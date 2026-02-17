/*

EEEEE
DDDDD
CCCCC
BBBBB
AAAAA

*/

public class AssignmentP17 {
    public static void main(String... s) {
        for(int i=0;i<5;i++){
            char ch=(char)('E'-i);
            for(int j=1;j<=5;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
