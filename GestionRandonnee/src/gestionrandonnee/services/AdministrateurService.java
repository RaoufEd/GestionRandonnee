/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Administrateur;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author thamer
 */
public class AdministrateurService {
    
    
     
    DataSource datasource;
    PreparedStatement statement;

    public AdministrateurService() {
        datasource = DataSource.getInstance();
    }
    
    public List<Administrateur> login(Administrateur admin){
        
       
        List<Administrateur> liste = new ArrayList<>();
		ResultSet rs;
		String sql = "select nom_admin,prenom_admin,e_mail_admin from admin where e_mail_admin = ? and mot_de_passe = ?";

		try {
			statement = datasource.getConnection().prepareStatement(sql);
                        statement.setString(1, admin.getLogin());
                        statement.setString(1, admin.getPassword());
			rs = statement.executeQuery();

			while (rs.next()) {
				Administrateur ad = new Administrateur(rs.getString(1), rs.getString(2), rs.getString(3));
				liste.add(ad);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
        
    }
    
}
