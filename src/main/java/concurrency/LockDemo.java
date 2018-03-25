package concurrency;

//Step 1:Notice the synchronized(this) block in the inc() method. This block makes sure that only one thread can execute the
//return ++count at a time. The code in the synchronized block could have been more advanced, but the simple ++count 
//suffices to get the point across.

//Step2 (Custom lock implementation):The Counter class could have been written like this instead, using a MyLock instead of a synchronized block

//Step3 :Step2 implementation wasn't reentrant. i.e if we call again inc() after lock.lock() by same thread , it will block (according to current logic).
//Hence we have to make it reentrant which are covered in step3

//step4:When guarding a critical section with a Lock, and the critical section may throw exceptions, it is important to call the unlock() method from inside a finally-clause. Doing so makes sure that the Lock is unlocked so other threads can lock it.
// If unlock() was not called from inside a finally-clause, and an exception was thrown from the critical section, the Lock would remain locked forever, causing all threads calling lock() on that Lock instance to halt indefinately.
public class LockDemo 
{
	private int count = 0;

    private MyLock lock = new MyLock();	//step2

	  public int inc()
	  {
	    //synchronized(this)
		 
	    {
	      try 
	      {
	    	  
	    	  lock.lock();//step2
	    	  int newCount = ++count;
	    	 // lock.unlock();//step2
	    	  return newCount;
	      } 
	      catch (InterruptedException e) 
	      {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		  }
	      finally
	      {	    	  
	    	  lock.unlock();//step4    		
	      }
	    }
	    return -1;
	  }	
}
//step2
class MyLock 
{

	  
	  Thread  lockedBy = null; //step3
	  int     lockedCount = 0;//step3

	  private boolean isLocked = false;

	  public synchronized void lock()
	  throws InterruptedException
	  {
		Thread callingThread = Thread.currentThread();//step3
		while(isLocked && lockedBy != callingThread) //step3
	    //while(isLocked) //step2
	    {
	      wait();
	    }
	    isLocked = true;
	    
	    lockedCount++; //step3
	    lockedBy = callingThread; //step3
	  }

	  public synchronized void unlock()
	  {
		  if(Thread.currentThread() == this.lockedBy)//step3
		  {
		      lockedCount--;//step3
		      if(lockedCount==0)
		      {
			    isLocked = false;
			    notify();
		      }
		  }
	  }
}