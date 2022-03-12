package ex02.stringBuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		System.out.println(sb.length());
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
	}
}
