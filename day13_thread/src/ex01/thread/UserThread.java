package ex01.thread;

public class UserThread extends Thread{
	String name;
	
	public UserThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print(name + " ");
		
		for (int i = 0; i <= 10; i++) {			
			if( i == 7) {
				try {
					
					sleep(500);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}				
			}			
			System.out.println(i);
			
		}
		
		
	}
	
	
}
