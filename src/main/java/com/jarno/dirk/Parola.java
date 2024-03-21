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
        this.speler = speler;
        this.scanner = new Scanner(System.in);
    }

    public void speelQuiz() {
        System.out.println("Welkom bij Parola! Druk op enter om automatisch een quiz te selecteren...");
        scanner.nextLine();

        Quiz q = this.kiesQuiz();
        int aantalCredits = speler.getCredits();
        int quizPrijs = q.getQuizPrijs();
        boolean spelerHeeftGenoegCredits = spelerHeeftGenoegCredits(aantalCredits, quizPrijs);

        if (spelerHeeftGenoegCredits) {
            int huidigeVraag = 0;

            speler.lowerCredits(quizPrijs);
            aantalCredits = speler.getCredits();

            q.resetQuiz();
            q.startTijd();

            geefStartSchermWeer(aantalCredits, quizPrijs);

            while(huidigeVraag <= 8){
                naarVolgendeVraag(q, huidigeVraag);
                beantwoordVraag(q, huidigeVraag);


                huidigeVraag++;
            }



//            naarVolgendeVraag();
//            beantwoordVraag();
//
//            vormWoord();
//            scoreWeergeven();
//            haalLettersOp();
        } else {
            geefNietGenoegCreditsWeer(aantalCredits, quizPrijs);
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
        System.out.println("Betaalde " + quizPrijs + " credits voor de quiz. Je hebt nog " + aantalCredits + " credits over. Veel succes!");
    }

    private void geefNietGenoegCreditsWeer(int aantalCredits, int quizPrijs) {
        System.out.println("Je hebt niet genoeg credits om deze quiz te spelen. Je hebt " + aantalCredits + " credits, maar de quiz kost " + quizPrijs + " credits.");
    }

    private void naarVolgendeVraag(Quiz q, int huidigeVraag) {
        String stelling = q.getStelling(huidigeVraag);
        System.out.println("\n" + stelling);
    }

    private void beantwoordVraag(Quiz q, int huidigeVraag) {
        String antwoord = scanner.nextLine();
        q.beantwoordVraag(antwoord, huidigeVraag);
    }

    private void vormWoord() {

    }

    private void scoreWeergeven() {

    }

    private void haalLettersOp() {

    }

}
