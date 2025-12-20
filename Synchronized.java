

class Printer implements Runnable{
	synchronized public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"printing started");
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
				}
			catch(Exception e) {
				System.out.println("some problem occured");
			}
		}
		System.out.println(name+"completed the printing");
	}
}
public class Synchronized {

	public static void main(String[] args) {
		Printer p=new Printer();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		t1.setName("Keerthi");
		t2.setName("nami");
		t3.setName("jimbei");
		t1.start();
		t2.start();
		t3.start();

	}

}
