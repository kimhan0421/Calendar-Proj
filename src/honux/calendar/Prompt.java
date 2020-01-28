package honux.calendar;

import java.util.Scanner;

public class Prompt {
	//private final static String PROMPT = "cal>";

	public void runPrompt() {
		String PROMPT = "cal>";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = -1;
		int year = -1;
		
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.println("YEAR>>");
			year = sc.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.println("MONTH>>");
			System.out.print(PROMPT);
			month = sc.nextInt();
			
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year,month);
		}

		System.out.println("End");
		sc.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
