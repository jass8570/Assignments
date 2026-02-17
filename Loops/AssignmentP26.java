/*

1
12
123
1234
12345

*/



public class AssignmentP26 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int value=1;
            for(int j=1;j<=i;j++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
