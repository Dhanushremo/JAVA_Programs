import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
      try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of an array");
          int a = sc.nextInt();
          int[] arr = new int[a];
          System.out.println(arr[0]);
      }

    catch (Exception e){
          System.out.println("Be Positive!!");
    }
    }
}
