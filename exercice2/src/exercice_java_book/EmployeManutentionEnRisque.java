package exercice_java_book;

class EmployeManutentionEnRisque extends EmployeManutention implements Risque{
	public EmployeManutentionEnRisque(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre, age, date, nbUnite);
	}
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire()+prime;
	}
	@Override
	public void afficher() {
		System.out.println("le manutention en risque "+nom+" "+prenom+" "+"gagne "+calculerSalaire());
	}
}