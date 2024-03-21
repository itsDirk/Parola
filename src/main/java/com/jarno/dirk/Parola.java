package com.jarno.dirk;

import java.util.ArrayList;
import java.util.Scanner;

public class Parola {

    private Scanner scanner;

    private ArrayList<Quiz> quizzen;

    private Speler speler;

    public Parola() {
//        this.scanner = new Scanner(System.in);
//        this.quizzen = new ArrayList<>();
//        this.quiz = new Quiz[5];
        this.speler = new Speler("Parolaspeler123", "Parola123", 1000);
        this.scanner = new Scanner(System.in);
    }

    public void speelQuiz() {
        System.out.println("Welkom bij Parola! Druk op enter om automatisch een quiz te selecteren...");
        this.scanner.nextLine();

        Quiz q = this.kiesQuiz();
        int aantalCredits = speler.getCredits();
        int quizPrijs = q.getQuizPrijs();
        boolean spelerHeeftGenoegCredits = spelerHeeftGenoegCredits(aantalCredits, quizPrijs);

        if (spelerHeeftGenoegCredits) {
            this.geefStartSchermWeer(aantalCredits, quizPrijs);
            this.vormWoord();
            this.scoreWeergeven();
            this.naarVolgendeVraag();
            this.beantwoordVraag();
            this.haalLettersOp();
        } else {
            this.geefNietGenoegCreditsWeer(aantalCredits, quizPrijs);
        }

    }

    private Quiz kiesQuiz() {
        return null;
    }

    private boolean spelerHeeftGenoegCredits(int credits, int quizPrijs) {
        return false;
    }

    private void geefStartSchermWeer(int aantalCredits, int quizPrijs) {

    }

    private void geefNietGenoegCreditsWeer(int aantalCredits, int quizPrijs) {

    }

    private void vormWoord() {

    }

    private void scoreWeergeven() {

    }

    private void naarVolgendeVraag() {

    }

    private void beantwoordVraag() {

    }

    private void haalLettersOp() {

    }

}
