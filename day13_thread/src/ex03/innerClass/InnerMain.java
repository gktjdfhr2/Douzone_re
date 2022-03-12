package ex03.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain{
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("Button-Start");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionEvent 발생했습니다.");
//				System.out.println(e.getActionCommand());
//				System.out.println(e.getSource());
			}
		});
		
		frame.add(btn);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setLocation(300,150);
	}
	
	
	
	
//	class EventHandler implements ActionListener{	// outer class
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("ActionEvent 발생했습니다.");
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
//		}	
//	}
//	
//	public static void main(String [] args) {
//		Frame frame = new Frame("이벤트 처리 - 이너클래스");
//		Button btn = new Button("Button-Start");
//		
//		//1.
//		EventHandler handler = new InnerMain().new EventHandler();
//		btn.addActionListener(handler);
//		
//		frame.add(btn);
//		frame.setSize(300,200);
//		frame.setVisible(true);
//		frame.setLocation(300,150);
//		
//		
//		
//	}
}
