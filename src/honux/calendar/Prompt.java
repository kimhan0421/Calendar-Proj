package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>";

	public void runPrompt() {
		String PROMPT = "cal>";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 1;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(2020,month);
		}

		System.out.println("End");
		sc.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
