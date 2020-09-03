package tp2;

import java.util.Iterator;

public class IterateurMots implements Iterator<String> {

	private Object[] mot;
	private int curseur;

	public IterateurMots(Object[] mot) {
		this.mot = mot;
		int i = 0;
		while (i < mot.length && mot[i] == null) {
			i++;
		}
		if (i < mot.length)
			curseur = i + 1;
		else
			curseur = i;
	}

	@Override
	public boolean hasNext() {
		return curseur < mot.length;
	}

	@Override
	public String next() {
		assert hasNext() : "L'élément suivant est null";
		String res = "";

		while (curseur < mot.length && mot[curseur] != null) {
			res = res + mot[curseur];
			curseur++;
		}
		return res;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
