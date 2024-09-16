import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Connecton Established");
        System.out.println("Enter The Numerator!!");
        int a=sc.nextInt();
        System.out.println("Enter the Denamirator!!");
        int b=sc.nextInt();
        int c=0;
        try{
            c=a/b;
        }
        catch (Exception e){
            System.out.println("that exception was been handled");
        }
        System.out.println(c);
        System.out.println("Connection Terminated!!");
    }
}
