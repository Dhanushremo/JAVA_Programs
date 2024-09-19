public class ExceptionHirarchy {
    public static void main(String[] args){
        System.out.println("Hai");
        try {
            hai();
        }
        catch (Error e){
            System.out.println("Handled in main");
        }
        }

     static void hai()throws  Error{
//        System.out.println("Hey");

                hai();
    }
}
