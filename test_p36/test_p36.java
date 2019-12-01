package pa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test_p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new FileReader("test.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println("寫入到檔案中的兩個字是");
			System.out.println(str1);
			System.out.println(str2);
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("輸出入錯誤");
		}
	}

}
