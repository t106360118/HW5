package pa;


public class test_p32 {

	public static void main(String[] args) throws CardException
	{
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setCar(1234,- 10.0);
		car1.show();
	}

}
class Car32 {
	private int num;
	private double gas;
	
	public Car32() {
		num=0;
		gas=0;
		System.out.println("�����a����܇");
	}
	public void setCar(int n,double g) throws CardException 
	{
		if (g<0) 
		{
		CardException e=new CardException();
		throw e;
		}
		else{
		num=n;
		gas=g;
		System.out.println("��܇̖�O��"+num+"�������O��"+gas);
		}
	}
	public void show() {
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
		
	}
}