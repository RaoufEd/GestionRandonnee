/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Lieu;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raouf
 */
public class LieuService {

    DataSource ds;
    PreparedStatement ste;

    public LieuService() {

        ds = DataSource.getInstance(); // au lieu de creer une instance on fait appel a 
        //la methode de creation du classe DataSource

    }

    public void ajouter(Lieu l) {
        String req = "INSERT INTO lieu VALUES(null,?,?,?)";
        try {
            ste = ds.getConnection()
                    .prepareStatement(req);

           
            ste.setDouble(1, l.getLongitude());
            ste.setDouble(2, l.getLatitude());
            ste.setString(3, l.getLieuText());
            ste.executeUpdate();
            /*executeUpdate methode d'ajout modification ou supression*/
        } catch (SQLException ex) {
            Logger.getLogger(LieuService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
