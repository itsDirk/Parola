package com.jarno.dirk;

public class Speler {

	private String gebruikersNaam;

	private String wachtwoord;

	private int credits;
    Speler(String gebruikersNaam, String wachtwoord, int credits){
        this.gebruikersNaam = gebruikersNaam;
        this.wachtwoord = wachtwoord;
        this.credits = credits;
    }

	public int getCredits() {
		return credits;
	}

	public void lowerCredits(int amount) {
        this.credits = this.credits - amount;
	}

}
