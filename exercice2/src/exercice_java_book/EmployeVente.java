package exercice_java_book;

class EmployeVente extends Commerce{
	
	private double pourcentage=0.2;
	private double lePlus =400;
	public EmployeVente(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date,chiffreAffaire);
	}
	
	 public double calculerSalaire() {
		 return chiffreAffaire* pourcentage +lePlus;
		 
	 }
	 public void afficher() {
			System.out.println("le vente "+nom+" "+prenom+" "+"gagne "+calculerSalaire());
		}
	
}