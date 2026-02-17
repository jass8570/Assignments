
/*
    1
   232
  34543
 4567654
567898765

*/
public class AssignmentP73 {
    public static void main(String[] args) {
        int i,space,k=0,count=0,count1=0;
        
        for(i=1;i<=5;i++){
            for(space=1;space<=5-i;space++){
                System.out.print(" ");
                count++;
            }
            while (k!=2*i-1) {
                if(count<=5-1){
                    System.out.print(i+k);
                    count++;
                }
                else{
                    ++count1;
                    System.out.print((i+k-2*count1));
                }
                k++;
                
            }
            count1=count=k=0;
            System.out.println();
        }
    }
    
}
