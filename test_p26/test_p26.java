package pa;

public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] test;
			test=new int[5];
			System.out.println("��ֵָ����[10]");
			
			test[10]=80;
			System.out.println("��80ָ���otest[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���^��еĹ�����");
			System.out.println("�l����"+e+"�@������]");
		}
		finally
		{
			System.out.println("����һ���������@��̎��");
		}
		System.out.println("����؈����ꮅ");
	}

}
