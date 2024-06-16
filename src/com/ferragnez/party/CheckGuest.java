package com.ferragnez.party;

//import scanner class
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		//init the array with the guest
		String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

		//create a new instance fo scanner
		Scanner input = new Scanner(System.in);

		//ask user to input his/her name
		System.out.println("Inserisci il tuo nome per scoprire se sei invitato");
		String legalName = input.nextLine();

		//close the scanner instance
		input.close();

		//declare and assign a variable to check if invited or not
		boolean invited = false;

		//check if invited with the for loop
		/*
		 * for (int i = 0; i < guest.length; i++) { if
		 * (legalName.equalsIgnoreCase(guest[i])) { invited = true; } }
		 */

		//check if invited with the while loop
		int i = 0;
		while (i < guest.length) {
			if (legalName.equalsIgnoreCase(guest[i])) {
				invited = true;
			}
			i++;
		}

		//display if invited or not
		if (invited) {
			System.out.println("Sei invitato alla festa di divorzio");
		} else {
			System.out.println("Per te niente pandoro");
		}

	}

}
