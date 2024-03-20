package com.jarno.dirk;

import java.util.ArrayList;

public class MeerkeuzeVraag implements IVraag {

	private String stelling;

	private char letter;

	private GoedAntwoordMKVraag correctAntwoord;

	private ArrayList<FoutAntwoordMKVraag> fouteAntwoorden;

	private GoedAntwoordMKVraag goedAntwoordMKVraag;

	private FoutAntwoordMKVraag[] foutAntwoordMKVraag;

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
