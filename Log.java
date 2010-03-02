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
	
	public Log() {
		this( null, null );
	} // Default Constructor

	public Log(String summary, String details) {
		// Assign values to Log object
		this.submitDate = Calendar.getInstance( TimeZone.getDefault() );
		setSummary( summary );
		setDetails( details );
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
} // end of class Log
