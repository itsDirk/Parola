package Design Class Diagram Parola;

public interface Vraag {

	private String stelling;

	private char letter;

	private Thema thema;

	private Thema thema;

	public boolean valideerAntwoord(String antwoord);

	public abstract char getLetter();

	public abstract String getStelling();

	public abstract String getCorrectAntwoord();

}
