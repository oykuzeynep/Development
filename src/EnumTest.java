
public class EnumTest {

	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch(day) {
		case MONDAY:
		    System.out.println("Pazartesi iğrenç.");
		    break;
		case FRIDAY:
		    System.out.println("I'm in love.");
		    break;
		case SATURDAY: case SUNDAY:
			System.out.println("Haftasonları <3 Biz");
			break;
		default:
			System.out.println("Haftasonunu bekliyoruz :(");
			break;
		}
		
	}
	
	public static void main(String args[]) {
		EnumTest firstDay = new EnumTest(Day.FRIDAY);
		firstDay.tellItLikeItIs();
	}
}
