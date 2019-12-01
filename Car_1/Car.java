package pc;

public class Car {
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0;
		System.out.println("已生產了汽車");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		
	}
}
