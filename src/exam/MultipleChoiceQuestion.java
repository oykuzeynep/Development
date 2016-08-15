package exam;

public abstract class MultipleChoiceQuestion extends Question {

	private String[] choices;

	public MultipleChoiceQuestion(String questionText, double points, String[] choices) {
		super(questionText, points);
		this.choices = choices;
	}
	
	public abstract boolean isAnsweredCompletelyCorrectly();
}
