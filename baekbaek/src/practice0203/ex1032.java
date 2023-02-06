package practice0203;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 
		 * n값 받고 -> 그 값만큼 입력하게 해주기
		 * 받은 String문 하나하나 쪼개고 -> for문 돌려서 다른 부분이 있으면 ? 출
		 * 
		*/ 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		boolean isSame = true;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr[0].length(); i++) {
			char c = arr[0].charAt(i);
			isSame = true;
			for (int j = 1; j < n; j++) {
				if (c != arr[j].charAt(i)) {
					isSame = false;
					break;
				}
			}
			if(isSame == true) {
				sb.append(c);
			} else {
				sb.append('?');
			}	
		}
		
		System.out.println(sb.toString());
		
	}

}
