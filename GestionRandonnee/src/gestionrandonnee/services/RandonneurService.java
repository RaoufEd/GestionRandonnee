/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Randonneur;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thamer
 */
public class RandonneurService {

    DataSource datasource;
    PreparedStatement statement;

    public RandonneurService() {
        datasource = DataSource.getInstance();
    }

    public void ajouter(Randonneur r) {
        String sql = "INSERT INTO randonneur  VALUES (null,?,?,?,?,?,?,?);";
        try {
            statement = datasource.getConnection().prepareStatement(sql);
            statement.setString(1, r.getNomRandonneur());
            statement.setString(2, r.getPrenomRandonneur());
            statement.setDate(3, r.getDateDeNaissance());
            statement.setInt(4, r.getIdLieu().getIdLieu());
            statement.setDate(5, r.getDateDeCreation());
            statement.setString(6, r.getEmailRandonneur());
            statement.setString(7, r.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void modifier(Randonneur r) {

        String sql = ""
                + "update randonneur set nom_randonneur = ? , prenom_randonneur = ?, "
                + " date_de_naissance = ?,id_lieu = ?"
                + " e_mail_randonneur = ?,mot_de_pass = ?"
                + "where id_randonneur = ?";
        try {
            statement = datasource.getConnection().prepareStatement(sql);
            statement.setString(1, r.getNomRandonneur());
            statement.setString(2, r.getPrenomRandonneur());
            statement.setDate(3, r.getDateDeNaissance());
            statement.setInt(4, r.getIdLieu().getIdLieu());
            statement.setString(5, r.getEmailRandonneur());
            statement.setString(6, r.getPassword());
            statement.setInt(7, r.getIdRandonneur());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    public void delete(Randonneur r){
        String sql = "delete from randonneur where id_randonneur = ?";
		try {
			statement = datasource.getConnection().prepareStatement(sql);
			statement.setInt(1, r.getIdRandonneur());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
