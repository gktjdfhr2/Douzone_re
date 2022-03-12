package practice;
class MySum extends Object{	//모든 클래스의 최상위 클래스
 int first;
 int second;
 
 MySum(int first, int second){
  this.first = first;
  this.second = second;
 }
 
 
 public String toString(){

  String result = String.valueOf(first + second);
  return result;
 }
 
 
 public boolean equals(Object obj){
	 String result1 = String.valueOf(this.first + this.second);
	 String result2 = String.valueOf(((MySum) obj).first + ((MySum) obj).second);
  if(obj instanceof MySum){
	  if(result1.equalsIgnoreCase(result2)) { return true; }
	  else return false;
  
  }
  else{
   return false;
  }
 }
 
}

public class SumTest {
	public static void main(String [] args) {
		int i = 10;
		int j = 20;
		
		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);
		
		System.out.println(ms1);
		
		if(ms1.equals(ms2))
			System.out.println("ms1과 ms2의 합계는 동일합니다.");
	}
}
