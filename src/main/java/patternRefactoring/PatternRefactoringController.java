package patternRefactoring;

import java.util.logging.Logger;

/**
 * This is a future controller for when the project logic becomes complex. Otherwise not needed.
 * 
 */
public class PatternRefactoringController {

	private final static Logger log = Logger.getLogger( PatternRefactoringController.class.getName() );
	
	private PatternRefactoringExercises patternRefactoringEx;
	
	/**
	 * Constructor
	 */
	public PatternRefactoringController() {
		
		this.patternRefactoringEx = new PatternRefactoringExercises();
	}
	
	/**
	 * In this method i'm calling the several pattern refactoring exercises
	 */
	public void execute() {
		
		log.info( "calling chainConstructors..." );
		patternRefactoringEx.chainConstructors();
		log.info( "passed chainConstructors" );
		
				
	}

}
