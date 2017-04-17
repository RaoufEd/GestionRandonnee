/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Message;
import gestionrandonnees.entities.Randonneur;
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
 * @author heni
 */
public class MessageService {
    
    DataSource ds;
    PreparedStatement ste;
    
    public MessageService() {
        ds = DataSource.getInstance();
    }
    
    public void ajouter(Message m) {
        String query = "INSERT INTO message VALUES (null, ?, ?, ?, ?)";
        try {
            ste.getConnection().prepareStatement(query);
            ste.setInt(1, m.getRandonneurEmetteur().getIdRandonneur());
            ste.setInt(2, m.getRandonneurRecepteur().getIdRandonneur());
            ste.setDate(3, m.getDateEnvoi()); // Change Date Type
            ste.setString(4, m.getMessageText());
            ste.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Message> afficher(Randonneur r1, Randonneur r2) {
        List<Message> list = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT message FROM message WHERE id_randonneur_emetteur=? AND id_randonneur_recepteur=?"
                + "ORDER BY date_envoie_message DESC";
        try {
            ste = ds.getConnection().prepareStatement(query);
            ste.setInt(1, r1.getIdRandonneur());
            ste.setInt(2,r2.getIdRandonneur());
            rs = ste.executeQuery(query);
            
            while (rs.next()) {
                Message m = new Message(rs.getString(5));
                list.add(m);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
