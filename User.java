
public class User {
	private String email;
	
	public User( String email ) {
		setEmail( email );
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
} // end of class User
