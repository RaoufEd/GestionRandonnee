package gestionrandonnees.entities;

import java.sql.Date;

public class Randonnee {
	private int idRandonnee;
        private Randonneur randonneur;
        private Lieu lieuDepart;
        private Lieu lieuArrivee;
        private String titre;
        private String description;
        private Date dateDepart;
        private Date dateArrivee;
        private int archive;
        private int etat;

    public Randonnee(int idRandonnee, Randonneur randonneur, Lieu lieuDepart, Lieu lieuArrivee, String titre, String description, Date dateDepart, Date dateArrivee, int archive, int etat) {
        this.idRandonnee = idRandonnee;
        this.randonneur = randonneur;
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.titre = titre;
        this.description = description;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.archive = archive;
        this.etat = etat;
    }

    public int getIdRandonnee() {
        return idRandonnee;
    }

    public Randonneur getRandonneur() {
        return randonneur;
    }

    public Lieu getLieuDepart() {
        return lieuDepart;
    }

    public Lieu getLieuArrivee() {
        return lieuArrivee;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public int getArchive() {
        return archive;
    }

    public int getEtat() {
        return etat;
    }

    public void setIdRandonnee(int idRandonnee) {
        this.idRandonnee = idRandonnee;
    }

    public void setRandonneur(Randonneur randonneur) {
        this.randonneur = randonneur;
    }

    public void setLieuDepart(Lieu lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public void setLieuArrivee(Lieu lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public void setArchive(int archive) {
        this.archive = archive;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Randonnee{" + "idRandonnee=" + idRandonnee + ", randonneur=" + randonneur + ", lieuDepart=" + lieuDepart + ", lieuArrivee=" + lieuArrivee + ", titre=" + titre + ", description=" + description + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", archive=" + archive + ", etat=" + etat + '}';
    }
        
        
        
        
	 

}
