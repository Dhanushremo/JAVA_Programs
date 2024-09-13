@FunctionalInterface
interface Display{
    void disp1();
    default void disp2(){

    }
    static void disp3(){

    }
    private void disp4(){

    }
    private  static void disp5(){

    }
}

class Demo77 implements Display{
    @Override
    public void disp1() {
        System.out.println("Helooo");
    }
}
public class InterfaceOuterClass {
    public static void main(String[] args) {
        Demo77 d=new Demo77();
        d.disp1();
    }
}
