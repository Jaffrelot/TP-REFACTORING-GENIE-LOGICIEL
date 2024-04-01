package iut.bad;

public class Humain{
	private String nom;
	private String prenom;
	private int age;
	public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public void detail(){
		System.out.println("nom ="+nom+" prenom= "+prenom+" age= "+age);
	}
}
