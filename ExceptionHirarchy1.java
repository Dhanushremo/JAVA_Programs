public class ExceptionHirarchy1 {
        public static void main(String[] args) {
            try{
                int c=100/0;
            }
            catch (Exception e){
                System.out.println("Handled");
            }
//            catch (ArithmeticException e){
//                System.out.println("Handled2");
//            }
            catch (Throwable e){
                System.out.println("Handled3");
            }
//            catch (RuntimeException e){
//                System.out.println("Handled4");
//            }

        }
}
