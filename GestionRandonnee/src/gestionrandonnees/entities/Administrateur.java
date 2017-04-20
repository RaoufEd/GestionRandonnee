package gestionrandonnees.entities;

public class Administrateur {

	/**
	 * Declation variable
	 */
	private int IdAdmin;
	private String nom, prenom, login, Password;

	/**
	 * Constructeur
	 * 
	 * @param idAdmin
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public Administrateur(int idAdmin, String nom, String prenom, String login, String password) {
		super();
		this.IdAdmin = idAdmin;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		Password = password;
	}
        
        public Administrateur( String nom, String prenom, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
	}

	public int getIdAdmin() {
		return IdAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.IdAdmin = idAdmin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdmin=" + IdAdmin + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", Password=" + Password + "]";
	}

}
