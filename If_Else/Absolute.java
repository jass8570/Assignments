public class Absolute {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        int num=new java.util.Scanner(System.in).nextInt();
        if(num>=0){
            System.out.println("The number is: "+ num);
        }
        else if(num<0){
            System.out.println("The num is: "+ num*(-1));
        }
    }
}
