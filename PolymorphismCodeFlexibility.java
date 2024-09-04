class Nurse{
    void care(){
        System.out.println("Nurse Will TakeCare of Patients!!");
    }
}

class Ramya extends Nurse{
    @Override
    void care(){
        System.out.println("Ramya Will TakeCare of Patients");
    }
}

class Divya extends Nurse{
    void care(){
        System.out.println("Divya Will TakeCare of Patients!!");
    }
}
class Monika extends Nurse{
    void care(){
        System.out.println("Monika Will TakeCare of Patients!!");
    }
}
class Hosipital{
    void hasA(Nurse ref){
        ref.care();
    }
}
public class PolymorphismCodeFlexibility {
    public static void main(String[] args) {
        Ramya r=new Ramya();
        Divya d=new Divya();
        Monika m=new Monika();
        Hosipital h=new Hosipital();
        h.hasA(r);
        h.hasA(d);
        h.hasA(m);
    }
}
