class Dhanush11{
    static int count=0;
    public Dhanush11(){
           count++;
    }
}
public class NoOfObjects {
    public static void main(String[] args) {
        Dhanush11 d1=new Dhanush11();
        Dhanush11 d2=new Dhanush11();
        Dhanush11 d3=new Dhanush11();
        Dhanush11 d4=new Dhanush11();
        Dhanush11 d5=new Dhanush11();
        Dhanush11 d6=new Dhanush11();
        System.out.println(Dhanush11.count);


    }
}
