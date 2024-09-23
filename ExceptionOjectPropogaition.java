import java.util.InputMismatchException;
import java.util.Scanner;

class Tpt{
    void park1(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Connection 4 Established!!");
            System.out.println("Enter the Numerator!!");
            int a=sc.nextInt();
            System.out.println("Enter the denaminator!!");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("The Divsion of the two given integers is "+c);
            System.out.println("--------------------------------------------");
            System.out.println("Enter the size of the array!!");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the data to be stored!! in the array");
            int data=sc.nextInt();
            System.out.println("Enter the idex value where the data to be stored!!");
            int index=sc.nextInt();
            arr[index]=data;
            System.out.println("The value in the given array is "+arr[index]);
     }
//        System.out.println("Enter the number");
//        int i=sc.nextInt();
//        System.out.println("Ente the number again");
//        int j=sc.nextInt();    catch immediatley follows the try block!!
//        int k=i/j;
//        System.out.println(k);
        catch (ArithmeticException a){
            System.out.println("Give Non-Zero integer");
        }
        catch (InputMismatchException i){
            System.out.println("Give Correct Input That Should be matched");
        }
        catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("Be the limits");
        }
        catch (NegativeArraySizeException n){
            System.out.println("Give Non-zero Size!!");
        }
        catch (Throwable t){
            System.out.println("Some Problem");
        }
        System.out.println("Connection 4 is terimnated");
    }
}
class Tpt1{
    public void park2(){
        System.out.println("Connection 3 Established!!");
        Tpt t=new Tpt();
        t.park1();
        System.out.println("Connection 3 is terimnated");
    }
}
class Tpt2 {
    public void park3(){
        System.out.println("Connection 2 Established!!");
        Tpt1 t1=new Tpt1();
        t1.park2();
        System.out.println("Connection 2 is terimnated");
    }
}
public class ExceptionOjectPropogaition {
    public static void main(String[] args) {
        System.out.println("Connection 1 Established!!");
        Tpt2 t2=new Tpt2();
        t2.park3();
        System.out.println("Connection 1 is terimnated");

    }
}
