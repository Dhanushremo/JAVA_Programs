interface Method1{
    default void add(){
        System.out.println("ADDITION OK");
    }
}

interface Method2{
    default void add(){
        System.out.println("ADDTTION2 OK");
    }
}

class Method22 implements Method1,Method2 {
    @Override
    public void add() {   //only one method will implement at time not both!!
        System.out.println("Heloo");
        Method2.super.add();
    }
}

public class InterfaceMethod {
    public static void main(String[] args) {
        Method22 m=new Method22();
        m.add();
    }

}
