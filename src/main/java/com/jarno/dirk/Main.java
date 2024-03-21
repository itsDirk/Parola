package com.jarno.dirk;

public class Main {
    public static void main(String[] args) {
        MocData mocData = new MocData();
        Parola parola = new Parola(mocData.getSpeler());
        parola.speelQuiz();
    }
}