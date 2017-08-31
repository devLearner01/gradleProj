package mainPackage;

import java.util.logging.Logger;

import patternRefactoring.PatternRefactoringController;

public class MyGradleMain {

	private final static Logger log = Logger.getLogger( MyGradleMain.class.getName()  );
	
	/**
	 * This main is used only to start each of the subprojects in this project.
	 * @param args
	 */
	public static void main(String[] args) {

		PatternRefactoringController patternRefactoringController = new PatternRefactoringController();
		patternRefactoringController.execute();
		
		log.info( "exiting main..." );
	}

}
