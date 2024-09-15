import java.util.Scanner;
@FunctionalInterface
interface Display45{
    void disp(int[] arr);
}

public class Lambda2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int N= sc.nextInt();
        int[] arr1=new int[N];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        Display45 d=(int[] arr)->{
            int sum=0;
            for(int i=0;i<arr1.length;i++){
                sum=sum+arr[i];
            }
            double avearge = sum/arr.length;
            System.out.println("The avearge is "+avearge);
        };
        d.disp(arr1);
    }
}
