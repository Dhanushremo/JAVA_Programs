@FunctionalInterface
interface Display1{
    void disp12();
}

public class InterfaceInnerClass {
    public static void main(String[] args) {
        class Demo771 implements Display1{
            @Override
            public void disp12() {
                System.out.println("Helooo");
            }
        }
        Demo771 d=new Demo771();
        d.disp12();

    }
}
