class Parent{
   protected void readbooks() {
        System.out.println("i will red books!!");
    }
        void walking () {
            System.out.println("i will walk");
        }
    }
class Child extends Parent{
    @Override
   public void readbooks() {  //we can use acces modifer publlic because of access vibility increses
        System.out.println("i will read java");
    }
}

    public class MethodOverRiding {
        public static void main(String[] args) {
            Child c=new Child();
            c.readbooks();
            c.walking();

        }
    }

