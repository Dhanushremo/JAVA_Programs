import java.util.InputMismatchException;
import java.util.Scanner;

public class Singlr_try_mulltiple_catch {
    public static void main(String[] args) {
                try{
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Connection Established!");
                    System.out.println("Enter the numerator!");
                    int a=sc.nextInt();
                    System.out.println("Enter the denomenator");
                    int b=sc.nextInt();
                    int c=a/b;
                    System.out.println(c);
                    System.out.println("________________________");
                    System.out.println("Enter the size of the array");
                    int n=sc.nextInt();
                    int[] arr=new int[n];
                    System.out.println("Enter the data to stored in the array");
                    int data=sc.nextInt();
                    System.out.println("Enter the index to diplay the data int the array");
                    int index=sc.nextInt();
                    arr=null; //reference have address value,now that value will be null and it will go to gc
                    arr[index]=data;
                    System.out.println(arr[index]);
                }

                catch (ArithmeticException a){
                    System.out.println("Non-denomator integer");
                }
                catch (InputMismatchException i){
                    System.out.println("Given correct input that should be matched");
                }
                catch (NegativeArraySizeException ne){
                    System.out.println("Negative index is incorrect");
                }
                catch (ArrayIndexOutOfBoundsException ab){
                    System.out.println("Be in your limits");
                }
                catch (Exception e){
                    System.out.println("Problem"); //the generic cstch will be always in last
                }
                System.out.println("Connection Terminated");

    }
}
