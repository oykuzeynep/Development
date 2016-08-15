package lghlgh;

public class DiceTest {
	public static void main(String args[]) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		for (int i = 0; i < 3; i++) {
			dice1.roll();
			dice2.roll();
			System.out.println("Dice 1: " + dice1.getFaceValue() + " Dice 2: " + dice2.getFaceValue());

			
			if(dice1.getFaceValue() > dice2.getFaceValue())
				System.out.println("Player 1 wins!");
			else if (dice1.getFaceValue() == dice2.getFaceValue())
				System.out.println("Both players wins!");
			else
				System.out.println("Player 2 wins!");

		}

		
	}

}
