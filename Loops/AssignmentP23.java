/*

5
44
333
2222
11111

*/


public class AssignmentP23 {
    public static void main(String[] args) {
        

        int value=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(value);
            }
            value--;
            System.out.println();
        }
    }
}
