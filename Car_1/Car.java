package pc;

public class Car {
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0;
		System.out.println("�����a����܇");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("��܇̖�O��"+num+"�������O��"+gas);
	}
	public void show() {
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
		
	}
}
