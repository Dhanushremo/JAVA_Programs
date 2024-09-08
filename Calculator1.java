abstract interface Cal1{
    void add();
    void sub();

}

class MyCal22 implements Cal1{

    @Override
    public void add() {
        System.out.println("ADDITION");
    }

    @Override
    public void sub() {
        System.out.println("SUBTRACTION");
    }

    public void mul(){
        System.out.println("MULTIPLICATION");
    }
}
//class Casio1{
//    void maths1(Cal1 c){
//        c.add();
//        c.sub();
//        c.mul();
//    }
//}
public class Calculator1 {
    public static void main(String[] args) {
        MyCal22 m=new MyCal22();
//        Casio1 c1=new Casio1();
        Cal1 ref;
        ref=m;
        ref.sub();
        ref.add();
        ((MyCal22)(ref)).mul(); //DowCating because we cant accese the specialized methods usinf child object and chile refernce

    }
}
