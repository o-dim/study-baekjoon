package practice0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1037 {

	public static void main(String[] args) throws IOException {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine());
	
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	StringTokenizer st = new StringTokenizer(br.readLine()," ");

	while (n-- > 0) {
		int k = Integer.parseInt(st.nextToken());
		max = k > max ? k : max;
		min = k < min ? k : min;
	}
	System.out.println(max * min);
	}
}


