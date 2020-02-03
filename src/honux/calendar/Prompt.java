package honux.calendar;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String week) {
		if (week.equals("SU")) {
			return 0;
		} else if (week.equals("MO")) {
			return 1;
		} else if (week.equals("TU")) {
			return 2;
		} else if (week.equals("WE")) {
			return 3;
		} else if (week.equals("TH")) {
			return 4;
		} else if (week.equals("FR")) {
			return 5;
		} else if (week.equals("SA")) {
			return 6;
		} else {
			return 0;
		}

	}

	public void runPrompt() {

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 1;
		int year = 2019;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.println("YEAR>>");
			year = sc.nextInt();
			if(year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.println("MONTH>>");
			month = sc.nextInt();
			System.out.println("첫째날 요일을 입력하세요(SU, MO, TU, WD, TH, FR, SA).");
			String week = sc.next();
			weekday = parseDay(week);

			if (month > 12 || month <1) {
				System.out.println("잘못된 입력.");
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}

		System.out.println("End");
		sc.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
