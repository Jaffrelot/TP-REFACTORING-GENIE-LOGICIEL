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
		System.out.println(toString());
	}
		public void manger(){
		System.out.println("je mange");
	}
	public void boire(){
		System.out.println("je bois");
	}
	public String toString(){
		return "nom: "+nom+", prenom:"+prenom+", age: "+age;
	}

	public void ami(Humain autreHumain, int dureeAmitie){
		System.out.println(this.nom + " est ami avec "+autreHumain.nom+" depuis "+dureeAmitie+" jours");
	}
		public void ami(Humain autreHumain){
		ami(autreHumain,100);
	}
}
