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
                        statement.setDate(3,r.getDateDeNaissance());
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

}
