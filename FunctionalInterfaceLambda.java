@FunctionalInterface
interface Display88{
    abstract public void disp(char a);
//    default void helo(){   //functional interface should have only one abstract method and any default,static,private, static and private it may contain!!
//
//    }
}
public class FunctionalInterfaceLambda {
    public static void main(String[] args) {
         Display88 d=a->{System.out.println("Hey Iam Modifeid "+a );}; //LAMBDA EXPRESSION WILL WORK ONLY FOR FUNCTIONAL INTERFACE
         d.disp('D');
    }
}
