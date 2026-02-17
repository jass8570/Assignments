public class Oldest_Youngest {
    public static void main(String[] args) {

        System.out.print("Enter the age 1st:");
        int age1=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the age 2nd:");
        int age2=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the age 3rd:");
        int age3=new java.util.Scanner(System.in).nextInt();


        if(age1>age2 && age1>age3){
            System.out.println("The age first is oldest.");
        }else if(age2>age1 && age2>age3){
            
            System.out.println("The age second is oldest.");
        }else if(age3>age1 && age3>age2){
            
            System.out.println("The age third is oldest.");
        }else{
            
            System.out.println("All are eual.");
        }


        if(age1<age2 && age1<age3){
            System.out.println("The age first is youngest.");
        }else if(age2<age1 && age2<age3){
            
            System.out.println("The age second is youngest.");
        }else if(age3<age1 && age3<age2){
            
            System.out.println("The age third is youngest.");
        }else{
            
            System.out.println("All are eual.");
        }





    }
}
