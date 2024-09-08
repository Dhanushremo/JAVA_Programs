interface Cal2{
    void add();
    void sub();
}
 abstract class Mycal implements Cal2{ //if a class partially implemented, it must declare itself as abstract
    @Override
    public void add() {
        System.out.println("addition "+(10+20));
    }
}
class Hai22 extends Mycal{
    @Override
    public void sub() {
        System.out.println("subtractiion "+(20-10));
    }
}
public class PartialInterface {
    public static void main(String[] args) {
        Hai22 c1=new Hai22();
        c1.add();
        c1.sub();
    }
}
