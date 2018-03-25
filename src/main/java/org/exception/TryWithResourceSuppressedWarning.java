package org.exception;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResourceSuppressedWarning {

	class Lamb implements Closeable
	{
	
		@Override
		public void close() {
			System.out.println("In close..");
			throw new RuntimeException("a");
		}
		
	}
	public static void main(String[] args) {
		new TryWithResourceSuppressedWarning().run();
	}
	private void run() {
		try(Lamb l=new Lamb();) //note: ';' is optional
		{			
			//stage 1:This will throw RuntimeException (b) which causes close() to execute.Since close is also throwing RuntimeException (a),
			//and there is already one exception present, close() exception (a) will get suppressed.  
			throw new RuntimeException("b");
			//In stage 2:This will throw RuntimeException (b) which causes close() to execute.Since close is also throwing RuntimeException (a),
			//and there is already one exception present, close() exception (a) will get suppressed. But instead of RuntimeException being thrown
			//there is already generic catch block. Hence this flow will normally transferred to catch block. Now catch block is throwing
			//RuntimeException (c), this will be sent to stacktrace.
		}
		//Stage 2:Un-commenting this catch block which is commented in stage 1
		/*catch(Exception e)
		{
			throw new RuntimeException("c");
		}*/				
	}
}