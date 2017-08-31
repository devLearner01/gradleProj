package patternRefactoring;

import java.util.Date;
import java.util.logging.Logger;

/**
 * Most, if not all, of the exercises written here originate from the book:
 * Refactoring to Patterns, by Joshua Kerievsky published by Addison Wesley in August 2004
 *
 */
public class PatternRefactoringExercises {
	
	private final static Logger log = Logger.getLogger( PatternRefactoringExercises.class.getName() );

	/**	 
	 * You have Constructors that contain duplicate code.
	 * Chain the constructors together to obtain the least duplicate code.
	 * 
	 * Note: the resolution is actually in Loan.java
	 */
	public boolean chainConstructors() {
		
		Loan chainConstructors1 = new Loan( "", (float)1.1, (float)2.2, 3, new Date(), null );
		Loan chainConstructors2 = new Loan( "", (float)1.1, (float)2.2, 3, new Date(), new Date() );
		Loan chainConstructors3 = new Loan( "capitalStrategy", (float)1.1, (float)2.2, 3, new Date(),new Date() );
		
		log.info( "passed Loan constructors");
		
		return  chainConstructors1 != null 
				&& chainConstructors1 != null
				&& chainConstructors1 != null;
	}

	
	
	
}
