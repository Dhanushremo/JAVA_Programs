class Animal {


}
class Tiger extends Animal{

}
class Parent1{
       Animal disp(){
            System.out.println("HAI");
            Animal a=new Animal();
            return a;
        }
}
class Lion extends Tiger {

}
class Child1 extends Parent1{
    Lion disp(){
        System.out.println("Heloo");
        Lion a=new Lion();
        return a;
    }
}

    public class MethoOverriding1 {
        public static void main(String[] args) {
            Child1 c = new Child1();
            c.disp();
        }
    }

