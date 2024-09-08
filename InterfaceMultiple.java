import com.sun.jdi.PathSearchingVirtualMachine;

abstract interface Mul{
    public abstract void add();
    abstract void sub();
}

abstract interface Mul1{
    void mul();
    void div();
}

class Heloo implements Mul,Mul1 {
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
        System.out.println("MULTIPLICATION");
    }

    @Override
    public void div() {
        System.out.println("DIVISION");
    }
}
public class InterfaceMultiple {
    public static void main(String[] args) {
        Heloo h=new Heloo();
        h.add();
        h.sub();
        h.div();
        h.mul();
    }
}
