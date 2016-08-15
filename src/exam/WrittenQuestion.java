package exam;

public class WrittenQuestion extends Question implements PartialCreditGiveable{

	private String[] responseWords;
	private String[] correctAnswerWords;
	
	public WrittenQuestion(String questionText, String[] responseWords, String[] correctAnswerWords, double points) {
		super(questionText, points);
		this.responseWords = responseWords;
		this.correctAnswerWords = correctAnswerWords;
	}

	public String[] getResponseWords() {
		return responseWords;
	}

	public void setResponseWords(String[] responseWords) {
		this.responseWords = responseWords;
	}

	@Override
	public double getPartialCredit() {
		int cre1 = 0;
		for (String i: responseWords) {
			if (i.equals(correctAnswerWords))
				cre1++;
		}
		return cre1/responseWords.length*getPoints();
		
	}

	@Override
	public double getGrade() {
		if(responseWords.equals(correctAnswerWords))
			return getPoints();
		return 0;
	}
	
	
	
}
