class Bike{
    private int bikeSpeed;
    private String bikeColor;

    public Bike(int bikeSpeed, String bikeColor) {
        this.bikeSpeed = bikeSpeed;
        this.bikeColor = bikeColor;
    }

    public int getBikeSpeed() {
        return bikeSpeed;
    }

    public String getBikeColor() {
        return bikeColor;
    }
}

class Books{
    private int bookPages;
    private String bookColor;

    public Books(int bookPages,String bookColor){
        super();
        this.bookPages=bookPages;
        this.bookColor=bookColor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookColor() {
        return bookColor;
    }
}

class Heart{
    private int heartSpm;
    private String heartColor;

    public Heart(int heartSpm, String heartColor) {
        super();
        this.heartSpm = heartSpm;
        this.heartColor = heartColor;
    }

    public int getHeartSpm() {
        return heartSpm;
    }

    public String getHeartColor() {
        return heartColor;
    }
}
class Brain{
    private int brainWeight;
    private String brainColor;

    public Brain(int brainWeight, String brainColor) {
        this.brainWeight = brainWeight;
        this.brainColor = brainColor;
    }

    public int getBrainWeight() {
        return brainWeight;
    }

    public String getBrainColor() {
        return brainColor;
    }
}

class Student{
    Heart h=new Heart(72,"Red");
    Brain b=new Brain(1400,"Gray");

   void hasA(Bike b){
        System.out.println(b.getBikeColor());
        System.out.println(b.getBikeSpeed());
    }
    void hasB(Books s){
       System.out.println(s.getBookColor());
       System.out.println(s.getBookPages());
    }
}
public class AggregationCompositionStudent {
    public static void main(String[] args) {
        Bike b = new Bike(120, "Black");
        Books b1 = new Books(20, "White");
//        Student s = new Student();
//        System.out.println(s.h.getHeartColor());
//        System.out.println(s.h.getHeartSpm());
//        System.out.println(s.b.getBrainColor());
//        System.out.println(s.b.getBrainWeight());
//        s.hasA(b);
//        s.hasB(b1);
//        s=null;
//        System.out.println(s.h.getHeartColor());
//        System.out.println(s.h.getHeartSpm());
//        System.out.println(s.b.getBrainColor());
//        System.out.println(s.b.getBrainWeight());
        System.out.println(b.getBikeSpeed());
        System.out.println(b.getBikeColor());
        System.out.println(b1.getBookPages());
        System.out.println(b1.getBookColor());


    }
}
