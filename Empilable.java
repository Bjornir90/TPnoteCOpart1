package hanoi1;

public interface Empilable extends Comparable {

	void init(int taille);
	@Override
	int compareTo(Object o);
	int getTaille();

}
