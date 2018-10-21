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
	Disque d = (Disque) v;
	if (val < d.val) return -1;
	else if (val == d.val) return 0;
	else return 1;
    }
}
