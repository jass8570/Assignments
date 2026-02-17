public class Discount {
    public static void main(String[] args) {
        int price=100;
        int qty;
        System.out.print("Enter the quantity:");
        qty=new java.util.Scanner(System.in).nextInt();
        int total_price=qty*price;
        if(total_price>1000){
            System.out.println("You are eligible to discount...");
            int x=((total_price*10)/100);
            int s = total_price-x;
            System.out.println("Price after discount is: "+ s);
        }
        else{
            System.out.println("The final price is: " + total_price);
        }
        

    }
}
