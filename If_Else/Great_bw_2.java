public interface Great_bw_2 {
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        int x= new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the second number:");
        int y= new java.util.Scanner(System.in).nextInt();
        if(x>y)
        System.out.println("1st number is greater.");
        else if(x<y)
        System.out.println("2nd number is greater.");
        else
        System.out.println("Both are equal.");
    }
}
