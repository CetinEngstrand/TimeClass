package time;

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time myTime = new Time();
		
		myTime.setTime(9, 35, 3);
		
		System.out.println(myTime.toMilitary());
	}

}
