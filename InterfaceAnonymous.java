interface Display3{
    void disp();
}

public class InterfaceAnonymous {
    public static void main(String[] args) {
        Display3 d = new Display3()
        {
            @Override
            public void disp () {
                System.out.println("Heloo");
            }
        };
        d.disp();
    }
}
