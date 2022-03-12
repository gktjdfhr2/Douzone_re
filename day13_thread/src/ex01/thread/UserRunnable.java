package ex01.thread;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface run() call ");
		System.out.println(name);
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(name + " ");
			if( i == 7) {
				try {					
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}				
			}			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
//		Runnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);		
//		Thread t2 = new Thread(new UserRunnable("u2"));
//		Thread t3 = new Thread(new UserRunnable("u3"));
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
		System.out.println("================================");
		System.out.println(
				new Thread(new UserRunnable("u1")).getId());
		System.out.println(
				new Thread(new UserRunnable("u1")).getName());
		System.out.println("================================");
		
		
		
	}
	
	

}
