package com.jarno.dirk;

import java.util.ArrayList;

public class Quiz {

	private int startTijd;

	private int eindTijd;

	private int aantalKeerGespeeld;

	private String woord;

	private ArrayList<IVraag> vragen;

	private int correctBeantwoorddeVragen;

	private char[] verzameldeLetters;

	private int quizPrijs;

	private IScoreTelling scoreTelling;

	private IVraag[] vraag;

	public void resetQuiz() {

	}

	public int getQuizPrijs() {
		return 0;
	}

	public int berekenScore(IScoreTelling scoreTelling) {
		return 0;
	}

	public String getStelling(int index) {
		return null;
	}

	public String beantwoordVraag(String antwoord, int index) {
		return null;
	}

	public char[] getAvailableLetters() {
		return null;
	}

	public boolean valideerWoord(String woord) {
		return false;
	}

	public void startTijd() {

	}

	public void stopTijd() {

	}

}
