import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static ArrayList< Log > logItems = new ArrayList< Log >();
	private static int exit;
	
	/** main: Implementation of User / Log objects:
	 *  1. Ask for Log-In
	 *  2. Create new User
	 *  3. Menu Selection
	 *  	[1. Add Integrity Log]
	 *  	[-1 to Exit]
 *  		3a. Validate Selection */
	public static void main( String[] args ) {
		// Ask for login address
		String login = input( "Login E-mail (Hit <ENTER> to Exit): " );
		
		// make sure a valid login is entered
		if ( !login.equals( "" ) ) {
			User user = new User( login );
			
			try {
				exit = Integer.parseInt( input( "1. Add Log\n2. Read Logs\n[-1 to Exit]\nChoose: " ) );
			} catch( NumberFormatException ex ) { exit = 0;	}
			
			while( exit != -1 ) {
				switch( exit ) {
					case 1 :
						Log item = new Log();
						item.setUser( user );
						item.setSummary( input( "Enter Summary: " ) );
						item.setDetails( input( "Enter Details: " ) );
						
						logItems.add( item );
						break;
					case 2: 
						for( int index = 0; index < logItems.size(); index++ )
							System.out.println( logItems.get( index ) );
						break;
					default : System.out.println( "Invalid Option" );
				} // end of switch
				
				try {
					exit = Integer.parseInt(input( "1. Add Log\n2. Read Logs\n[-1 to Exit]\nChoose: " ) );
				} catch( NumberFormatException e ) { exit = 0; } // end of try / catch
			} // end of while
			
			System.out.println( "GoodBye" );
		} else { System.out.println( "GoodBye" ); } // end of if / else
	}
	
	/** input: Grab a line of input from the command line */
	public static String input( String prompt ) {
		System.out.print( prompt );
		String input = null;
		try {
			input =  new BufferedReader( new InputStreamReader( System.in ) ).readLine().toString();
		} catch (IOException e) {
			e.printStackTrace();
			input = null;
		}
		return input;
	}
} // end of class Main