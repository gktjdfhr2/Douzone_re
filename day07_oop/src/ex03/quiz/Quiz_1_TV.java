package ex03.quiz;

class TV {
	String color;
	private int channel,sound;
	
	public TV() {
		// TODO Auto-generated constructor stub
		this.channel = 7;
		this.sound = 50;
		this.color = null;
	}
	public TV(String color) {
		// TODO Auto-generated constructor stub
		this.channel = 7;
		this.sound = 50;
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public int getSound() {
		return sound;
	}
	public String getColor() {
		return color;
	}	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setSound(int sound) {
		this.sound = sound;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", sound=" + sound + ", color=" + color + "]";
	}
	
	
	
}
public class Quiz_1_TV {	
	
	public static void main(String[] args) {
		
		System.out.print("빨간색");
		TV rtv = new TV("red");
		System.out.println(rtv);
		
		System.out.print("파란색");
		TV btv = new TV("blue");
		System.out.println(btv);
		
		System.out.print("빨간색TV 채널 변경");
		rtv.setChannel(50);
		System.out.println(rtv);
		
		System.out.print("파란색TV 소리 변경");
		btv.setSound(24);
		System.out.println(btv);
	}

}
