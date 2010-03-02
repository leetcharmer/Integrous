import java.util.Date;

/**
 * Log.java: Integrous Log Entity
 */

/**
 * @author John Jelinek IV
 *
 */
public class Log {
	private Date submitDate = new Date();
	private String summary, details;

	public Log(Date submitDate, String summary, String details) {
		// Assign values to Log object
		this.submitDate = submitDate;
		this.summary = summary;
		this.details = details;
	} // Non-Default Constructor
	

	/**
	 * @param submitDate the submitDate to set
	 */
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	/**
	 * @return the submitDate
	 */
	public Date getSubmitDate() {
		return submitDate;
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
