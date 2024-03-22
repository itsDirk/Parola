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

        // QUIZ 1
        ArrayList<IVraag> vragenQuiz1 = new ArrayList<>();

        // VRAAG 1
        ArrayList<GoedAntwoordKAVraag> gakav1 = new ArrayList<>();
        gakav1.add(new GoedAntwoordKAVraag("Afrika"));

        KortAntwoordVraag kav1 = new KortAntwoordVraag("In welk continent ligt Kenia?", 'A', gakav1, themaGeografie);
        vragenQuiz1.add(kav1);

        // VRAAG 2
        ArrayList<GoedAntwoordKAVraag> gakav2 = new ArrayList<>();
        gakav2.add(new GoedAntwoordKAVraag("Nairobi"));
        gakav2.add(new GoedAntwoordKAVraag("Narobi"));

        KortAntwoordVraag kav2 = new KortAntwoordVraag("Wat is de hoofdstad van Kenia?", 'N', gakav2, themaGeografie);
        vragenQuiz1.add(kav2);

        // VRAAG 3
        ArrayList<GoedAntwoordKAVraag> gakav3 = new ArrayList<>();
        gakav3.add(new GoedAntwoordKAVraag("Instanboel"));
        gakav3.add(new GoedAntwoordKAVraag("Instanbul"));

        KortAntwoordVraag kav3 = new KortAntwoordVraag("Wat is de hoofdstad van Turkije?", 'I', gakav3, themaGeografie);
        vragenQuiz1.add(kav3);

        // VRAAG 4
        ArrayList<GoedAntwoordKAVraag> gakav4 = new ArrayList<>();
        gakav4.add(new GoedAntwoordKAVraag("Eminem"));
        gakav4.add(new GoedAntwoordKAVraag("Emenem"));
        gakav4.add(new GoedAntwoordKAVraag("M&M"));

        KortAntwoordVraag kav4 = new KortAntwoordVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", 'E', gakav4, themaMuziek);
        vragenQuiz1.add(kav4);

        // VRAAG 5
        GoedAntwoordMKVraag gamkv5 = (new GoedAntwoordMKVraag("Nederland"));

        ArrayList<FoutAntwoordMKVraag> famkv5 = new ArrayList<>();
        famkv5.add(new FoutAntwoordMKVraag("België"));
        famkv5.add(new FoutAntwoordMKVraag("Duitsland"));
        famkv5.add(new FoutAntwoordMKVraag("Frankrijk"));

        MeerkeuzeVraag mkv5 = new MeerkeuzeVraag("In welk land ligt Amsterdam?", 'A', gamkv5, famkv5, themaGeografie);
        vragenQuiz1.add(mkv5);

        // VRAAG 6
        GoedAntwoordMKVraag gamkv6 = (new GoedAntwoordMKVraag("Java"));

        ArrayList<FoutAntwoordMKVraag> famkv6 = new ArrayList<>();
        famkv6.add(new FoutAntwoordMKVraag("Python"));
        famkv6.add(new FoutAntwoordMKVraag("C#"));
        famkv6.add(new FoutAntwoordMKVraag("HTML"));

        MeerkeuzeVraag mkv6 = new MeerkeuzeVraag("Welk van de volgende programmeertalen wordt vaak gebruikt voor het ontwikkelen van mobiele apps?", 'M', gamkv6, famkv6, themaProgrammeren);
        vragenQuiz1.add(mkv6);

        // VRAAG 7
        GoedAntwoordMKVraag gamkv7 = (new GoedAntwoordMKVraag("De Eerste Wereldoorlog"));

        ArrayList<FoutAntwoordMKVraag> famkv7 = new ArrayList<>();
        famkv7.add(new FoutAntwoordMKVraag("De Tweede Wereldoorlog"));
        famkv7.add(new FoutAntwoordMKVraag("De Koreaanse Oorlog"));
        famkv7.add(new FoutAntwoordMKVraag("De Vietnamoorlog"));

        MeerkeuzeVraag mkv7 = new MeerkeuzeVraag("Welke oorlog werd gevochten tussen 1914 en 1918 en wordt vaak de \"Grote Oorlog\" genoemd vanwege zijn omvang en impact?", 'E', gamkv7, famkv7, themaGeschiedenis);
        vragenQuiz1.add(mkv7);

        // VRAAG 8
        GoedAntwoordMKVraag gamkv8 = (new GoedAntwoordMKVraag("De Olympische Spelen"));

        ArrayList<FoutAntwoordMKVraag> famkv8 = new ArrayList<>();
        famkv8.add(new FoutAntwoordMKVraag("De Wereldbeker Voetbal"));
        famkv8.add(new FoutAntwoordMKVraag("De Tour de France"));
        famkv8.add(new FoutAntwoordMKVraag("De Super Bowl"));

        MeerkeuzeVraag mkv8 = new MeerkeuzeVraag("Wat is het grootste sportevenement ter wereld?", 'O', gamkv8, famkv8, themaSport);
        vragenQuiz1.add(mkv8);

        quizzen.add(new Quiz(vragenQuiz1, 40));


        // QUIZ 2
        ArrayList<IVraag> vragenQuiz2 = new ArrayList<>();

        // VRAAG 1
        ArrayList<GoedAntwoordKAVraag> gakav9 = new ArrayList<>();
        gakav9.add(new GoedAntwoordKAVraag("Parijs"));

        KortAntwoordVraag kav9 = new KortAntwoordVraag("Wat is de hoofdstad van Frankrijk?", 'P', gakav9, themaGeografie);
        vragenQuiz2.add(kav9);

        // VRAAG 2
        ArrayList<GoedAntwoordKAVraag> gakav10 = new ArrayList<>();
        gakav10.add(new GoedAntwoordKAVraag("Berlijn"));

        KortAntwoordVraag kav10 = new KortAntwoordVraag("Wat is de hoofdstad van Duitsland?", 'B', gakav10, themaGeografie);
        vragenQuiz2.add(kav10);

        // VRAAG 3
        ArrayList<GoedAntwoordKAVraag> gakav11 = new ArrayList<>();
        gakav11.add(new GoedAntwoordKAVraag("Washington D.C."));
        gakav11.add(new GoedAntwoordKAVraag("Washington DC"));
        gakav11.add(new GoedAntwoordKAVraag("Washington"));

        KortAntwoordVraag kav11 = new KortAntwoordVraag("Wat is de hoofdstad van de Verenigde Staten?", 'W', gakav11, themaGeografie);
        vragenQuiz2.add(kav11);

        // VRAAG 4
        ArrayList<GoedAntwoordKAVraag> gakav12 = new ArrayList<>();
        gakav12.add(new GoedAntwoordKAVraag("Johannesburg"));

        KortAntwoordVraag kav12 = new KortAntwoordVraag("Wat is de grootste stad van Zuid-Afrika?", 'J', gakav12, themaGeografie);
        vragenQuiz2.add(kav12);

        // VRAAG 5
        GoedAntwoordMKVraag gamkv13 = (new GoedAntwoordMKVraag("C++"));

        ArrayList<FoutAntwoordMKVraag> famkv13 = new ArrayList<>();
        famkv13.add(new FoutAntwoordMKVraag("Java"));
        famkv13.add(new FoutAntwoordMKVraag("Python"));
        famkv13.add(new FoutAntwoordMKVraag("JavaScript"));

        MeerkeuzeVraag mkv13 = new MeerkeuzeVraag("Welke programmeertaal wordt vaak gebruikt voor het maken van systeemsoftware?", 'C', gamkv13, famkv13, themaProgrammeren);
        vragenQuiz2.add(mkv13);

        // VRAAG 6
        GoedAntwoordMKVraag gamkv14 = (new GoedAntwoordMKVraag("Bach"));

        ArrayList<FoutAntwoordMKVraag> famkv14 = new ArrayList<>();
        famkv14.add(new FoutAntwoordMKVraag("Beethoven"));
        famkv14.add(new FoutAntwoordMKVraag("Mozart"));
        famkv14.add(new FoutAntwoordMKVraag("Chopin"));

        MeerkeuzeVraag mkv14 = new MeerkeuzeVraag("Welke componist wordt beschouwd als een van de grootste componisten aller tijden?", 'B', gamkv14, famkv14, themaMuziek);
        vragenQuiz2.add(mkv14);

        // VRAAG 7
        GoedAntwoordMKVraag gamkv15 = (new GoedAntwoordMKVraag("De Renaissance"));

        ArrayList<FoutAntwoordMKVraag> famkv15 = new ArrayList<>();
        famkv15.add(new FoutAntwoordMKVraag("De Middeleeuwen"));
        famkv15.add(new FoutAntwoordMKVraag("De Verlichting"));
        famkv15.add(new FoutAntwoordMKVraag("Het Victoriaanse tijdperk"));

        MeerkeuzeVraag mkv15 = new MeerkeuzeVraag("Welke periode wordt gekenmerkt door een hernieuwde interesse in kunst, cultuur en wetenschap?", 'R', gamkv15, famkv15, themaGeschiedenis);
        vragenQuiz2.add(mkv15);

        // VRAAG 8
        GoedAntwoordMKVraag gamkv16 = (new GoedAntwoordMKVraag("De Olympische Spelen"));

        ArrayList<FoutAntwoordMKVraag> famkv16 = new ArrayList<>();
        famkv16.add(new FoutAntwoordMKVraag("De FIFA Wereldbeker"));
        famkv16.add(new FoutAntwoordMKVraag("De Super Bowl"));
        famkv16.add(new FoutAntwoordMKVraag("De Wimbledonkampioenschappen"));

        MeerkeuzeVraag mkv16 = new MeerkeuzeVraag("Welk sportevenement wordt elke vier jaar gehouden en omvat verschillende sporten en atleten van over de hele wereld?", 'O', gamkv16, famkv16, themaSport);
        vragenQuiz2.add(mkv16);

        quizzen.add(new Quiz(vragenQuiz2, 50)); // Je kunt het totale aantal punten aanpassen afhankelijk van de moeilijkheid van de vragen


        // QUIZ 3
        ArrayList<IVraag> vragenQuiz3 = new ArrayList<>();

        // VRAAG 1
        ArrayList<GoedAntwoordKAVraag> gakav17 = new ArrayList<>();
        gakav17.add(new GoedAntwoordKAVraag("Australië"));
        gakav17.add(new GoedAntwoordKAVraag("Australie"));

        KortAntwoordVraag kav17 = new KortAntwoordVraag("Welk land heeft het Opera House in Sydney?", 'A', gakav17, themaGeografie);
        vragenQuiz3.add(kav17);

        // VRAAG 2
        ArrayList<GoedAntwoordKAVraag> gakav18 = new ArrayList<>();
        gakav18.add(new GoedAntwoordKAVraag("Brasilia"));

        KortAntwoordVraag kav18 = new KortAntwoordVraag("Wat is de hoofdstad van Brazilië?", 'B', gakav18, themaGeografie);
        vragenQuiz3.add(kav18);

        // VRAAG 3
        ArrayList<GoedAntwoordKAVraag> gakav19 = new ArrayList<>();
        gakav19.add(new GoedAntwoordKAVraag("Tokio"));

        KortAntwoordVraag kav19 = new KortAntwoordVraag("Wat is de hoofdstad van Japan?", 'T', gakav19, themaGeografie);
        vragenQuiz3.add(kav19);

        // VRAAG 4
        ArrayList<GoedAntwoordKAVraag> gakav20 = new ArrayList<>();
        gakav20.add(new GoedAntwoordKAVraag("Kaapstad"));

        KortAntwoordVraag kav20 = new KortAntwoordVraag("Wat is de hoofdstad van Zuid-Afrika?", 'K', gakav20, themaGeografie);
        vragenQuiz3.add(kav20);

        // VRAAG 5
        GoedAntwoordMKVraag gamkv21 = (new GoedAntwoordMKVraag("JavaScript"));

        ArrayList<FoutAntwoordMKVraag> famkv21 = new ArrayList<>();
        famkv21.add(new FoutAntwoordMKVraag("Java"));
        famkv21.add(new FoutAntwoordMKVraag("C++"));
        famkv21.add(new FoutAntwoordMKVraag("Python"));

        MeerkeuzeVraag mkv21 = new MeerkeuzeVraag("Welke programmeertaal wordt vaak gebruikt voor het maken van interactieve webpagina's?", 'J', gamkv21, famkv21, themaProgrammeren);
        vragenQuiz3.add(mkv21);

        // VRAAG 6
        GoedAntwoordMKVraag gamkv22 = (new GoedAntwoordMKVraag("Mozart"));

        ArrayList<FoutAntwoordMKVraag> famkv22 = new ArrayList<>();
        famkv22.add(new FoutAntwoordMKVraag("Beethoven"));
        famkv22.add(new FoutAntwoordMKVraag("Bach"));
        famkv22.add(new FoutAntwoordMKVraag("Vivaldi"));

        MeerkeuzeVraag mkv22 = new MeerkeuzeVraag("Wie componeerde de beroemde opera 'Die Zauberflöte'?", 'M', gamkv22, famkv22, themaMuziek);
        vragenQuiz3.add(mkv22);

        // VRAAG 7
        GoedAntwoordMKVraag gamkv23 = (new GoedAntwoordMKVraag("De Industriële Revolutie"));

        ArrayList<FoutAntwoordMKVraag> famkv23 = new ArrayList<>();
        famkv23.add(new FoutAntwoordMKVraag("De Franse Revolutie"));
        famkv23.add(new FoutAntwoordMKVraag("De Renaissance"));
        famkv23.add(new FoutAntwoordMKVraag("De Verlichting"));

        MeerkeuzeVraag mkv23 = new MeerkeuzeVraag("Welke periode markeerde de overgang naar nieuwe productieprocessen en industriële groei in de 18e en 19e eeuw?", 'I', gamkv23, famkv23, themaGeschiedenis);
        vragenQuiz3.add(mkv23);

        // VRAAG 8
        GoedAntwoordMKVraag gamkv24 = (new GoedAntwoordMKVraag("De FIFA Wereldbeker"));

        ArrayList<FoutAntwoordMKVraag> famkv24 = new ArrayList<>();
        famkv24.add(new FoutAntwoordMKVraag("De Olympische Spelen"));
        famkv24.add(new FoutAntwoordMKVraag("De Super Bowl"));
        famkv24.add(new FoutAntwoordMKVraag("De Ryder Cup"));

        MeerkeuzeVraag mkv24 = new MeerkeuzeVraag("Wat is het grootste voetbaltoernooi ter wereld?", 'F', gamkv24, famkv24, themaSport);
        vragenQuiz3.add(mkv24);

        quizzen.add(new Quiz(vragenQuiz3, 60)); // Je kunt het totale aantal punten aanpassen afhankelijk van de moeilijkheid van de vragen

        return quizzen;
    }
}
