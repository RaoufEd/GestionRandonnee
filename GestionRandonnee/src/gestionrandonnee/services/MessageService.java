/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.services;

import gestionrandonnees.entities.Message;
import gestionrandonnees.utils.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
