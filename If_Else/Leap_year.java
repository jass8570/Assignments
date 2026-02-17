public class Leap_year {
    public static void main(String[] args) {
        System.out.print("Enter the year:");
        int year=new java.util.Scanner(System.in).nextInt();
        if(year%400==0){
            System.out.println("The year is leap year.");
        }
        else if(year%4==0){
            
            System.out.println("The year is leap year.");
        }
        else
        {
            
            System.out.println("The year is not a leap year.");
        }
    }
}
