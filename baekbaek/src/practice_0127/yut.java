package practice_0127;

public class yut {

	public static void main(String[] args) {
		// 문제3. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
		// 예시)
		// "도", 1칸 이동한다.
		// "개", 2칸 이동한다.
		// "걸", 3칸 이동한다.
		// "윷", "도", 5칸 이동한다.
		// "모", "윷", "도", 10칸 이동한다.
		boolean run = true;
		String[] yut = {"", "도", "개", "걸", "윷", "모"};
		int move = 0;
		while(run) {
			int num = (int)(Math.random() * 5 + 1);
			switch(num) {
			case 1: case 2: case 3:
				move += num;
				System.out.println("\"" + yut[num] + "\", " + move + "칸 이동한다.");
				run = false;
				break;
			case 4: case 5:
				move += num;
				System.out.println("\"" + yut[num] + "\", ");
				break;
			}
		}
	}

}
