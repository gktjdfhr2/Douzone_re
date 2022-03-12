package ex03.Interface;

public class MainEntry {
	int x = 9;
	
	interface A {
		public abstract void disp();
	}
	
	interface B {
		void bView();
	}
	
	interface C {
		public void draw();
	}
	interface D extends B{
		void dView();
	}
	class Multi implements B,C,A {

		@Override
		public void disp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void bView() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}


