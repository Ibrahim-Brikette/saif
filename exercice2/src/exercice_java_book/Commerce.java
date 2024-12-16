package exercice_java_book;

public abstract class Commerce extends Employe{
	protected double chiffreAffaire;
	public Commerce(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date);
		this.chiffreAffaire=chiffreAffaire;
	}
 }
