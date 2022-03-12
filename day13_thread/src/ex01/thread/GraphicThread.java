package ex01.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		color = Color.black;
		random =new Random();
		
		setSize(500, 300);
		setVisible(true);
		setLocation(0,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Rectangle rect = getBounds();
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 30, 30);		
	}
	public static void main(String[] args) {
		GraphicThread gframe = new GraphicThread(2000);
		Thread t = new Thread(gframe);
		t.start();
		
	}

}
