package concurrency;


import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcDemo2 {	
	public static void main(String[] args) {
		ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
		//lock.readLock().unlock();//java.lang.IllegalMonitorStateException: attempt to unlock read lock, not locked by current thread
		System.out.println("READ-UNLOCK-1");
		lock.readLock().lock();
		System.out.println("READ-LOCK-1");
		lock.readLock().unlock();
		System.out.println("READ-UNLOCK-2");
		//lock.readLock().unlock();//java.lang.IllegalMonitorStateException: attempt to unlock read lock, not locked by current thread
		System.out.println("READ-UNLOCK-3");
		//lock.writeLock().unlock(); // java.lang.IllegalMonitorStateException
		System.out.println("WRITE-UNLOCK-1");
	}
}
