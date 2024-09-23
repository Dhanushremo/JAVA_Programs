import java.util.Scanner;
class MultiR11 implements Runnable{
        @Override
        public void run() {
            System.out.println("ADDITION STARTED");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number1 ");
            int num1=sc.nextInt();
            System.out.println("Enter Number2 ");
            int num2=sc.nextInt();
            int res=0;
            try {
                res=num1/num2;
            }
            catch (Throwable e){
//                e.printStackTrace();
               System.out.println( e.getMessage());
            }
            System.out.println("Result "+res);
            System.out.println("ADDITION ENDED");
        }
    }

    class MultiR111 implements Runnable{
        @Override
        public void run() {
            System.out.println("PRINTING CHARS");
            for(int i=65;i<=75;i++){
                System.out.println((char)i);
                try{
                    Thread.sleep(1000);
                }
                catch (Throwable e){
                    e.printStackTrace();
                }
            }
            System.out.println("PRINTING CHARS ENDED");

        }
    }

    class MultiR21 implements Runnable{
        @Override
        public void run() {
            System.out.println("PRINTING NUMBERS");
            for(int i=65;i<=75;i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }
                catch (Throwable e){
                    e.printStackTrace();
                }
            }
            System.out.println("PRINTING NUMBERS ENDED");

        }
    }
public class ExceptionThread {
        public static void main(String[] args) {
            MultiR11 m=new MultiR11();
            MultiR111 m1=new MultiR111();
            MultiR21 m2=new MultiR21();

            Thread t1=new Thread(m);
            Thread t2=new Thread(m1);
            Thread t3=new Thread(m2);

            t1.start();
            t2.start();
            t3.start();
        }
    }


