package pa;

public class test_p46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car46 car1 = new Car46("1̖܇");
		car1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("�����M��main()��̎����");
		}
	}

}
class Car46 extends Thread
{
	private String name;
	public Car46(String nm)
	{
		name=nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				sleep(1000);
				System.out.println("�����M��"+name+"��̎����");
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}