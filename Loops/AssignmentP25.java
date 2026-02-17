/*
1
32
543
7654
98765
*/
public class AssignmentP25 {
    public static void main(String[] args) {
        
        for(int i=0;i<=5;i++){
            int X=1+(i*2);
            for(int j=1;j<=i;j++){
                IO.print(X-2);
                X--;
            }
            System.out.println();
        }
    }
}
