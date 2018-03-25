package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
	public static void main(String[] args) {
		AtomicInteger atm=new AtomicInteger();		
		System.out.println(atm.get());
		
		System.out.println("---------addAndGet--------");
		System.out.println(atm.addAndGet(1));				
		System.out.println(atm.addAndGet(2));
		
		System.out.println("---------getAndAdd--------");		
		System.out.println(atm.getAndAdd(1)); //Note this.It will get the value first and then add to it		
		System.out.println(atm.getAndAdd(4));
		
		System.out.println("---------getAndIncrement--------");		
		System.out.println(atm.getAndIncrement()); //It will get the value first and then increment
		System.out.println(atm.getAndIncrement());
		
		System.out.println("---------getAndIncrement--------");
		System.out.println(atm.incrementAndGet());
		System.out.println(atm.incrementAndGet());
		
		//Similar API for decrementAndGet and getAndDecrement
	
		System.out.println("-------Set and get--------");
		atm.set(30);
		System.out.println(atm.get());
		System.out.println(atm.compareAndSet(30, 32));
		System.out.println(atm.getAndSet(35));		
		System.out.println(atm.get());
	}
}
