package org.exception;
import java.io.IOException;
//stage 1
interface Check
{
	public void blast() throws IOException;
}
//stage 2
interface Check2
{
	public void blast(); 
}
public class trycatch14 implements Check, Check2{

	@Override
	//public void blast() throws Exception { //Not Allowed in stage 1:It follows overriding method rules even in the case of interface.
	//public void blast() throws IOException { //Not allowed in stage 2 since this method also overriding blast() of stage 2 , 
	//its signature should satisfy all interfaces.
	public void blast() { 
		// TODO Auto-generated method stub
		
	}

}
