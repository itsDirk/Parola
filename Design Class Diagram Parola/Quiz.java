package Design Class Diagram Parola;

public class Quiz {

	private int startTijd;

	private int eindTijd;

	private int aantalKeerGespeeld;

	private String woord;

	private ArrayList<Vraag> vragen;

	private int correctBeantwoorddeVragen;

	private char[] verzameldeLetters;

	private int quizPrijs;

	private ScoreTelling scoreTelling;

	private Vraag[] vraag;

	public void resetQuiz() {

	}

	public int getQuizPrijs() {
		return 0;
	}

	public int berekenScore(ScoreTelling scoreTelling) {
		return 0;
	}

	public String getStelling(int index) {
		return null;
	}

	public String beantwoordVraag(String antwoord, int index) {
		return null;
	}

	public char[] getAvailableLetters() {
		return null;
	}

	public boolean valideerWoord(String woord) {
		return false;
	}

	public void startTijd() {

	}

	public void stopTijd() {

	}

}
