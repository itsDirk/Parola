package com.jarno.dirk;

public class ScoreTellingMetTijd implements IScoreTelling {

    private int puntenPerCorrectAntwoord;

    private int puntenPerLetterInWoord;

    private int puntenSnelheidsBonus;

    ScoreTellingMetTijd(int puntenPerCorrectAntwoord, int puntenPerLetterInWoord, int puntenSnelheidsBonus) {
        this.puntenPerCorrectAntwoord = puntenPerCorrectAntwoord;
        this.puntenPerLetterInWoord = puntenPerLetterInWoord;
        this.puntenSnelheidsBonus = puntenSnelheidsBonus;
    }

    public int berekenScore(int startTijd, int eindTijd, int correctBeantwoorddeVragen, String woord) {
        return puntenPerCorrectAntwoord * correctBeantwoorddeVragen + (puntenPerLetterInWoord * woord.length()) + getPuntenVanTijd(startTijd, eindTijd);
    }

    public int getPuntenVanTijd(int startTijd, int eindTijd) {
        return puntenSnelheidsBonus - (eindTijd - startTijd);
    }

}
