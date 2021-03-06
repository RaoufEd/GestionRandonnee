/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Lieu;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

           
            ste.setDouble(1, l.getLat());
            ste.setDouble(2, l.getLng());
            ste.setString(3, l.getLieuText());
            ste.executeUpdate();
            /*executeUpdate methode d'ajout modification ou supression*/
        } catch (SQLException ex) {
            Logger.getLogger(LieuService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void supprimer(Lieu l) {

        String req = "DELETE FROM lieu WHERE id = ?";
        try {
            ste = ds.getConnection()
                    .prepareStatement(req);
            ste.setDouble(1, l.getLat());
            ste.setDouble(2, l.getLng());
            ste.setString(3, l.getLieuText());
            ste.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LieuService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public void modifier(Lieu l, int id) {

        try {

            String req = "UPDATE lieu SET lat=?,lng=?,lieuText=? WHERE id =?";
            ste = ds.getConnection()
                    .prepareStatement(req);
            ste.setDouble(1, l.getLat());
            ste.setDouble(2, l.getLng());
            ste.setString(3, l.getLieuText());
            ste.setInt(4, l.getIdLieu());
           
            ste.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LieuService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public List<Lieu> afficher() {
        try {
            List<Lieu> list = new ArrayList<>();
            ResultSet resultat; // retour ou resultat
            String req = "SELECT * FROM lieu";
            ste = ds.getConnection()
                    .prepareStatement(req);
            resultat = ste.executeQuery(req);

            while (resultat.next()) {

                Lieu l = new Lieu(resultat.getInt(1), resultat.getFloat(2), resultat.getFloat(3), resultat.getString(4));
               
                list.add(l);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(LieuService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
 
        

    }
    
}
