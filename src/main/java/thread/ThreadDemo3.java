package thread;

//predict the output when option1 & 2 inserted seperately
class DudesChat {
	static long flag=0;
	//option 1
	 synchronized void chat(long id)
	 //option 2
	 //void chat(long id)
	 {
		 if(flag==0) flag=id;
		 for(int x=1;x<3;x++)
		 {
			 if(flag==id)
				 System.out.println("yo ");
			 else
				 System.out.println("dude");
		 }
		 
	 }
}
public class ThreadDemo3 implements Runnable
{
	static DudesChat d;
	public static void main(String[] args) {
		new ThreadDemo3().go();
	}
	void go()
	{
		d=new DudesChat();
		new Thread(new ThreadDemo3()).start();
		new Thread(new ThreadDemo3()).start();
	}
	@Override
	public void run() {
		d.chat(Thread.currentThread().getId());
		
	}
}