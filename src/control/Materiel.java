package control;

public abstract class Materiel {
	
	private static Afficheur afficheur;
	private static Clavier clavier;
	private static EmetteurSonore emetteurSonore;
	private static Horloge horloge;
	private static Molette molette;

	// Permet d’accéder aux interfaces de contrôle du matériel
	public static Horloge getHorloge(){
		return horloge;
	}
	public static Clavier getClavier(){
		return clavier;
	}
	public static Molette getMolette(){
		return molette;
	}
	public static EmetteurSonore getEmetteurSonore(){
		return emetteurSonore;
	}
	public static Afficheur getAfficheur(){
		return afficheur;
	}
}
