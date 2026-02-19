/*
1 2 3 4 5 
2       4
3       3
4       2
5 4 3 2 1 

*/

public class AssignmentP40 {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1){
                    System.out.print(j+" ");
                }else if(i==5){
                    System.out.print(5-j+1 +" ");
                }else if(j==1){
                    System.out.print(i+" ");
                }else if(j==5){
                    System.out.print(5-i+1);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
