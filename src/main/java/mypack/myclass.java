package mypack;



//import mypack2.*; //although we are in mypack , and mypack2 is in mypack, we cannot directly import mypack2
//import mypack.mypack2; //we cannot import mypack.mypack2 as well since this is package name not a class name. 
import mypack.mypack2.*;


public class myclass {
	public static void main(String[] args) {
		new myclass2().disp();
		//new mypack2.myclass2().disp();// this is improper way to call disp in myclass2
		new mypack.mypack2.myclass2().disp();
		
		mypack.mypack2.myclass2 m=new mypack.mypack2.myclass2(); //This is creating object by using full qualified class name.
		m.disp();
		
		
	}

	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("In disp2");
		
	}

}
