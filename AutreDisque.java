package hanoi1;

public class AutreDisque implements Empilable {
	private int taille;

	@Override
	public String toString() {
		return "AutreDisque{" +
				"taille=" + taille +
				'}';
	}

	@Override
	public void init(int taille) {
		this.taille = taille;
	}

	@Override
	public int compareTo(Object o) {
		Empilable d = (Empilable) o;
		if (taille < d.getTaille()) return -1;
		else if (taille == d.getTaille()) return 0;
		else return 1;
	}

	@Override
	public int getTaille() {
		return taille;
	}
}
