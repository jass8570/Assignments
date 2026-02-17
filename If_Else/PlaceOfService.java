public class PlaceOfService {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.print("Enter your marital status (Y/N): ");
        char ch = new java.util.Scanner(System.in).next().charAt(0);

        System.out.print("Enter your Gender (M/F): ");
        char ch1 = new java.util.Scanner(System.in).next().charAt(0);

        if (ch1 == 'F' || ch1 == 'f') {
            System.out.println("She will work only in urban areas.");
        }
        else if (ch1 == 'M' || ch1 == 'm') {

            if (age >= 20 && age <= 40) {
                System.out.println("He may work anywhere.");
            }
            else if (age > 40 && age <= 60) {
                System.out.println("He will work in urban areas only.");
            }
            else {
                System.out.println("Error...");
            }
        }
        else {
            System.out.println("Enter the right gender.");
        }

        if (ch == 'Y' || ch == 'y') {
            System.out.println("You are married.");
        }
        else if (ch == 'N' || ch == 'n') {
            System.out.println("You are unmarried.");
        }
        else {
            System.out.println("Enter the right marital status.");
        }
    }
}
