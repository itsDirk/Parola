package com.jarno.dirk;

public interface IVraag {

	String stelling = null;

	char letter = 'A';

	Thema thema = null;

	public boolean valideerAntwoord(String antwoord);

	public char getLetter();

	public String getStelling();

	public String getCorrectAntwoord();

}
