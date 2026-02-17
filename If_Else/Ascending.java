public class Ascending {
    public static void main(String[] args) {
        System.out.print("Enter the value 1: ");
        int v1=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the value 2: ");
        int v2=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the value 3: ");
        int v3=new java.util.Scanner(System.in).nextInt();

        if(v1<v2 && v1<v3){
            System.out.print(v1 + "<");
            if(v2>v1 && v2<v3){
                System.out.print(v2 + "<");
                if(v3>v2 && v3>v1){
                    System.out.println(v3+" ");
                } 
            }
            else if(v3>v1 && v3<v2){
                    System.out.print(v3+"<");
                    if(v2>v1 && v2>v3){
                        System.out.println(v2);
                    }
                } 
                
            
        }



        if(v2<v1 && v2<v3){
            System.out.print(v2 + "<");
            if(v1>v2 && v1<v3){
                System.out.print(v1 + "<");
                if(v3>v2 && v3>v1){
                    System.out.println(v3);
                }
            }
            else if(v3>v2 && v3<v1){
                System.out.print(v3+"<");
                if(v1>v2 && v1>v3){
                    System.out.println(v1);
                }
            }
        }



        if(v3<v1 && v3<v2){
            System.out.print(v3+"<");
            if(v1>v3 && v1<v2){
                System.out.print(v1+"<");
                if(v2>v1 && v2>v3){
                    System.out.println(v2);
                }
            }
            else if(v2>v3 && v2<v1){
                System.out.print(v2+"<");
                if(v1>v2 && v1>v3){
                    System.out.println(v1);
                }
            }
        }



    }
}
