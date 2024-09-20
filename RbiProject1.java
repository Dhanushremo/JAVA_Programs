import java.util.Scanner;
class InvalidException extends Exception{

}
class Atm{
    int pin=2327;
    int p;
    String name;
    public void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Pin!!");
        p=sc.nextInt();
    }
    public void verify() throws InvalidException{
            if(pin==p){
                System.out.println("Ok! "+name+" now you can enter the AMOUNT to take!!");
            }
            else {
                InvalidException ie = new InvalidException();
                System.out.println("Invalid");
                throw ie;
            }
    }
}
class Bank{
    public void init(){
        Atm a=new Atm();
        a.acceptInput();
        try{
            a.verify();
        }
        catch (InvalidException e){
            a.acceptInput();
            try {
                a.verify();
            }
            catch (InvalidException f){
                a.acceptInput();
                try{
                    a.verify();
                }
                catch (InvalidException g){
                    System.out.println("Sorr1 Your Card was Blocked!!");
                }
            }
        }

    }
}
public class RbiProject1 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.init();
    }
}
