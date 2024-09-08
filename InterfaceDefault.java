interface Demo1{
    void add();
    void sub();
    default void mul(){
        System.out.println("Backward compatability Multiplication!!");

    }
    default void helo(){

    }
}
class Demo2 implements Demo1{
    @Override
    public void add() {
        System.out.println("ADDITION");
    }

    @Override
    public void sub() {
        System.out.println("SUBTRACTION");
    }

    @Override
    public void mul() {
       // Demo1.super.mul();
        System.out.println("hey iam modified");
    }
}




public class InterfaceDefault {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        d.add();
        d.sub();
        d.mul();
    }
}
