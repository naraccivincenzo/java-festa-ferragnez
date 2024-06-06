package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		String [] invited = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci il tuo nome per scoprire se sei invitato");
		String legalName = input.nextLine();
		
		input.close();
		
		for (int i=0; i<invited.length; i++) {
			if (legalName.toLowerCase().equals(invited[i].toLowerCase())) {
				System.out.println(invited[i]);
				System.out.println("Complimenti parteciperai alla festa di divorzio");
				break;
			}
				else {
				System.out.println("Mi dispiace ma per te niente Pandoro");
				break;
			}
		}
		
		
		
		
		
		
	}

}
