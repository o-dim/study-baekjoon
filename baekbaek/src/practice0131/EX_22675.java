package practice0131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_22675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read();
		String str = br.readLine();
		int r = br.read();
		
		for(int i = 0; i < n; i++) {
			String[] a = str.split(" ");
			for (int j = 0; j < n; j++) {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	
}
