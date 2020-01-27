package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);	
		
		System.out.printf("%d와 %d의 합은 %d 입니다.", a, b, a + b);
		sc.close();
		
	}

}
