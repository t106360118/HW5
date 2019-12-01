package pa;

public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] test;
			test=new int[5];
			System.out.println("將值指定為[10]");
			
			test[10]=80;
			System.out.println("將80指定給test[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的範圍了");
			System.out.println("發生了"+e+"這個例外]");
		}
		finally
		{
			System.out.println("最後一定會執行這個處理");
		}
		System.out.println("順利地執行完畢");
	}

}
