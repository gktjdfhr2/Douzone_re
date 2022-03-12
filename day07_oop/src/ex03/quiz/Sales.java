package ex03.quiz;

public class Sales extends Regular {
	
	private int incentive;
	
	public Sales() {
		super();
		System.out.print("인센티브 입력(@@%):");
		incentive = sc.nextInt();
		pay *= (double)(1+(double)incentive/(double)100);
	}

	@Override
	public String toString() {
		return "[ name=" + name + ", rank=" + rank + ", part=" + part + ", number=" + number + ", pay=" + pay +", incentive=" + incentive + "]";
	}

	
	
}
