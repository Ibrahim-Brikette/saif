package exercice_java_book;

abstract class Employe{
	protected String nom;
	protected String prenom;
	protected int age;
	protected String dateEntree;
	public Employe(String nom, String prenom, int age, String dateEntree) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.dateEntree=dateEntree;
	}

	
	public abstract double calculerSalaire();
	public abstract void afficher(); 
	
}