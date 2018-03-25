package concurrency;

//In the previous example we have tried to implement ReadWriteLock so that we get some insights. Now we will use already created ReadWriteLock by java

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLockDemo2<E>
{
	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	private final Lock readLock = readWriteLock.readLock();

	private final Lock writeLock = readWriteLock.writeLock();

	private final List<E> list = new ArrayList<>();
	
	public void set(E o)
	{
		writeLock.lock();//If u use here readLock then also program compiles fine and run but its not proper to use such.
		try
		{
			list.add(o);
			System.out.println("Adding element by thread"+Thread.currentThread().getName());
	        }
		finally
		{
			writeLock.unlock();  
		}
	}
	
	public E get(int i)
	{
		readLock.lock();
		try
		{
                        System.out.println("Printing elements by thread "+Thread.currentThread().getName());
			return list.get(i);
		}
		finally
		{
			readLock.unlock();
		}
	}
      public static void main(String[] args)
      {
    	   ReadWriteLockDemo2<String> threadSafeArrayList = new ReadWriteLockDemo2<>();
           threadSafeArrayList.set("1");
           threadSafeArrayList.set("2");
           threadSafeArrayList.set("3");

          System.out.println("Printing the First Element : "+threadSafeArrayList.get(1));
      }
}