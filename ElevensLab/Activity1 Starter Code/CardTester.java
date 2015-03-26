/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("1", "Hearts", 3);
		Card card2 = new Card("2", "Clubs", 4);
		Card card3 = new Card("1", "Hearts", 3);
		
		System.out.println(card1.toString());
		
	}
}
