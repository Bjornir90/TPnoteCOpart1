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
		AutreDisque d = (AutreDisque) o;
		if (taille < d.taille) return -1;
		else if (taille == d.taille) return 0;
		else return 1;
	}
}
