package gestionrandonnees.entities;

public class Media {

	private int idMedia;
	private Randonnee randonnee;
	private Randonneur randonneur;
	private String nom;
	private String extension;

	/**
	 * 
	 * @param idMedia
	 * @param randonnee
	 * @param randonneur
	 * @param nom
	 * @param extension
	 */
	public Media(int idMedia, Randonnee randonnee, Randonneur randonneur, String nom, String extension) {
		super();
		this.idMedia = idMedia;
		this.randonnee = randonnee;
		this.randonneur = randonneur;
		this.nom = nom;
		this.extension = extension;
	}

	public int getIdMedia() {
		return idMedia;
	}

	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}

	public Randonnee getRandonnee() {
		return randonnee;
	}

	public void setRandonnee(Randonnee randonnee) {
		this.randonnee = randonnee;
	}

	public Randonneur getRandonneur() {
		return randonneur;
	}

	public void setRandonneur(Randonneur randonneur) {
		this.randonneur = randonneur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
