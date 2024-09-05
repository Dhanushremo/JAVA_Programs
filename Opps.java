import java.util.Scanner;
abstract class Shape{
    float area;
    abstract void acceptInput();
    abstract void calArea();
    void disp(){
        System.out.println("The area is "+area);
    }
}

class Square extends Shape{
    private float side;
    @Override
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Side");
        side=sc.nextFloat();
        System.out.println(side);
    }
    void calArea(){
        area=side*side;

    }
}
class Rectangle extends Shape{
    private float length;
    private float breadth;

    @Override
    void acceptInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The length");
        length=sc.nextFloat();
        breadth=sc.nextFloat();

    }

    @Override
    void calArea() {
        area=length*breadth;

    }
}

class Circle extends Shape{
    private float radius;

    @Override
    void acceptInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Radius");
        radius=sc.nextFloat();
    }

    @Override
    void calArea() {
        area=(float) 3.147*radius*radius;
    }
}

class Geometory{
    void maths(Shape ref){
        ref.acceptInput();
        ref.calArea();
        ref.disp();

    }
}

public class Opps {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Geometory g=new Geometory();
        g.maths(s);
        System.out.println("---------------------------------");
        g.maths(r);
        System.out.println("---------------------------------");
        g.maths(c);
        System.out.println("---------------------------------");
    }
}
