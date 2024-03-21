package com.jarno.dirk;

import java.util.ArrayList;

public class MocData {
    public static Speler getSpeler() {
        return new Speler("Parolaspeler123", "Parola123", 1000);
    }

    public static ArrayList<Quiz> getQuizzen() {
        // Thema's
        Thema themaGeografie = new Thema("Geografie");
        Thema themaGeschiedenis = new Thema("Geschiedenis");
        Thema themaSport = new Thema("Sport");
        Thema themaProgrammeren = new Thema("Programmeren");
        Thema themaMuziek = new Thema("Muziek");

        ArrayList<Quiz> quizzen = new ArrayList<>();

        ArrayList<IVraag> vragen = new ArrayList<>();

        // VRAAG 1
        ArrayList<GoedAntwoordKAVraag> gakav1 = new ArrayList<>();
        gakav1.add(new GoedAntwoordKAVraag("Afrika"));

        KortAntwoordVraag kav1 = new KortAntwoordVraag("In welk continent ligt Kenia?", 'A', gakav1, themaGeografie);
        vragen.add(kav1);

        // VRAAG 2
        ArrayList<GoedAntwoordKAVraag> gakav2 = new ArrayList<>();
        gakav2.add(new GoedAntwoordKAVraag("Nairobi"));
        gakav2.add(new GoedAntwoordKAVraag("Narobi"));

        KortAntwoordVraag kav2 = new KortAntwoordVraag("Wat is de hoofdstad van Kenia?", 'N', gakav2, themaGeografie);
        vragen.add(kav2);

        // VRAAG 3
        ArrayList<GoedAntwoordKAVraag> gakav3 = new ArrayList<>();
        gakav3.add(new GoedAntwoordKAVraag("Instanboel"));
        gakav3.add(new GoedAntwoordKAVraag("Instanbul"));

        KortAntwoordVraag kav3 = new KortAntwoordVraag("Wat is de hoofdstad van Turkije?", 'I', gakav3, themaGeografie);
        vragen.add(kav3);

        // VRAAG 4
        ArrayList<GoedAntwoordKAVraag> gakav4 = new ArrayList<>();
        gakav4.add(new GoedAntwoordKAVraag("Eminem"));
        gakav4.add(new GoedAntwoordKAVraag("Emenem"));
        gakav4.add(new GoedAntwoordKAVraag("M&M"));

        KortAntwoordVraag kav4 = new KortAntwoordVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", 'E', gakav4, themaMuziek);
        vragen.add(kav4);

        // VRAAG 5
        GoedAntwoordMKVraag gamkv5 = (new GoedAntwoordMKVraag("Nederland"));

        ArrayList<FoutAntwoordMKVraag> famkv5 = new ArrayList<>();
        famkv5.add(new FoutAntwoordMKVraag("België"));
        famkv5.add(new FoutAntwoordMKVraag("Duitsland"));
        famkv5.add(new FoutAntwoordMKVraag("Frankrijk"));

        MeerkeuzeVraag mkv5 = new MeerkeuzeVraag("In welk land ligt Amsterdam?", 'A', gamkv5, famkv5, themaGeografie);
        vragen.add(mkv5);

        // VRAAG 6
        GoedAntwoordMKVraag gamkv6 = (new GoedAntwoordMKVraag("Java"));

        ArrayList<FoutAntwoordMKVraag> famkv6 = new ArrayList<>();
        famkv6.add(new FoutAntwoordMKVraag("Python"));
        famkv6.add(new FoutAntwoordMKVraag("C#"));
        famkv6.add(new FoutAntwoordMKVraag("HTML"));

        MeerkeuzeVraag mkv6 = new MeerkeuzeVraag("Welk van de volgende programmeertalen wordt vaak gebruikt voor het ontwikkelen van mobiele apps?", 'M', gamkv6, famkv6, themaProgrammeren);
        vragen.add(mkv6);

        // VRAAG 7
        GoedAntwoordMKVraag gamkv7 = (new GoedAntwoordMKVraag("De Eerste Wereldoorlog"));

        ArrayList<FoutAntwoordMKVraag> famkv7 = new ArrayList<>();
        famkv7.add(new FoutAntwoordMKVraag("De Tweede Wereldoorlog"));
        famkv7.add(new FoutAntwoordMKVraag("De Koreaanse Oorlog"));
        famkv7.add(new FoutAntwoordMKVraag("De Vietnamoorlog"));

        MeerkeuzeVraag mkv7 = new MeerkeuzeVraag("Welke oorlog werd gevochten tussen 1914 en 1918 en wordt vaak de \"Grote Oorlog\" genoemd vanwege zijn omvang en impact?", 'E', gamkv7, famkv7, themaGeschiedenis);
        vragen.add(mkv7);

        // VRAAG 8
        GoedAntwoordMKVraag gamkv8 = (new GoedAntwoordMKVraag("De Olympische Spelen"));

        ArrayList<FoutAntwoordMKVraag> famkv8 = new ArrayList<>();
        famkv8.add(new FoutAntwoordMKVraag("De Wereldbeker Voetbal"));
        famkv8.add(new FoutAntwoordMKVraag("De Tour de France"));
        famkv8.add(new FoutAntwoordMKVraag("De Super Bowl"));

        MeerkeuzeVraag mkv8 = new MeerkeuzeVraag("Wat is het grootste sportevenement ter wereld?", 'O', gamkv8, famkv8, themaSport);
        vragen.add(mkv8);


        quizzen.add(new Quiz(vragen, 40));
        return quizzen;
    }
}
