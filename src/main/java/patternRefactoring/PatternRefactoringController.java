package patternRefactoring;

/**
 * This is a future controller for when the project logic becomes complex. Otherwise not needed.
 * 
 */
public class PatternRefactoringController {

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
		
		patternRefactoringEx.chainConstructors();
				
	}

}
