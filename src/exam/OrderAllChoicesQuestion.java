package exam;

public class OrderAllChoicesQuestion extends MultipleChoiceQuestion implements PartialCreditGiveable{

	public OrderAllChoicesQuestion(String questionText, double points, String[] choices) {
		super(questionText, points, choices);
		// TODO Auto-generated constructor stub
	}

	private int[] correctOrdering;
	private int[] studentsOrdering;
	
	@Override
	public double getPartialCredit() {
		int cre = 0;
		for (int i = 0; i < studentsOrdering.length; i++) {
			if (studentsOrdering[i] == correctOrdering[i])
				cre++;
		}
			
		return cre/studentsOrdering.length*this.getPoints();
	}
	@Override
	public boolean isAnsweredCompletelyCorrectly() {
		int i = 0;
		while(correctOrdering[i] == studentsOrdering[i] && i < studentsOrdering.length) {
			i++;
		}
		if(i == studentsOrdering.length)
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
