/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Media;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heni
 */
public class MediaService {
    
    DataSource ds;
    PreparedStatement ste;
    
    public MediaService() {
        ds = DataSource.getInstance();
    }
    
    public void ajouter(Media m) {
        String query = "INSERT INTO media VALUES (null, ?, ?, ?, ?)";
        try {
            ste.getConnection().prepareStatement(query);
            ste.setInt(1, m.getRandonnee().getIdRandonnee());
            ste.setInt(2, m.getRandonneur().getIdRandonneur());
            ste.setString(3, m.getNom());
            ste.setString(4, m.getExtension());
            ste.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MediaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}