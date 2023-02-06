package practice0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ex1076 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		List<String> list = List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
		// for 문으로 입력값과 list의 인덱스 비교, 그 i 값 가지기
		for (int j = 0; j < 3; j++) {
			String input = br.readLine();
			for (int i = 0; i < list.size(); i++) {
				if(input.equals(list.get(i))) {
					sb.append(i);
				}
			}
		}
		int one = sb.charAt(0) - '0';
		int two = sb.charAt(1) - '0';
		int three = sb.charAt(2) - '0';
		System.out.println((long)((one * 10 + two)* Math.pow(10, three)));
	}
}
