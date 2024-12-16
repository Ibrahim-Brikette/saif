package exercice_java_book;

class EmployeRepresentation  extends Commerce{
 	private double pourcentage=0.2;
	private double lePlus =800;

	public EmployeRepresentation(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date,chiffreAffaire);

		
	}
	 public double calculerSalaire() {
		 
		 return chiffreAffaire* pourcentage +lePlus;

	 }
	 @Override
		public void afficher() {
			System.out.println("le representation"+nom+" "+prenom+" "+"gagne "+calculerSalaire());
		}
	
}
