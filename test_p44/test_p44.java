package pa;

public class test_p44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car44 car1 = new Car44("1̖܇");
		car1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("�����M��main()��̎����");
		}
	}

}
class Car44 extends Thread
{
	private String name;
	public Car44(String nm)
	{
		name=nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("�����M��"+name+"��̎����");
		}
	}
}