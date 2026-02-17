public class L_B {
    public static void main(String[] args) {
        System.out.print("Enter the length:");
        int x= new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the breadth:");
        int y= new java.util.Scanner(System.in).nextInt();
        if(x!=y)
        System.out.println("It is a rectangle.");
        else
        System.out.println("It is a square.");
    }
}
