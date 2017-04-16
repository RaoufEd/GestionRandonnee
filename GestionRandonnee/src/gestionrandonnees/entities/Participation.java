package gestionrandonnees.entities;

import java.sql.Date;

public class Participation {

	private int IdParticipation;
        private Randonneur randonneur;
	private Randonnee randonnee;
	private int idPraticipation;
	private int nbReservation;
	private Date dateReservation;
	private int etatPaiement;

    public Participation(int IdParticipation, Randonneur randonneur, Randonnee randonnee, int idPraticipation, int nbReservation, Date dateReservation, int etatPaiement) {
        this.IdParticipation = IdParticipation;
        this.randonneur = randonneur;
        this.randonnee = randonnee;
        this.idPraticipation = idPraticipation;
        this.nbReservation = nbReservation;
        this.dateReservation = dateReservation;
        this.etatPaiement = etatPaiement;
    }

    public int getIdParticipation() {
        return IdParticipation;
    }

    public Randonneur getRandonneur() {
        return randonneur;
    }

    public Randonnee getRandonnee() {
        return randonnee;
    }

    public int getIdPraticipation() {
        return idPraticipation;
    }

    public int getNbReservation() {
        return nbReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public int getEtatPaiement() {
        return etatPaiement;
    }

    public void setIdParticipation(int IdParticipation) {
        this.IdParticipation = IdParticipation;
    }

    public void setRandonneur(Randonneur randonneur) {
        this.randonneur = randonneur;
    }

    public void setRandonnee(Randonnee randonnee) {
        this.randonnee = randonnee;
    }

    public void setIdPraticipation(int idPraticipation) {
        this.idPraticipation = idPraticipation;
    }

    public void setNbReservation(int nbReservation) {
        this.nbReservation = nbReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setEtatPaiement(int etatPaiement) {
        this.etatPaiement = etatPaiement;
    }

    @Override
    public String toString() {
        return "Participation{" + "IdParticipation=" + IdParticipation + ", randonneur=" + randonneur + ", randonnee=" + randonnee + ", idPraticipation=" + idPraticipation + ", nbReservation=" + nbReservation + ", dateReservation=" + dateReservation + ", etatPaiement=" + etatPaiement + '}';
    }
	
	
}
