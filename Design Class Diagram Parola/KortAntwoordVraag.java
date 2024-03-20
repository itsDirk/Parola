package Design Class Diagram Parola;

public class KortAntwoordVraag implements Vraag {

	private String stelling;

	private char letter;

	private ArrayList<GoedAntwoordKAVraag> correcteAntwoorden;

	private GoedAntwoordKAVraag[] goedAntwoordKAVraag;

	public boolean valideerAntwoord(String antwoord) {
		return false;
	}

	public abstract String getStelling();

	public abstract String getCorrectAntwoord();


	/**
	 * @see Design Class Diagram Parola.Vraag#getLetter()
	 */
	public char getLetter() {
		return 0;
	}

}
