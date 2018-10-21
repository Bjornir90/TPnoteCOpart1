package hanoi1;

public class Tour extends Pile {
    
    public Tour(int capa) {
	super(capa);
    }

    // la version ici est specialisee dans le sens qu'elle n'empile que
    // des instances de la classe hanoi1.Disque, alors qu'on pourrait en fait
    // empiler des objets arbitraires du moment qu'ils sont comparables.
    // Comme on sait quelle classe il faut instancier, on a juste besoin de
    // prendre en parametre le nombre de disques a empiler, et on commencera
    // par empiler le plus gros.
    public void remplir(int nb) throws ErreurPile {
		for(; nb > 0; nb--) {
			Empilable e;
			e.init(nb);
			this.empiler(e);
		}
    }

    // Redéfinir empiler de hanoi1.Pile de façon à contrôler qu'on n'empile
    // qu'une instance de hanoi1.Disque, et de taille suffisamment grande.
	@Override
    public void empiler(Object v) throws ErreurPile {
        if(v instanceof Empilable){
	        super.empiler(v);
        } else {
        	throw new ErreurTour("L'objet à empiler n'implémente pas Empilable");
        }

    }
}
