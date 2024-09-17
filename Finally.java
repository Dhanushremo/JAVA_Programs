import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scan=null;
      try{
          scan=new Scanner(System.in);
      }
        finally{
            scan.close();
        }

    }
}
