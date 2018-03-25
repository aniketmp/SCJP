package thread;

public class ThreadDemo1 extends Thread{
	public static void main(String[] args) {
		//This is another way of creating new thread since Thread implements Runnable
		new Thread(new ThreadDemo1()).start();		
	}	
	public void run()
	{
		System.out.println("Thred is running!");
	}
}
