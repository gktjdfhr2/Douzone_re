package ex02.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("length  /  capacitry");
		int len = sb.length(); int size = sb.capacity();
		System.out.println(len + "  /  " + size);
		
		sb.append("happyvirus");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + "  /  "+ sb.capacity());
		
		sb.append("12345 67890");
		System.out.println(sb.length() + " "
				+ " /  " + sb.capacity());
		
		sb.append("asdfasd sadfasd  67890");
		System.out.println(sb.length() + "  /  " + sb.capacity());
		
		System.out.println(sb);
		sb.trimToSize();
		
		System.out.println(sb.length() + "  /  " + sb.capacity());
	}
}
