package thread;

public class ThreadDemo2 implements Runnable{
	void go(long id)
	{
		System.out.println(id+"  name:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+"  name:"+Thread.currentThread().getName()); //default thread id is  positive long number generated when this thread was created. The thread ID is unique and remains unchanged during its lifetime.
		new ThreadDemo2().run();
		new Thread(new ThreadDemo2()).start();
		new Thread(new ThreadDemo2()).run();
		//new ThreadDemo2().start(); //cannot start runnable
		
	}
	public void run()
	{
		go(Thread.currentThread().getId());
	}
}
