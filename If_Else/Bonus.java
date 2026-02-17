public class Bonus {
    public static void main(String[] args) {
        System.out.print("Enter the service years:");
        int year= new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter your salary:");
        int salary= new java.util.Scanner(System.in).nextInt();
        if(year>5){
            int x=((salary*5)/100);
            System.out.println("Your bonus is:" + x);
            System.out.println("Your final salary is: " + (salary+x));
        }
        else
        {
            System.out.println("You are not eligible for bonus.");
            System.out.println("Your salary remains same and that is: "+salary);
        }
    }
}
