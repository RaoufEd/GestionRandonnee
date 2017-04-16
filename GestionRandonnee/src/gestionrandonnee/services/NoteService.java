/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Note;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raouf
 */
public class NoteService {

    DataSource ds;
    PreparedStatement ste;

    public NoteService() {

        ds = DataSource.getInstance(); // au lieu de creer une instance on fait appel a 
        //la methode de creation du classe DataSource

    }

    public void ajouter(Note n) {
        String req = "INSERT INTO note VALUES(null,?,?,?)";
        try {
            ste = ds.getConnection()
                    .prepareStatement(req);

            ste.setInt(1, n.getRandonneur().getIdRandonneur());
            ste.setInt(2, n.getRandonnee().getIdRandonnee());
            ste.setInt(3, n.getNote());
            ste.executeUpdate();
            /*executeUpdate methode d'ajout modification ou supression*/
        } catch (SQLException ex) {
            Logger.getLogger(NoteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
