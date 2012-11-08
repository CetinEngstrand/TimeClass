package time;

public class Time {
	private int hour;
	private int minutes;
	private int seconds;

	public Time() {
		// TODO Auto-generated constructor stub
		
		hour = 12;
		minutes = 00;
		seconds = 00;
	}
	
	public void setTime(int h, int m, int s){
		if(h>=0
		&& h<=24){
			hour = h;
		}
		
		if(m>=0
		&& m<60){
			minutes = m;
		}
		
		if(s>=0
		&& s<60){
			seconds = s;
		}
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minutes, seconds);
	}
}
