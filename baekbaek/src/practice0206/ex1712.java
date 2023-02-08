package practice0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		
		int a = Integer.parseInt(st.nextToken()); // 고정지출 
		int b = Integer.parseInt(st.nextToken()); // 가변비용
		int price = Integer.parseInt(st.nextToken()); // 판매가격
		int n = 1;
		while(true) {
			int minus = b + a * n;
			if(price > minus) {
				System.out.println(n);
				return;
			}
			n++;
		}
		
		
	}

}
