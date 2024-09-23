import java.util.Scanner;

@FunctionalInterface
interface Array{
    public abstract void array(int arrr[]);
}

public class Lambda3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of the array!");
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
       Array ar=(int arrr[])->{
            for(int i=0;i<arrr.length;i++){
                if(arrr[i]<=0){
                    continue;
                }
                System.out.print(arrr[i]+" ");
            }
        };
        ar.array(arr);
    }
}
