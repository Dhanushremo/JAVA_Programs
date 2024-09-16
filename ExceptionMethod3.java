import java.util.Scanner;
class Exception11211{
     void alpha(){
        System.out.println("Connection4 Established");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int a=sc.nextInt();
        System.out.println("Enter the Denamerator");
        int b=sc.nextInt();
        int c=0;
        c=a/b;
        System.out.println(c);
        System.out.println("Connection4 Terminated");

    }
}

class Exception1111{
    void beta(){
        System.out.println("Connection3 Established");
            Exception11211 e=new Exception11211();
            e.alpha();
        System.out.println("Connection3 Terminated");
    }
}

class Exception7711 {
     void gamma(){
        System.out.println("Connection2 Established");
        try{
            Exception1111 e=new Exception1111();
            e.beta();
        }
        catch (Exception e){
            System.out.println("Non_Denaminator Zero!!");
        }
        System.out.println("Conection2 Terminated");
    }
}
public class ExceptionMethod3{
    public static void main(String[] args) {
        System.out.println("Connection1 Established");
        Exception7711 e=new Exception7711();
        e.gamma();
        System.out.println("Conection1 Terminated");

    }
}

























