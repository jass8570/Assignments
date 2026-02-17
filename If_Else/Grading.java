public class Grading {
    public static void main(String[] args) {
        System.out.print("Enter the percentage:");
        int percentage= new java.util.Scanner(System.in).nextInt();
        if(percentage>80 && percentage<=100){
            System.out.println("The grade is: A");
        }else if(percentage>60 && percentage<=80){
            
            System.out.println("The grade is: B");

        }else if(percentage>50 && percentage<=60){
            
            System.out.println("The grade is: C");

        }else if(percentage>45 && percentage<=50){
            
            System.out.println("The grade is: D");
            
        }else if(percentage>25 && percentage<=45){
            
            System.out.println("The grade is: E");
        }
        else if(percentage<25 && percentage>=0){
            
            System.out.println("The grade is: F");
        }

    }
}
