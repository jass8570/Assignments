/*

1
23
345
4567
56789

*/


public class AssignmentP24 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int value=(1+i);
            for(int j=1;j<=(i+1);j++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
