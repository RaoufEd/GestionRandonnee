package gestionrandonnees.entities;

public class Note {

	/**
	 * declaration des variables
	 */
        private int IdNote;
	private Randonnee randonnee;
	private Randonneur randonneur;
	private int note;

    public Note(int IdNote, Randonnee randonnee, Randonneur randonneur, int note) {
        this.IdNote = IdNote;
        this.randonnee = randonnee;
        this.randonneur = randonneur;
        this.note = note;
    }

    public int getIdNote() {
        return IdNote;
    }

    public Randonnee getRandonnee() {
        return randonnee;
    }

    public Randonneur getRandonneur() {
        return randonneur;
    }

    public int getNote() {
        return note;
    }

    public void setIdNote(int IdNote) {
        this.IdNote = IdNote;
    }

    public void setRandonnee(Randonnee randonnee) {
        this.randonnee = randonnee;
    }

    public void setRandonneur(Randonneur randonneur) {
        this.randonneur = randonneur;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" + "IdNote=" + IdNote + ", randonnee=" + randonnee + ", randonneur=" + randonneur + ", note=" + note + '}';
    }

	
	
}
