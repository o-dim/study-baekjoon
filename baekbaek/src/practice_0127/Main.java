package practice_0127;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			list.add(input);
		}
		int V = sc.nextInt();
		int count = 0;
		for (int j = 0; j < N; j++) {
			if (list.get(j) == V) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
