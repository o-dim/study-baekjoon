package practice0131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_11720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		int n = in.read();
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(in.readLine().split(" ")[i]);
			total += num;
		}
		in.close();
		System.out.println(total);
		
		/* Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); //다른거면 공백으로 잘라주기
			total += num;
		}
		System.out.println(total);
		
		*/
		
		
	}

}
