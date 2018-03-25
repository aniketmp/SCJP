package concurrency;

/*step1: First let's summarize the conditions for getting read and write access to the resource:
Read Access   	If no threads are writing, and no threads have requested write access.
Write Access   	If no threads are reading or writing.

If a thread wants to read the resource, it is okay as long as no threads are writing to it, and no threads have requested write access 
to the resource. By up-prioritizing write-access requests we assume that write requests are more important than read-requests. 
Besides, if reads are what happens most often, and we did not up-prioritize writes, starvation could occur. 
Threads requesting write access would be blocked until all readers had unlocked the ReadWriteLock. If new threads were constantly granted 
read access the thread waiting for write access would remain blocked indefinately, resulting in starvation. Therefore a thread can only
 be granted read access if no thread has currently locked the ReadWriteLock for writing, or requested it locked for writing.
A thread that wants write access to the resource can be granted so when no threads are reading nor writing to the resource. 
It doesn't matter how many threads have requested write access or in what sequence, unless you want to guarantee fairness between 
threads requesting write access. 
 
 
 stage2: The ReadWriteLock class shown earlier is not reentrant. If a thread that has write access requests it again, it will block because there is already one writer - itself. Furthermore, consider this case:

    Thread 1 gets read access.

    Thread 2 requests write access but is blocked because there is one reader.

    Thread 1 re-requests read access (re-enters the lock), but is blocked because there is a write request

In this situation the previous ReadWriteLock would lock up - a situation similar to deadlock. No threads requesting neither read nor write access would be granted so.

To make the ReadWriteLock reentrant it is necessary to make a few changes. Reentrance for readers and writers will be dealt with separately.

 //step 3: To make the ReadWriteLock reentrant for readers we will first establish the rules for read reentrance:

   A) A thread is granted "READ REENTRANCE" if it can get read access (no writers or write requests), or if it already has read access (regardless of write requests).
   B) "WRITE REENTRANCE" is granted only if the thread has already write access.
   C)Sometimes a thread that has write access needs read access too. A writer should always be granted read access if requested. If a thread has write access no other threads can have read nor write access, so it is not dangerous.
   
   After implementing these three functionality we can say our class is fully function ReadWriteLock
   Fortunately , we already have such class in java
     
   

 */
public class ReadWriteLockDemo 
{

	  private int readers       = 0;
	  private int writers       = 0;
	  private int writeRequests = 0;

	  public synchronized void lockRead() throws InterruptedException{
	    while(writers > 0 || writeRequests > 0){
	      wait();
	    }
	    readers++;
	  }

	  public synchronized void unlockRead(){
	    readers--;
	    notifyAll();
	  }

	  public synchronized void lockWrite() throws InterruptedException{
	    writeRequests++;

	    while(readers > 0 || writers > 0){
	      wait();
	    }
	    writeRequests--;
	    writers++;
	  }

	  public synchronized void unlockWrite() throws InterruptedException{
	    writers--;
	    notifyAll();
	  }
}
