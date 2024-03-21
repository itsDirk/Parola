package com.jarno.dirk;

import java.util.ArrayList;

public class MocData {
    public static Speler getSpeler() {
        return new Speler("Parolaspeler123", "Parola123", 1000);
    }

    public static ArrayList<Quiz> getQuizzen(){
        ArrayList<Quiz> quizzen = new ArrayList<>();

        ArrayList<IVraag> vragen = new ArrayList<>();

        // VRAAG 1
        ArrayList<GoedAntwoordKAVraag> gakav1 = new ArrayList<>();
        gakav1.add(new GoedAntwoordKAVraag("Afrika"));
        gakav1.add(new GoedAntwoordKAVraag("afrika"));

        KortAntwoordVraag kav1 = new KortAntwoordVraag("In welk continent ligt Kenia?", gakav1);
        vragen.add(kav1);

        // VRAAG 2
        ArrayList<GoedAntwoordKAVraag> gakav2 = new ArrayList<>();
        gakav2.add(new GoedAntwoordKAVraag("Nairobi"));
        gakav2.add(new GoedAntwoordKAVraag("nairobi"));

        KortAntwoordVraag kav2 = new KortAntwoordVraag("Wat is de hoofdstad van Kenia?", gakav2);
        vragen.add(kav2);

        // VRAAG 3
        ArrayList<GoedAntwoordKAVraag> gakav3 = new ArrayList<>();
        gakav3.add(new GoedAntwoordKAVraag("Instanboel"));
        gakav3.add(new GoedAntwoordKAVraag("Instanbul"));
        gakav3.add(new GoedAntwoordKAVraag("instanboel"));
        gakav3.add(new GoedAntwoordKAVraag("instanbul"));



        quizzen.add();
        return quizzen;
    }


}
