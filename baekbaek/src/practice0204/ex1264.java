package practice0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1264 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] monu = {'a', 'e', 'i', 'o', 'u'};
		int count = 0;
		while(true) {
			String input = reader.readLine().toLowerCase();
			if(input.equals("#")) {
				break;
			}
			for (int i = 0; i < input.length(); i++) {
				for (int j = 0; j < monu.length; j++) {
					if (input.charAt(i) == monu[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
		reader.close();
	}

}
