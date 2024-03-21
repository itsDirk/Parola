package com.jarno.dirk;

import java.util.ArrayList;

public class MeerkeuzeVraag implements IVraag {

	private String stelling;

	private char letter;
    private Thema thema;
    private GoedAntwoordMKVraag correctAntwoord;


    private ArrayList<FoutAntwoordMKVraag> fouteAntwoorden;

    MeerkeuzeVraag(GoedAntwoordMKVraag correctAntwoord,ArrayList<FoutAntwoordMKVraag> fouteAntwoorden, Thema thema){
        this.correctAntwoord = correctAntwoord;
        this.fouteAntwoorden = fouteAntwoorden;
        this.thema = thema;
    }

	public boolean valideerAntwoord(String antwoord) {
		return antwoord.equals(correctAntwoord.getAntwoord());
	}

	public String getStelling() {
		var stelling = "Deze vraag is van thema: " + thema.getThema() + "\n" +
                this.stelling + "\n 1" + correctAntwoord.getAntwoord();
        for (int i = 2; i<fouteAntwoorden.size()+2;i++){
            stelling.concat("\n" + i + " " + fouteAntwoorden.get(i).getAntwoord());
        }
    return stelling;
    }

	public String getCorrectAntwoord() {
		return correctAntwoord.getAntwoord() ;
	}

	public char getLetter() {
		return letter;
	}

}