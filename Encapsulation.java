import java.util.Scanner;
class Student1{
    private int stuId;
    private String stuName;
    private long stuRoll;
    private String stuMail;

    public void setId(int stuId){
        this.stuId=stuId;
    }
    public int getId(){
        return stuId;
    }
    public void setName(String stuName){
        this.stuName=stuName;
    }
    public String getName(){
        return stuName;
    }
    public void setStuRoll(long stuRoll){
        this.stuRoll=stuRoll;
    }
    public long getStuRoll(){
        return stuRoll;
    }
    public void setMail(String stuMail){
        this.stuMail=stuMail;
    }
    public String getMail(){
        return stuMail;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
//        s.setId(10);
//        s.setName("Dhanush");
//        s.setStuRoll(2210588);
//        s.setMail("remo@gdn");
//        System.out.println(s.getId());
//        System.out.println(s.getName());
//        System.out.println(s.getMail());
//        System.out.println(s.getStuRoll());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of Objects to be Created!!");
        int a=sc.nextInt();
        Student1[] arr=new Student1[a];
        for(int i=0;i< arr.length;i++){
            Student1 s=new Student1();
            System.out.println("Enter the student No "+(i+1) +" st ID");
            s.setId(sc.nextInt());
            System.out.println("Enter the student No "+(i+1) +" st Name");
            sc.nextLine();
            s.setName(sc.nextLine());
            System.out.println("Enter the student No "+(i+1) +" st RollNo");
            s.setStuRoll(sc.nextLong());
            System.out.println("Enter the student No "+(i+1) +" st Email");
            sc.nextLine();
            s.setMail(sc.nextLine());
            arr[i]=s;
        }
        for(Student1 s1:arr){
            System.out.println(s1.getId());
            System.out.println(s1.getName());
            System.out.println(s1.getStuRoll());
            System.out.println(s1.getMail());



        }


    }
}
