import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Log.java: Integrous Log Entity
 */

/**
 * @author John Jelinek IV
 *
 */
public class Log {
	private Calendar submitDate;
	private String summary, details;
	private User user;
	
	public Log() {
		this( null, null, new User( "email@example.com" ) );
	} // Default Constructor

	public Log(String summary, String details, User user) {
		// Assign values to Log object
		this.submitDate = Calendar.getInstance( TimeZone.getDefault() );
		setSummary( summary );
		setDetails( details );
		setUser( user );
	} // Non-Default Constructor

	/**
	 * @return the submitDate
	 */
	public Date getSubmitDate() {
		return submitDate.getTime();
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
} // end of class Log
