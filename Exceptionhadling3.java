
import java.util.Scanner;
class DuckingException{
    void alpha() throws Exception
    {

            Scanner sc=new Scanner(System.in);
            System.out.println("Connection2 is Established");
            System.out.println("Enter the numerator!");
            int a=sc.nextInt();
            System.out.println("Enter the denamenator");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
            System.out.println("Connecton2 is terminated!!");
    }
}

public class Exceptionhadling3{
    public static void main(String[] args) {
        System.out.println("Connection1 is Established");
        DuckingException de=new DuckingException();
        try{
            de.alpha();
        }
       catch (Exception e){
            System.out.println("Handled in main!!");
       }
        System.out.println("Connecton1 is terminated!!");

    }
}


