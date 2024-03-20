package com.jarno.dirk;

public interface IScoreTelling {
    int puntenPerCorrectAntwoord = 0;

    int puntenPerLetterInWoord = 0;

    int puntenSnelheidsBonus = 0;

    int berekenScore(int startTijd, int eindTijd, int correctBeantwoorddeVragen, String woord);
}
