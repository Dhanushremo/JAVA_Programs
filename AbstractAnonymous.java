abstract class A{
  protected abstract void display();
  void helo(int a){
      System.out.println("Heloo 123");
  }
}

public class AbstractAnonymous {
    public static void main(String[] args) {
        A a=new A(){
            @Override
            protected void display() {
                System.out.println("Hey Iam Modified");
            }

            @Override
            void helo(int a) {
//                super.helo();
                System.out.println("I too Modified");
            }
        };
        a.display();
        a.helo(10);
    }
}
