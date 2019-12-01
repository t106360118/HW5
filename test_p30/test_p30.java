package pa;

public class test_p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		try {
			car1.setCar(1234,- 10.0);
		}
		catch(CardException e) {
			System.out.println("’³ö"+e+"ÁË");
		}
		car1.show();
	}

}
