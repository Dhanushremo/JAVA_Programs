class Hai{
    static int a=10;
    static int b=20;
    static {
        System.out.println("Hey Iam a static block!!");
    }
    static void fun(){
        System.out.println("Hey Iam a static method!!");
    }
    int i=10;
    int j=20;
    {
        System.out.println("Hey Bro Ypu Cant Fine Meh!1");
    }
    void fun1(){
        System.out.println("Hey iam Method 2");
    }
}
public class Static {
    public static void main(String[] args) {
        Hai a=new Hai();
        Hai.fun();
        a.fun1();

    }
}
