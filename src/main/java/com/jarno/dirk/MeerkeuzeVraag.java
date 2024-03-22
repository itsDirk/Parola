package com.jarno.dirk;

import java.util.ArrayList;
import java.util.Collections;

public class MeerkeuzeVraag implements IVraag {

    private String stelling;
    private char letter;
    private Thema thema;
    private GoedAntwoordMKVraag correctAntwoord;
    private ArrayList<FoutAntwoordMKVraag> fouteAntwoorden;

    MeerkeuzeVraag(String stelling, char letter, GoedAntwoordMKVraag correctAntwoord, ArrayList<FoutAntwoordMKVraag> fouteAntwoorden, Thema thema) {
        this.stelling = stelling;
        this.letter = letter;
        this.correctAntwoord = correctAntwoord;
        this.fouteAntwoorden = fouteAntwoorden;
        this.thema = thema;
    }

    public boolean valideerAntwoord(String antwoord) {
        return antwoord.toLowerCase().equals(correctAntwoord.getAntwoord().toLowerCase());
    }


    public String getStelling() {
        var stelling = "Deze vraag is van thema: " + thema.getThema() + "\n" + this.stelling + " (Typ het antwoord over)";

        ArrayList<String> alleAntwoorden = new ArrayList<>();
        alleAntwoorden.add(correctAntwoord.getAntwoord());
        for (var foutAntwoord : fouteAntwoorden) {
            alleAntwoorden.add(foutAntwoord.getAntwoord());
        }

        Collections.shuffle(alleAntwoorden);

        for (int i = 0; i < alleAntwoorden.size(); i++) {
            stelling = stelling.concat("\n" + (i + 1) + ": " + alleAntwoorden.get(i));
        }
        return stelling;
    }


    public String getCorrectAntwoord() {
        return correctAntwoord.getAntwoord();
    }

    public char getLetter() {
        return letter;
    }

}
