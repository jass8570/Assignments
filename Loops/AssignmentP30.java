/*

A
CB
EDC
GFED
IHGFE

*/
public class AssignmentP30 {
    
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            char ch=(char) ('A'+(i*2));
            for(int j=1;j<=i+1;j++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}


