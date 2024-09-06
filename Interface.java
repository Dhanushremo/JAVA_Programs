import java.util.Scanner;
abstract interface Calculator{
   abstract void add();
   abstract void sub();
}

class MyCal1 implements Calculator{
    @Override
    public void add() {
        System.out.println("ADD "+(10+20));
    }

    @Override
    public void sub() {
        System.out.println("SUB "+(20-10));
    }
}

class MyCal2 implements Calculator{
    @Override
    public void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int a= sc.nextInt();
        System.out.println("Enter b Number!");
        int b= sc.nextInt();
        System.out.println("ADD "+(a+b));

    }

    @Override
    public void sub() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int a= sc.nextInt();
        System.out.println("Enter b Number!");
        int b= sc.nextInt();
        System.out.println("SUB "+(a-b));
    }
}

class MyCal3 implements Calculator{

    @Override
    public void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int a= sc.nextInt();
        System.out.println("Enter b Number!");
        int b= sc.nextInt();
        if(a>b) {
            System.out.println("ADD " + (a + b));
        }
        else {
            System.out.println("IN VALID NUMBER!!");
        }

    }

    @Override
    public void sub() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int a= sc.nextInt();
        System.out.println("Enter b Number!");
        int b= sc.nextInt();
        if(a>b) {
            System.out.println("SUB " + (a - b));
        }
        else {
            System.out.println("INVALID NUMBER!!");
        }

    }
}
class Casio{
    void maths(Calculator c){
        c.add();
        c.sub();
    }
}

public class Interface {
    public static void main(String[] args) {
        MyCal1 m1=new MyCal1();
        MyCal2 m2=new MyCal2();
        MyCal3 m3=new MyCal3();
        Casio c=new Casio();
        c.maths(m1);
        System.out.println("---------------");
        c.maths(m2);
        System.out.println("---------------");
        c.maths(m3);
    }
}
