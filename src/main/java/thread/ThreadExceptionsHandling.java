package thread;
//Following demos shows which are the methods that throws exceptions and need to handle within try catch.
//Without handling these code ,CLASS WON'T COMPILE.
public class ThreadExceptionsHandling 
{
	public static void main(String[] args) 
	{
		
		Runnable r=new Runnable() 
		{				
			@Override
			public void run() {
					
				}
		};
		Thread t=new Thread(r);
		//Method 1:sleep()
		//ALl the methods done the same thing.But 2nd way of calling method is appropriate. Since its static method, it will give the
		//same effect as calling through the instance but calling through the instance can sometime be misleading. 
		//ONE CANNOT MAKE ANOTHER THREAD SLEEP
		try //handle it else class won't compile.
		{
			Thread.currentThread().sleep(1000);
			Thread.sleep(100);
			t.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}	
		
		//Method 2:wait()
		//This methods cannot be only handle with try catch block but also with synchronize block. i.e we have to have a lock of object on 
		//which these method get called.
		/*try {
			t.wait();////method 2a   Although this method compiles , it will through exception at runtime ' java.lang.IllegalMonitorStateException'
			//Since we dont have lock on t.
			synchronized(t)
			{
				t.wait(); //this is proper way of calling it.
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
		//method 3:notify() or notifyAll()
		//t.notify();// This method will compile since it doesn't through checked exception but it can through runtime exception if it don't hold lock. java.lang.IllegalMonitorStateException
		
		//Method 4:Join() 
		//The difference between join()  and sleep() is those methods are instance methods.
		
		/*try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ 
		
		//method 5: this method neither  through checked exception nor runtime exception
		t.yield();
		Thread.currentThread().yield();
	}
}

