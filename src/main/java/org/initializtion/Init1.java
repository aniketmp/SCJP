package org.initializtion;

public class Init1 {

	int a,b,c; //legal
	int j, k=1, l=2; //You have also option to initialize all the variables right in place.
	int p, q=1,r,s=q+3;// legal. q is initialize before using it.
		
	
	
	//but these are not
	//int u,v=x+3, y ,x=2;//Illegal.. x is not initialized before v using it.
	//int d, e=d+2,f; //Illegal...d is not initialized before e using it.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=b=c=10; //Legal
	}

}
