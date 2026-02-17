/*
1
21
321
4321
54321
*/public class AssignmentP27 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int x=1+i;
            for(int j=1;j<=i+1;j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}
