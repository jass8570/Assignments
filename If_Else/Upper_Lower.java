public class Upper_Lower {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Enter the character: ");
        int x= System.in.read();
        char ch = (char)x;
        if(x>=65 && x<=90){
            System.out.println("The character is in Uppercase.");
            System.out.println("The character you entered is: " + ch);

        }
        else if(x>=97 && x<=122){
            System.out.println("The character is in lowercase.");
            System.out.println("The character you entered is: " + ch);
        }
        else
        {
            System.out.println("Invalid!......Entred the right character");
        }


    }
}
