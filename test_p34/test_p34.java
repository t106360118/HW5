package pa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test_p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ոݔ���ִ�");
		try {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println("��ݔ���ִ�"+str);
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("ݔ��ݔ�����`");
		}
	}

}
