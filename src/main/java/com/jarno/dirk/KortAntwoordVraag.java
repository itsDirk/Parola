package com.jarno.dirk;

import java.util.ArrayList;

public class KortAntwoordVraag implements IVraag {

	private String stelling;
	private char letter;
	private ArrayList<GoedAntwoordKAVraag> correcteAntwoorden;
	private Thema thema;

    KortAntwoordVraag(String stelling, char letter, ArrayList<GoedAntwoordKAVraag> correcteAntwoorden, Thema thema){
		this.stelling = stelling;
		this.letter = letter;
        this.correcteAntwoorden = correcteAntwoorden;
		this.thema = thema;
    }

	public boolean valideerAntwoord(String antwoord) {
        for (GoedAntwoordKAVraag goedAntwoord : correcteAntwoorden) {
            if (goedAntwoord.getAntwoord().toLowerCase().equals(antwoord.toLowerCase())) {
                return true;
            }
        }
        return false;
	}

	public String getStelling() {
		return "Deze vraag is van thema: " + thema.getThema() + "\n" + stelling;
	}

	public String getCorrectAntwoord() {
		return correcteAntwoorden.get(0).getAntwoord();
	}

	public char getLetter() {
		return letter;
	}

}
