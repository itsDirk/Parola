package Design Class Diagram Parola;

public class MeerkeuzeVraag implements Vraag {

	private String stelling;

	private char letter;

	private GoedAntwoordMKVraag correctAntwoord;

	private ArrayList<FoutAntwoordMKVraag> fouteAntwoorden;

	private GoedAntwoordMKVraag goedAntwoordMKVraag;

	private FoutAntwoordMKVraag[] foutAntwoordMKVraag;

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
