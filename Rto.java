package com.dhanush.java;
import java.util.Scanner;
class UnderAgeException extends Throwable{
	Driving d=new Driving();
	@Override
	public String getMessage() {
		return " Your Age is UnderAgeException we cant provide Lisences";
	}
}
class OverAgeExecption extends Throwable{
	Driving d=new Driving();
	@Override
	public String getMessage() {
		return "Your Age is OverAgeException we cant provide Lisences";
	}
}
class Driving{
	public final int firstAge=18;
	int a;
	public final int lastAge=60;
	
	public void acceptInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Age!!");
	a=sc.nextInt();
	}
	public void verfiy() throws UnderAgeException,OverAgeExecption{
		if(a>firstAge && a<lastAge) {
			System.out.println("Congragulatiions you are Age excatly Matched foe tha Driving!!");
		}
		else if(a<firstAge) {
			UnderAgeException ua=new UnderAgeException();
			System.out.println(ua.getMessage());
			throw ua;
		}
		else {
			OverAgeExecption oe=new OverAgeExecption();
			System.out.println(oe.getMessage());
			throw oe;
			
		}
	}
}
class Rto1{
	public void init() {
		Driving d1=new Driving();
		
		try {
			d1.acceptInput();
			d1.verfiy();
		}
		catch(UnderAgeException ue){
			System.out.println("Re-Enter");
			try {
				d1.acceptInput();
				d1.verfiy();
			}
			catch(UnderAgeException ue1) {
				System.out.println("Re-Enter");
				try {
					d1.acceptInput();
					d1.verfiy();
				}
				catch(UnderAgeException ue2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
				catch(OverAgeExecption oe2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
			}
			catch(OverAgeExecption oe1) {
				System.out.println("Re-Enter");
				try {
					d1.acceptInput();
					d1.verfiy();
				}
				catch(UnderAgeException ue2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
				catch(OverAgeExecption oe2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}

			}
		}
		catch(OverAgeExecption oe) {
			System.out.println("Re-Enter");
			try {
				d1.acceptInput();
				d1.verfiy();
			}
			catch(UnderAgeException ue1) {
				System.out.println("Re-Enter");
				try {
					d1.acceptInput();
					d1.verfiy();
				}
				catch(UnderAgeException ue2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
				catch(OverAgeExecption oe2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
			}
			catch(OverAgeExecption oe1) {
				System.out.println("Re-Enter");
				try {
					d1.acceptInput();
					d1.verfiy();
				}
				catch(UnderAgeException ue2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
				catch(OverAgeExecption oe2) {
					System.out.println("Sorry You Reached The Limit,Your Blocked");
				}
			}
		}
	}
}
public class Rto {
	public static void main(String[] args) {
		Rto1 r=new Rto1();
		r.init();
	}
}
