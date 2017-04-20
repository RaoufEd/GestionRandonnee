/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;


import gestionrandonnees.entities.Randonnee;
import gestionrandonnees.entities.Randonneur;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thamer
 */
public class RandonneeService {
    
    
    DataSource datasource;
    PreparedStatement statement;

    public RandonneeService() {
        datasource = DataSource.getInstance();
    }
    
      public void ajouter(Randonnee r) {
        String sql = "INSERT INTO randonnee  VALUES (null,?,?,?,?,?,?,?);";
        try {
            statement = datasource.getConnection().prepareStatement(sql);
            statement.setInt(1, r.getRandonneur().getIdRandonneur());
            statement.setInt(2, r.getLieuDepart().getIdLieu());
            statement.setInt(3, r.getLieuArrivee().getIdLieu());
            statement.setString(4, r.getTitre());
            statement.setString(5, r.getDescription());
            statement.setDate(6, r.getDateDepart());
            statement.setDate(7, r.getDateArrivee());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
      
      
       public void modifier(Randonnee r) {

        String sql = ""
                + "update randonnee set titre = ? , description = ?, "
                + " date_depart	 = ?,date_arrivee = ?"
                + " id_lieu_depart = ?,id_lieu_arrivee = ?,"
                +"id_randonneur = ?,"
                + "where id_randonnee = ?";
        try {
            statement = datasource.getConnection().prepareStatement(sql);
            statement.setString(1, r.getTitre());
            statement.setString(2, r.getDescription());
            statement.setDate(3, r.getDateDepart());
            statement.setDate(4, r.getDateArrivee());
            statement.setInt(5, r.getLieuDepart().getIdLieu());
            statement.setInt(6, r.getLieuArrivee().getIdLieu());
            statement.setInt(7, r.getRandonneur().getIdRandonneur());
            statement.setInt(8, r.getIdRandonnee());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
       
        
    public void delete(Randonnee r){
        String sql = "delete from randonnee where id_randonneur = ?";
		try {
			statement = datasource.getConnection().prepareStatement(sql);
			statement.setInt(1, r.getIdRandonnee());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
