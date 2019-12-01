package pa;

public class test_p48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car44 car1 = new Car44("1號車");
		car1.start();
		try {
			car1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("正在進行main()的處理工作");
	}

}
