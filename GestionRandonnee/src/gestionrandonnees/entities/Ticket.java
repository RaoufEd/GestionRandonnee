package gestionrandonnees.entities;

public class Ticket {

	private Participation participation;
	private String nomTicket;
	private int IdTicket;
	
	

	public int getIdTicket() {
		return IdTicket;
	}


	public void setIdTicket(int idTicket) {
		IdTicket = idTicket;
	}


	/**
	 * 
	 * @param participation
	 * @param nomTicket
	 */
	public Ticket(Participation participation, String nomTicket) {
		super();
		this.participation = participation;
		this.nomTicket = nomTicket;
	}
	
	
	public Participation getParticipation() {
		return participation;
	}


	public void setParticipation(Participation participation) {
		this.participation = participation;
	}


	public String getNomTicket() {
		return nomTicket;
	}


	public void setNomTicket(String nomTicket) {
		this.nomTicket = nomTicket;
	}
}
