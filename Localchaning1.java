class Localchaning1
{
    int z;
    Localchaning1()
    {
        System.out.println("Top default constructor");
    }

}
class A2 extends Localchaning1 {
    int x;

    A2(int num) {
        x = num;
        System.out.println("A parameterized constructor");
    }

    A2() {
        this(5);
        System.out.println("A default constructor");
    }

    public static void main(String arg[]) {
        new A2();
    }
}