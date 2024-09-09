interface Demo11 {
    default void studentPersonalLife() {

//        System.out.println("day started with mobile");
//        System.out.println("day endup with mobile");
//        System.out.println("Again day started with mobile");
//        System.out.println("Again day end up with mobile");
        reduntatndCode();
    }

    default void studentProffesionalLife() {
        reduntatndCode();

    }

  private static void reduntatndCode() {           // if you give private we canot call the method
        System.out.println("day started with mobile");
        System.out.println("day endup with mobile");
        System.out.println("Again day started with mobile");
        System.out.println("Again day end up with mobile");
    }

}
class Hello implements Demo11{

}
public class Jdk8_Jdk9 {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.studentPersonalLife();
        System.out.println("--------------------------");
        h.studentProffesionalLife();
        System.out.println("--------------------------");
//        Demo11.reduntatndCode(); //if you declare a as static in interface we cannot inheritate,but by using interface reference we can access

    }
}
