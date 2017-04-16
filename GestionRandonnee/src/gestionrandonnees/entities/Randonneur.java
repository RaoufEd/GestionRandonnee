package gestionrandonnees.entities;

import java.sql.Date;

public class Randonneur {

    private int idRandonneur;
    private String nomRandonneur;
    private String prenomRandonneur;
    private Date dateDeNaissance;
    private Lieu idLieu;
    private Date dateDeCreation;
    private String emailRandonneur;
    private String password;
    private int archive;
    private int etatCompte;

    public Randonneur(int idRandonneur, String nomRandonneur, String prenomRandonneur, Date dateDeNaissance, Lieu idLieu, Date dateDeCreation, String emailRandonneur, String password, int archive, int etatCompte) {
        this.idRandonneur = idRandonneur;
        this.nomRandonneur = nomRandonneur;
        this.prenomRandonneur = prenomRandonneur;
        this.dateDeNaissance = dateDeNaissance;
        this.idLieu = idLieu;
        this.dateDeCreation = dateDeCreation;
        this.emailRandonneur = emailRandonneur;
        this.password = password;
        this.archive = archive;
        this.etatCompte = etatCompte;
    }

    public int getIdRandonneur() {
        return idRandonneur;
    }

    public String getNomRandonneur() {
        return nomRandonneur;
    }

    public String getPrenomRandonneur() {
        return prenomRandonneur;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public Lieu getIdLieu() {
        return idLieu;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public String getEmailRandonneur() {
        return emailRandonneur;
    }

    public String getPassword() {
        return password;
    }

    public int getArchive() {
        return archive;
    }

    public int getEtatCompte() {
        return etatCompte;
    }

    public void setIdRandonneur(int idRandonneur) {
        this.idRandonneur = idRandonneur;
    }

    public void setNomRandonneur(String nomRandonneur) {
        this.nomRandonneur = nomRandonneur;
    }

    public void setPrenomRandonneur(String prenomRandonneur) {
        this.prenomRandonneur = prenomRandonneur;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setIdLieu(Lieu idLieu) {
        this.idLieu = idLieu;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public void setEmailRandonneur(String emailRandonneur) {
        this.emailRandonneur = emailRandonneur;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setArchive(int archive) {
        this.archive = archive;
    }

    public void setEtatCompte(int etatCompte) {
        this.etatCompte = etatCompte;
    }

    @Override
    public String toString() {
        return "Randonneur{" + "idRandonneur=" + idRandonneur + ", nomRandonneur=" + nomRandonneur + ", prenomRandonneur=" + prenomRandonneur + ", dateDeNaissance=" + dateDeNaissance + ", idLieu=" + idLieu + ", dateDeCreation=" + dateDeCreation + ", emailRandonneur=" + emailRandonneur + ", password=" + password + ", archive=" + archive + ", etatCompte=" + etatCompte + '}';
    }
    
    
    
    
}
