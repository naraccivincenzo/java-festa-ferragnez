package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il tuo nome per scoprire se sei invitato");
		String legalName = input.nextLine();

		input.close();

		boolean invited = false;

		/*
		 * for (int i = 0; i < guest.length; i++) { if
		 * (legalName.equalsIgnoreCase(guest[i])) { invited = true; } }
		 */

		int i = 0;
		while (i < guest.length) {
			if (legalName.equalsIgnoreCase(guest[i])) {
				invited = true;
			}
			i++;
		}

		if (invited == true) {
			System.out.println("Sei invitato alla festa di divorzio");
		} else {
			System.out.println("Per te niente pandoro");
		}

	}

}
