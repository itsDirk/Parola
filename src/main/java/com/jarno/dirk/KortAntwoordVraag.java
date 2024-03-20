package com.jarno.dirk;

import java.util.ArrayList;

public class KortAntwoordVraag implements IVraag {

	private String stelling;

	private char letter;

	private ArrayList<GoedAntwoordKAVraag> correcteAntwoorden;

	private GoedAntwoordKAVraag[] goedAntwoordKAVraag;

	public boolean valideerAntwoord(String antwoord) {
		return false;
	}

	public String getStelling() {
		return null;
	}

	public String getCorrectAntwoord() {
		return null;
	}


	/**
	 * @see Design Class Diagram Parola.Vraag#getLetter()
	 */
	public char getLetter() {
		return 0;
	}

}
