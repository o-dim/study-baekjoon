package practice0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int e = Integer.parseInt(reader.readLine());
		int m = (n / 100) * 100;
		while(true) {
			if ((m % e)==0) {
				int result = m % 100;
				if(result < 10) {
					System.out.println("0" + result);
				} else System.out.println(result);
				return;
			} 
			m++;
		}
	}

}
