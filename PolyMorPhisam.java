import com.sun.jdi.PathSearchingVirtualMachine;

class Plan1{
    void fly(){
        System.out.println("I Will Fly At High Level!!");
    }

}
class CargoPlan1 extends Plan1{
    @Override
    void fly(){
        System.out.println("I Will Fly At Medium Level!!");
    }
}
class FighterPlan1 extends Plan1{
    @Override
    void fly(){
        System.out.println("I will Fly At low Level @FIGHTERPLAN");
    }
}

class Pasenger1 extends Plan1{
    void fly(){
        System.out.println("I will Fly at ROAD LEVEL");
    }
}

public class PolyMorPhisam {
    public static void main(String[] args) {
        Plan1 ref;
        CargoPlan1 c=new CargoPlan1();
        FighterPlan1 f=new FighterPlan1();
        Pasenger1 p=new Pasenger1();

        ref=c;
        ref.fly();

        ref=f;
        ref.fly();

        ref=p;
        ref.fly();

    }
}
