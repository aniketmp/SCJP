package org.inheritance;
class Parent2
{
	public Parent2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("In Parent2 i:"+i);
		
	}
}
public class Inh6 extends Parent2{
	int i=15;
	public Inh6(int j) {
		//super(i);  //compilation error...Cannot refer to an instance field i while explicitly invoking a constructor  
		super(j); //Possible since j is local variable not instance variable.
		// TODO Auto-generated constructor stub
	}

	

}
