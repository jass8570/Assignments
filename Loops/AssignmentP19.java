/*

ABCDE
FGHIJ
KLMNO
PQRST
UVWXYZ

*/




public class AssignmentP19 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(ch);
                ch++;
                if(i==5 && j==5){
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
    }
}
