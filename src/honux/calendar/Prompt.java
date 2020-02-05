package honux.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}

	public int parseDay(String week) {
		switch (week) {
		case "SU":
			return 0;
		case "MO":
			return 1;
		case "TU":
			return 2;
		case "WE":
			return 3;
		case "TH":
			return 4;
		case "FR":
			return 5;
		case "SA":
			return 6;
		default:
			return 0;
		}

	}

	public void runPrompt() throws ParseException {
		printMenu();

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		boolean isloop = true;
		while (isloop) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = sc.next();
			switch (cmd) {
			case "1":
				cmdRegister(sc, cal);
				break;
			case "2":
				cmdSearch(sc, cal);
				break;
			case "3":
				cmdCal(sc, cal);
				break;

			case "f":
				printMenu();
				break;
			case "q":
				isloop = false;
				break;
			}
		}

		System.out.println("Thanks. End.");
		sc.close();

	}

	private void cmdCal(Scanner s, Calendar c) {
		int month = 1;
		int year = 2019;
		System.out.println("년도를 입력하세요.");
		System.out.println("YEAR>>");
		year = s.nextInt();

		System.out.println("달을 입력하세요.");
		System.out.println("MONTH>>");
		month = s.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력.");
			return;// 메소드 종료
		}
		c.printCalendar(year, month);
	}

	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("{일정검색}");
		System.out.println("날짜 입력 (yyyy-MM-dd).");
		String date = s.next();
		PlanIteam plan;
		plan = c.searchPlan(date);
		if (plan != null) {
			System.out.println(plan.detail);
		} else {
			System.out.println("일정이 없음.");
		}

	}

	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("{새 일정 등록}");
		System.out.println("날짜 입력 (yyyy-MM-dd).");
		String date = s.next();
		String text = " ";
		System.out.println("일정 입력(문자 끝에 ;을 입력해주세요.)");
		String word;
		while (!(word = s.next()).endsWith(";")) {
			text += word + "  ";
		}
		word = word.replace(";", "");
		text += word;
		c.registerPlan(date, text);

	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
