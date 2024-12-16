package exercice_java_book;





// employe de vente 








 


 public class Exercice2 {

	//public static void main(String[] args) {
		Employe [] employes=new Employe [6];
		employes[0]=new EmployeProduction("Ali", "Sassi", 45, "1995", 30000);
		employes[1]=new EmployeProductionEnRisque ("Sami", "Soussi", 25, "2001", 20000) ;
		employes[2]=new EmployeManutentionEnRisque ("Rami", "Bouaziz", 28, "1998", 1000) ;
		employes[3]=new EmployeRepresentation ("Jacem", "Zrig", 32, "1998", 45) ;
		employes[4]=new EmployeManutention ("Jalel", "Fetwi", 28, "2000", 1000 );
		employes[5]=new EmployeVente ("Amir", "Ammar", 30, "2001", 45) ;
		System.out.println(employes[1].calculerSalaire());
	 
		System.out.println(employes[1].getNom());

	}

}
