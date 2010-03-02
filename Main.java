import java.text.SimpleDateFormat;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Main Method
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		User user = new User( "john@johnjelinek.com" );
		
		Log item = new Log( "Build: int.egro.us",
				"I want to build an application to track one's integrity (also known " +
				"as the ability to do what they say they will do.)", user);
		
		System.out.println( "+" + item.getUser().getEmail() + "+ " + dateFormat.format( item.getSubmitDate() ) + " : "
				+ item.getSummary() + "\n" + item.getDetails() );
	}
} // end of class Main