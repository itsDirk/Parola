package com.jarno.dirk;

import java.util.ArrayList;

public class KortAntwoordVraag implements IVraag {

	private String stelling;

	private char letter;

	private ArrayList<GoedAntwoordKAVraag> correcteAntwoorden;

    KortAntwoordVraag(ArrayList<GoedAntwoordKAVraag> correcteAntwoorden){
        this.correcteAntwoorden = correcteAntwoorden;

    }

	public boolean valideerAntwoord(String antwoord) {
        for (GoedAntwoordKAVraag goedAntwoord : correcteAntwoorden) {
            if (goedAntwoord.getAntwoord().equals(antwoord)) {
                return true;
            }
        }
        return false;
	}

	public String getStelling() {
		return stelling;
	}

	public String getCorrectAntwoord() {
		return correcteAntwoorden.toString();
	}

	public char getLetter() {
		return letter;
	}

}
