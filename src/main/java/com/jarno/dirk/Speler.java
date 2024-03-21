package com.jarno.dirk;

public class Speler {

	private String gebruikersNaam;

	private String wachtwoord;

	private int credtis;
    Speler(String gebruikersNaam, String wachtwoord, int credtis){
        this.gebruikersNaam = gebruikersNaam;
        this.wachtwoord = wachtwoord;
        this.credtis = credtis;
    }

	public int getCredits() {
		return credtis;
	}

	public void lowerCredits(int amount) {
        this.credtis = this.credtis - amount;
	}

}
