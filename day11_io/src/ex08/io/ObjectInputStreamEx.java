package ex08.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

public class ObjectInputStreamEx {
	public static void main(String[] args) 
			throws FileNotFoundException,
					ObjectStreamException,
					IOException, ClassNotFoundException
	{
		InputStream is = new FileInputStream("grade.txt");
		ObjectInputStream oos = new ObjectInputStream(is);
		
		Grade vo = (Grade)oos.readObject();
		System.out.println("result output:" + vo);
		oos.close();
	}
}
