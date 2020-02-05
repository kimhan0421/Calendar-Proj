package honux.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanIteam {
	public Date planDate;
	public String detail;
	public String peolpe = "";
	
	public static Date getDatefromString(String strDate) {
		Date date = null;
		try {
			Date n_date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public PlanIteam(String date, String detail) {
		this.planDate = getDatefromString(date);
		this.detail = detail;
	}

	public Date getDate() {
		return planDate;
	}
	public void addPeople(String name) {
		peolpe += name + ", ";

	}

}
