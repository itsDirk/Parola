package com.jarno.dirk;

import java.util.ArrayList;

public class MeerkeuzeVraag implements IVraag {

	private String stelling;

	private char letter;
	private GoedAntwoordMKVraag correctAntwoord;

	private ArrayList<FoutAntwoordMKVraag> fouteAntwoorden;

    MeerkeuzeVraag(GoedAntwoordMKVraag correctAntwoord,ArrayList<FoutAntwoordMKVraag> fouteAntwoorden){
        this.correctAntwoord = correctAntwoord;
        this.fouteAntwoorden = fouteAntwoorden;
    }

	public boolean valideerAntwoord(String antwoord) {
		return false;
	}

    //TODO stelling en vragen samenvoegen in een mooie string
	public String getStelling() {
		return stelling + correctAntwoord.getAntwoord() + fouteAntwoorden.stream().iterator().next().getAntwoord();
	}

	public String getCorrectAntwoord() {
		return correctAntwoord.getCorrectAntwoord() ;
	}


	/**
	 * @see Design Class Diagram Parola.Vraag#getLetter()
	 */
	public char getLetter() {
		return letter;
	}

}
