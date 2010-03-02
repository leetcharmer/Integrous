import java.util.Date;


public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Main Method
		Log item = new Log(new Date( 2010, 2, 1, 20, 49, 0), "Build: int.egro.us",
				"I want to build an application to track one's integrity (also known " +
				"as the ability to do what they say they will do.)");
		
		System.out.println( item.getSubmitDate() + " : " + item.getSummary() );
		System.out.println( item.getDetails() );
	}
} // end of class Main