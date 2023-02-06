package practice0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int n = Integer.parseInt(reader.readLine());
			int[] arr = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(reader.readLine());
			}
			for (int i = 0; i < arr.length; i++) {
				int c = arr[i];
				for (int j = 2; j <= c-1; j++) {
					if (c % j == 0) {
						break;
					} else {
						count++;
						break;
					}
				}
			} 
			reader.close();
			System.out.println(count);
			
		} catch(Exception e) {
	
		}
	}
}
