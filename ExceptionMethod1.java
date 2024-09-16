import java.util.Scanner;
class Exception112{
   static void alpha(){
       try{
           System.out.println("Connection4 Established");
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the numerator");
           int a=sc.nextInt();
           System.out.println("Enter the Denamerator");
           int b=sc.nextInt();
           int c=0;
           c=a/b;
           System.out.println(c);
       }
       catch(Exception e){
           System.out.println("Non-Denaminator Zero");
       }
        System.out.println("Connection4 Terminated");

    }
}

class Exception11{
    static void beta(){
        System.out.println("Connection3 Established");
        Exception112.alpha();
        System.out.println("Connection3 Terminated");
    }
}

class Exception77 {
    static void gamma(){
        System.out.println("Connection2 Established");
        Exception11.beta();
        System.out.println("Conection2 Terminated");
    }
}
public class ExceptionMethod1 {
    public static void main(String[] args) {
        System.out.println("Connection1 Established");
        Exception77.gamma();
        System.out.println("Conection1 Terminated");

    }
}
