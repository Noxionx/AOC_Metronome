package control;

public class Materiel {
	
	private static Afficheur afficheur = new AfficheurImpl();
	private static EmetteurSonore emetteurSonore = new EmetteurSonoreImpl();
	private static Horloge horloge = new HorlogeImpl();
	private static Molette molette = new MoletteImpl();

	// Permet d’accéder aux interfaces de contrôle du matériel
	public static Horloge getHorloge(){
		return horloge;
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
