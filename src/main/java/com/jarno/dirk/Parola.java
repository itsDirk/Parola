package com.jarno.dirk;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Parola {

    private Scanner scanner;

    private ArrayList<Quiz> quizzen;

    private Speler speler;

    public Parola(ArrayList<Quiz> quizzen, Speler speler) {
        this.quizzen = quizzen;
//        this.quiz = new Quiz[5];
        this.speler = speler;
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
            speler.lowerCredits(quizPrijs);
            aantalCredits = speler.getCredits();
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
        Random random = new Random();
        int index = random.nextInt(quizzen.size());
        return quizzen.get(index);
    }

    private boolean spelerHeeftGenoegCredits(int credits, int quizPrijs) {
        return credits >= quizPrijs;
    }

    private void geefStartSchermWeer(int aantalCredits, int quizPrijs) {
        System.out.println("Betaalde " + quizPrijs + " credits voor de quiz. Je hebt nog " + aantalCredits + " credits over.");
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
