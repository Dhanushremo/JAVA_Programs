import java.util.Scanner;
class Exception112111{
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

class Exception11111{
    void beta(){
        System.out.println("Connection3 Established");
        Exception112111 e=new Exception112111();
        e.alpha();
        System.out.println("Connection3 Terminated");
    }
}

class Exception77111{
    void gamma(){
        System.out.println("Connection2 Established");
            Exception11111 e=new Exception11111();
            e.beta();
        System.out.println("Conection2 Terminated");
    }
}
public class ExceptionMethod4{
    public static void main(String[] args) {
        System.out.println("Connection1 Established");
        try{
            Exception77111 e=new Exception77111();
            e.gamma();
        }

         catch (Exception e){
            System.out.println("Non_Denaminator Zero!!");
        }
        System.out.println("Conection1 Terminated");

    }}


