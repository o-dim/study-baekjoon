package practice_0127;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Writer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		try {
			int N = Integer.parseInt(br.readLine());
			List<String> list = new ArrayList<String>();
			
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				list.add(str);
			}
			
			String V = br.readLine();
			int count = 0;
			
			for (int j = 0; j < N; j++) {
				if(list.get(j).equals(V)) {
					count++;
				}
			}
			System.out.println(count);
			br.close();
			
		} catch(NullPointerException E) {
			E.printStackTrace();
		}
		
	}

}
