package ex01.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TextAreaMain extends Frame implements ActionListener{
	TextArea ta;
	Button btn;
	public TextAreaMain(String str) {
		
		setTitle("First Frame");
		setBackground(Color.YELLOW);
		setVisible(true);
		setBounds(500, 350, 500, 300);
		
		btn = new Button("Button1");
		ta = new TextArea("문장을 넣으세요", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		
		this.add(btn);
		btn.addActionListener(this);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭되었습니다.");
			}
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
			
		});

		
	}
	public static void main(String[] args)  {
		new TextAreaMain("새창 띄우기");	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("클릭되었습니다.");
	}
			
}
