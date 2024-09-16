import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) {
        int c=0;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Connecton Established");
            System.out.println("Enter The Numerator!!");
            int a=sc.nextInt();
            System.out.println("Enter the Denamirator!!");
            int b=sc.nextInt();
            c=a/b;
        }

        catch (Exception e){
            System.out.println("that exception was been handled");
        }
        System.out.println(c);
        System.out.println("Connection Terminated!!");
    }
}
