/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.dao;

import java.sql.SQLException;
import urnaeletronica.models.Candidato;

/**
 *
 * @author Bernardo
 */
public class VotoDAO extends GenericDAO{
    
     public void alterar(Candidato candidato) throws SQLException {
        String update = "UPDATE votos SET qtdVotos = ? WHERE id = ?";
        update(update, candidato.getQtdVotos(), candidato.getId());
    }
    
}
