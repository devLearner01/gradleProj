package mainPackage;

import patternRefactoring.PatternRefactoringController;

public class MyGradleMain {

	/**
	 * This main is used only to start each of the subprojects in this project.
	 * @param args
	 */
	public static void main(String[] args) {

		PatternRefactoringController patternRefactoringController = new PatternRefactoringController();
		patternRefactoringController.execute();
		
		
	}

}
