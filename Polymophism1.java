import com.sun.jdi.PathSearchingVirtualMachine;

class Plan{
void fly(){
    System.out.println("I Will Fly At High Level!!");
}

}
class CargoPlan extends Plan{
    @Override
    void fly(){
        System.out.println("I Will Fly At Medium Level!!");
    }
    void cargo(){
        System.out.println("CARGOPLAN");
    }
}
class FighterPlan extends Plan{
    @Override
    void fly(){
        System.out.println("I will Fly At low Level @FIGHTERPLAN");
    }
    void fighter(){
        System.out.println("FIGHTER!!");
    }
}

class Pasenger extends Plan{
    void fly(){
        System.out.println("I will Fly at ROAD LEVEL");
    }

    void passenger(){
        System.out.println("PASSENGER!!");
    }
}

public class Polymophism1 {
    public static void main(String[] args) {
        Plan ref;
        CargoPlan c=new CargoPlan();
        FighterPlan f=new FighterPlan();
        Pasenger p=new Pasenger();

        ref=c;
        ref.fly();
        ((CargoPlan)(ref)).cargo(); //DownCsting!!

        ref=f;
        ref.fly();
        ((FighterPlan)(ref)).fighter();

        ref=p;
        ref.fly();
        ((Pasenger)(ref)).passenger();
    }
}
