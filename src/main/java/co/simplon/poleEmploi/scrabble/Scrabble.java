package co.simplon.poleEmploi.scrabble;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Scrabble {

	private final static Map<Character, Integer> LETTRES_ET_LEUR_VALEUR = new HashMap<>(
			26);

	public Scrabble() {
		super();
		LETTRES_ET_LEUR_VALEUR.put('A', 1);
		LETTRES_ET_LEUR_VALEUR.put('B', 3);
		LETTRES_ET_LEUR_VALEUR.put('C', 3);
		LETTRES_ET_LEUR_VALEUR.put('D', 2);
		LETTRES_ET_LEUR_VALEUR.put('E', 1);
		LETTRES_ET_LEUR_VALEUR.put('F', 4);
		LETTRES_ET_LEUR_VALEUR.put('G', 2);
		LETTRES_ET_LEUR_VALEUR.put('H', 4);
		LETTRES_ET_LEUR_VALEUR.put('I', 1);
		LETTRES_ET_LEUR_VALEUR.put('J', 8);
		LETTRES_ET_LEUR_VALEUR.put('K', 10);
		LETTRES_ET_LEUR_VALEUR.put('L', 1);
		LETTRES_ET_LEUR_VALEUR.put('M', 2);
		LETTRES_ET_LEUR_VALEUR.put('N', 1);
		LETTRES_ET_LEUR_VALEUR.put('O', 1);
		LETTRES_ET_LEUR_VALEUR.put('P', 3);
		LETTRES_ET_LEUR_VALEUR.put('Q', 8);
		LETTRES_ET_LEUR_VALEUR.put('R', 1);
		LETTRES_ET_LEUR_VALEUR.put('S', 1);
		LETTRES_ET_LEUR_VALEUR.put('T', 1);
		LETTRES_ET_LEUR_VALEUR.put('U', 1);
		LETTRES_ET_LEUR_VALEUR.put('V', 4);
		LETTRES_ET_LEUR_VALEUR.put('W', 10);
		LETTRES_ET_LEUR_VALEUR.put('X', 10);
		LETTRES_ET_LEUR_VALEUR.put('Y', 10);
		LETTRES_ET_LEUR_VALEUR.put('Z', 10);
	}

	public int getValeur(char c) {
		return LETTRES_ET_LEUR_VALEUR.get(c);
	}

	public int getValeur(String string) {
		int valeur = 0;
		for (char c : string.toCharArray()) {
			valeur += this.getValeur(c);
		}
		return valeur;
	}

	public String getLettresDeValeur(int i) {
		Set<Character> lettres = extraireEnsembleTrieDeLettresAyantPourValeur(i);
		if (lettres.isEmpty()) {
			return null;
		}
		String resultat = "";
		for (Character c : lettres) {
			resultat = c.toString() + resultat;
		}
		return resultat;
	}

	private Set<Character> extraireEnsembleTrieDeLettresAyantPourValeur(int i) {
		Set<Character> lettres = new TreeSet<>();
		for (Entry<Character, Integer> entry : LETTRES_ET_LEUR_VALEUR.entrySet()) {
			if (entry.getValue() == i) {
				lettres.add(entry.getKey());
			}
		}
		return lettres;
	}

}
