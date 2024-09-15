@FunctionalInterface
interface Display07{
    void disp(int[] arr);
}

public class Lambda1 {
    public static void main(String[] args) {
        Display07 d= new Display07(){
            @Override
            public void disp(int[] arr) {
                for(int i=0;i<arr.length;i++){
                    if(arr[i]%2==0){
                        System.out.println("The even numbers in the array are "+arr[i]+" ");
                    }
                }
            }
        };
        int[] numbers = {1,2,3,4,5,5,6,7,8,9,10};
        d.disp(numbers);

    }
}
