package gestionrandonnees.entities;

public class Lieu {

	/**
	 * declaration de variable
	 */
        private int IdLieu;
	private float lat, lng;
	private String lieuText;

    public Lieu(int IdLieu, float lat, float lng, String lieuText) {
        this.IdLieu = IdLieu;
        this.lat = lat;
        this.lng = lng;
        this.lieuText = lieuText;
    }

    public int getIdLieu() {
        return IdLieu;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }

    public String getLieuText() {
        return lieuText;
    }

    public void setIdLieu(int IdLieu) {
        this.IdLieu = IdLieu;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public void setLieuText(String lieuText) {
        this.lieuText = lieuText;
    }

    @Override
    public String toString() {
        return "Lieu{" + "IdLieu=" + IdLieu + ", lat=" + lat + ", lng=" + lng + ", lieuText=" + lieuText + '}';
    }

    public double getLongitude() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
}