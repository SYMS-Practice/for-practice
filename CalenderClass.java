import java.util.Calendar;
public class CalenderClass {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2017, 0, 7, 15, 40);
		System.out.println("current time:\t" + c.getTime());
		
		long day = c.getTimeInMillis();
		day += 1000 * 60 * 60;
		c.setTimeInMillis(day);
		
		System.out.printf("new time:\t%02d:%02d:%02d\n",
		c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
		
		c.add(Calendar.DATE, 35);
		System.out.println("add 35 days:\t" + c.getTime());
		
		c.roll(Calendar.DATE, 35);
		System.out.println("roll 35 days:\t" + c.getTime());
		
		c.set(Calendar.DATE, 1);
		System.out.println("set to 1:\t" + c.getTime());
	}
}
