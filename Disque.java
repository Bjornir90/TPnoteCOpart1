package hanoi1;

public class Disque implements Empilable {
    protected int val;

    public String toString() {
	return "hanoi1.Disque[" + val + "]";
    }

	@Override
	public void init(int taille) {
		val = taille;
	}

	@Override
	public int compareTo(Object v) {
	Empilable d = (Empilable) v;
	if (val < d.getTaille()) return -1;
	else if (val == d.getTaille()) return 0;
	else return 1;
    }

	@Override
	public int getTaille() {
		return val;
	}
}
