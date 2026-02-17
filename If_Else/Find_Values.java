public class Find_Values {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=0;
        
        boolean a= (x==2);
        boolean b= (x!=5);
        boolean c= (x !=5 && y>=5);
        boolean d= (z!=0  || x==2);
        boolean e= !(y<10);

        if(a){
            System.out.println(a);
        } 
        if(b){
            System.out.println(b);
        }
        if(c){
            System.out.println(c);
        }
        if(d){
            System.out.println(d);
        }
        if(!(e)){
            System.out.println(e);
        }
    }
}
