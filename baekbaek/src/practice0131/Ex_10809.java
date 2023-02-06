package practice0131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		String str = br.readLine();		
		for(char c = 'a' ; c <= 'z' ; c++) {
			System.out.print(str.indexOf(c) + " ");
		}
	}
}
