public class Medical {
    public static void main(String[] args)throws java.io.IOException {
        System.out.print("Total number of classes held: ");
        int t_classes = new java.util.Scanner(System.in).nextInt();
        System.out.print("Total number of classes attended: ");
        int Attended = new java.util.Scanner(System.in).nextInt();
        int percentage = (Attended*100)/t_classes;
        if(percentage<75){
            System.out.print("Do you have medical cause?");
            int x=System.in.read();
            char ch=(char)x;
            if(ch=='Y' || ch=='y'){
                System.out.println("Allowed to sit in exam after submitting the medical record.");
            }else if(ch=='N' || ch=='n'){

                System.out.println("Not allowed to sit in exam.");
            }else{
                System.out.println("Enter the right character.");
            }

            System.out.println("Your percentage is: " + percentage + "%");
        }
        else{
            System.out.println("Allowed to sit in exam");
            System.out.println("Your percentage is: " + percentage + "%");
        }

    }
}
