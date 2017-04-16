package gestionrandonnees.entities;

import java.sql.Date;

public class Message {

	/**
	 * declaration des variables
	 */
    
        private int IdMessage;
	private Randonneur randonneurEmetteur, randonneurRecepteur;
	private Date dateEnvoi;
	private String messageText;

    public Message(int IdMessage, Randonneur randonneurEmetteur, Randonneur randonneurRecepteur, Date dateEnvoi, String messageText) {
        this.IdMessage = IdMessage;
        this.randonneurEmetteur = randonneurEmetteur;
        this.randonneurRecepteur = randonneurRecepteur;
        this.dateEnvoi = dateEnvoi;
        this.messageText = messageText;
    }
    
    public Message(String messageText) {
        this.messageText = messageText;
    }

    public int getIdMessage() {
        return IdMessage;
    }

    public Randonneur getRandonneurEmetteur() {
        return randonneurEmetteur;
    }

    public Randonneur getRandonneurRecepteur() {
        return randonneurRecepteur;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setIdMessage(int IdMessage) {
        this.IdMessage = IdMessage;
    }

    public void setRandonneurEmetteur(Randonneur randonneurEmetteur) {
        this.randonneurEmetteur = randonneurEmetteur;
    }

    public void setRandonneurRecepteur(Randonneur randonneurRecepteur) {
        this.randonneurRecepteur = randonneurRecepteur;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" + "IdMessage=" + IdMessage + ", randonneurEmetteur=" + randonneurEmetteur + ", randonneurRecepteur=" + randonneurRecepteur + ", dateEnvoi=" + dateEnvoi + ", messageText=" + messageText + '}';
    }
	
	
	
}
