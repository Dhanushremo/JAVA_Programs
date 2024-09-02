class Charger{
    private String charger;
    private float voltage;

    public Charger(String charger,float voltage){
        super();
        this.charger=charger;
        this.voltage=voltage;

    }

    public String getname(){
        return charger;
    }
    public float getvol(){
        return voltage;
    }
}
class Os{
    private String name;
    private int size;

    public Os(String name, int size) {
        super();
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

class Mobile{
    Os o=new Os("Android",57);

    void hasA(Charger c){
       System.out.println(c.getname());
        System.out.println(c.getvol());

    }
}
public class AggregationComposition {
    public static void main(String[] args) {
        Charger c=new Charger("SAMSUNG",33.0f);
        Mobile m=new Mobile();
//        m=null;
//       System.out.println(c.getname());
//        System.out.println(c.getvol());
        System.out.println(m.o.getName());
        System.out.println(m.o.getSize());
          m.hasA(c);
//        m=null;
//        System.out.println(m.o.getName());
//        System.out.println(m.o.getSize());

    }
}
