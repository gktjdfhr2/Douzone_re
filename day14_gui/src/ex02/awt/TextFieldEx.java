package ex02.awt;
import java.awt.*;
public class TextFieldEx{
	public static void main(String[] args){
		Frame f=new Frame("텍스트필드 테스트");
		Panel p=new Panel();
		
		TextField tf1=new TextField("아이디 입력",20);
		TextField tf2=new TextField("암호 입력", 10);
		tf1.selectAll();
		tf2.selectAll();
		tf2.setEchoChar('*');

		p.add(tf1);
		p.add(tf2);
		f.add(p);
		f.setSize(300,100);
		f.setVisible(true);
	}
}
