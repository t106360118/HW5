package pa;

public class test_p48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car44 car1 = new Car44("1̖܇");
		car1.start();
		try {
			car1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("�����M��main()��̎����");
	}

}
