package gestionrandonnees.entities;

import java.sql.Date;

public class Commentaire {

	private Randonnee randonnee;
	private Randonneur randonneur;
	private String commentaireText;
	private Date dateCommentaire;
	private int idCommentaire;
	
	
	/**
	 * 
	 * @param randonnee
	 * @param randonneur
	 * @param commentaireText
	 * @param dateCommentaire
	 * @param idCommentaire
	 */
	public Commentaire(Randonnee randonnee, Randonneur randonneur, String commentaireText, Date dateCommentaire,
			int idCommentaire) {
		super();
		this.randonnee = randonnee;
		this.randonneur = randonneur;
		this.commentaireText = commentaireText;
		this.dateCommentaire = dateCommentaire;
		this.idCommentaire = idCommentaire;
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
	public String getCommentaireText() {
		return commentaireText;
	}
	public void setCommentaireText(String commentaireText) {
		this.commentaireText = commentaireText;
	}
	public Date getDateCommentaire() {
		return dateCommentaire;
	}
	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}
	public int getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

}
