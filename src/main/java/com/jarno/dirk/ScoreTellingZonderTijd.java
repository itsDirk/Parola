package com.jarno.dirk;

public class ScoreTellingZonderTijd implements IScoreTelling {

	private int puntenPerCorrectAntwoord;

	private int puntenPerLetterInWoord;

	private int puntenSnelheidsBonus;

    ScoreTellingZonderTijd(int puntenPerCorrectAntwoord,int puntenPerLetterInWoord , int puntenSnelheidsBonus){
        this.puntenPerCorrectAntwoord = puntenPerCorrectAntwoord;
        this.puntenPerLetterInWoord = puntenPerLetterInWoord;
        this.puntenSnelheidsBonus = puntenSnelheidsBonus;
    }

	public int berekenScore(int startTijd, int eindTijd, int correctBeantwoorddeVragen, String woord) {
		return puntenPerCorrectAntwoord * correctBeantwoorddeVragen + (puntenPerLetterInWoord * woord.length());

	}

}
