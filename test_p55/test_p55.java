package pa;

public class test_p55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company1 cmp=new Company1();
		Driver1 drv1=new Driver1(cmp);
		drv1.start();
		Driver1 drv2 = new Driver1(cmp);
		drv2.start();
	}

}
class Company1
{
	private int sum =0;
	public synchronized void add(int a)
	{
		int tmp=sum;
		System.out.println("Ŀǰ�ĺ�Ӌ���~��"+tmp+"Ԫ");
		System.out.println("ٍ��"+a+"Ԫ");
		tmp=tmp+a;
		System.out.println("��Ӌ���~��"+tmp+"Ԫ");
		sum=tmp;
	}
}
class Driver1 extends Thread
{
	private Company1 comp;
	public Driver1 (Company1 c)
	{
		comp=c;
	}
	public void run() {
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
}
