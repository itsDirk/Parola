package com.jarno.dirk;

import java.util.ArrayList;

public class Quiz {

    private int startTijd;

    private int eindTijd;

    private int aantalKeerGespeeld;

    private String woord;

    private ArrayList<IVraag> vragen;

    private int correctBeantwoorddeVragen;

    private ArrayList<Character> verzameldeLetters;

    private int quizPrijs;

    private IScoreTelling scoreTelling;

    Quiz(ArrayList<IVraag> vragen, int quizPrijs) {
        startTijd = 0;
        eindTijd = 0;
        aantalKeerGespeeld = 0;
        this.vragen = vragen;
        correctBeantwoorddeVragen = 0;
        verzameldeLetters = new ArrayList<>();
        this.quizPrijs = quizPrijs;

    }

    public void resetQuiz() {
        this.startTijd = 0;
        this.eindTijd = 0;
        this.verzameldeLetters.clear();
        this.woord = "";
        this.correctBeantwoorddeVragen = 0;
    }

    public int getQuizPrijs() {
        return this.quizPrijs;
    }

    public int getAantalKeerGespeeld() {
        return this.aantalKeerGespeeld;
    }

    public int berekenScore(IScoreTelling scoreTelling) {
        this.aantalKeerGespeeld++;
        return scoreTelling.berekenScore(this.startTijd, this.eindTijd, this.correctBeantwoorddeVragen, this.woord);
    }

    public String getStelling(int index) {
        return vragen.get(index).getStelling();
    }

    public String beantwoordVraag(String antwoord, int index) {
        var vraag = vragen.get(index);
        var isCorrect = vraag.valideerAntwoord(antwoord);
        ;
        String response = "U heeft het antwoord ";
        if (isCorrect) {
            var letter = vraag.getLetter();
            verzameldeLetters.add(letter);
            response = response.concat("Goed \n" + "U heeft deze letter verdiend: " + letter);
        } else {
            response = response.concat("Fout \n" + "Het goede antwoord is: " + vraag.getCorrectAntwoord());
        }
        return response;
    }

    public ArrayList<Character> getVerzameldeLetters() {
        return this.verzameldeLetters;
    }

    public boolean valideerWoord(String woord) {
        woord = woord.toUpperCase();

        ArrayList<Character> verzameldeLettersClone = new ArrayList<>(verzameldeLetters);
        for (int i = 0; i < woord.length(); i++) {
            Character letter = woord.charAt(i);
            if (verzameldeLettersClone.contains(letter)) {
                verzameldeLettersClone.remove(Character.valueOf(letter));
            } else {
                return false;
            }
        }
        this.woord = woord;
        return true;
    }


    public void startTijd() {
        this.startTijd = Math.toIntExact(System.currentTimeMillis() / 1000);
    }

    public void stopTijd() {
        this.eindTijd = Math.toIntExact(System.currentTimeMillis() / 1000);
    }

}
