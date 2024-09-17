import java.util.Scanner;

class HandlingException{
    void alpha(){
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
            System.out.println("Hadnled in main");
        }
    }
}

public class ExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("Connection1 is Established");
        HandlingException he=new HandlingException();
            he.alpha();

        System.out.println("Connecton1 is terminated!!");

    }
}
