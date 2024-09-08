interface Con1{
   public static final int A=10;  //defaultly public static final
}
class Helo22 implements Con1{

    void disp(){
        System.out.println(A);
    }

}
public class InterfaceVaribale {
    public static void main(String[] args) {
       System.out.println(Helo22.A);

    }
}
