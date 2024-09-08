interface Cal99{
    abstract void add();

}

interface Cal999{
    abstract void sub();
}

interface Cal9999 extends Cal99,Cal999 {
    abstract void mul();
}
class Dhanush implements Cal9999{
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
        System.out.println("MULTIPLILCATION");


    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Dhanush d=new Dhanush();
        d.add();
        d.sub();
        d.mul();

    }
}
