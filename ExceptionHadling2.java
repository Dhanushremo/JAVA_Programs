
import java.util.Scanner;
class ReThrowingException{
    void alpha() throws Exception
    {
        try{

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
        catch (Exception e){
            System.out.println("Handled in alpha");
            throw e;
        }
    }
}

public class ExceptionHadling2{
    public static void main(String[] args){
        System.out.println("Connection1 is Established");
        ReThrowingException re=new ReThrowingException();
        try{
            re.alpha();
        }
        catch (Exception e){
            System.out.println("Handled in main");
        }
        System.out.println("Connecton1 is terminated!!");

    }
}


