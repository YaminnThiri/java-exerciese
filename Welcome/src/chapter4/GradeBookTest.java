package chapter4;

public class GradeBookTest {

	public static void main(String[] args) {
		
		GradeBook myGradeBook=new GradeBook(
				"Cs101 introduction to java programming");
		myGradeBook.displayMessage();
		myGradeBook.determineClassAverage();
}

}
