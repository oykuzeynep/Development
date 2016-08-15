package exam;

public class PickOneChoiceQuestion extends MultipleChoiceQuestion{

	public PickOneChoiceQuestion(String questionText, double points, String[] choices) {
		super(questionText, points, choices);
		// TODO Auto-generated constructor stub
	}

	private int choiceIndex;
	private int correctIndex;
	
	@Override
	public boolean isAnsweredCompletelyCorrectly() {

		if (choiceIndex == correctIndex)
			return true;
		return false;
	}
	
	@Override
	public double getGrade() {
		if (this.isAnsweredCompletelyCorrectly())
			return getPoints();
		return 0;
	}
	
	
}
