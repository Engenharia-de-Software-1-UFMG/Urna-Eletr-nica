/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static urnaeletronica.dao.ConnectionDatabase.getConnection;
import urnaeletronica.models.Candidato;

/**
 *
 * @author Bernardo
 */
public class CandidatoDAO {
    
    public List findCandidatos() throws SQLException {
        
        List listCandidatos = new ArrayList();

        String select = "SELECT pes.id, pes.nome, vot.qtdVotos FROM pessoa pes, votos vot where pes.id = vot.id";

        Connection connection = getConnection();
        
        PreparedStatement stmt = connection.prepareStatement(select);
                
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Candidato candidato = new Candidato();

            candidato.setId(rs.getInt("id"));
            candidato.setNome(rs.getString("nome"));
            candidato.setQtdVotos(rs.getInt("qtdVotos"));

            listCandidatos.add(candidato);
        }

        rs.close();
        stmt.close();
        connection.close();

        return listCandidatos;
    }
    
    public Candidato findById(int id) throws SQLException {
        String select = "SELECT * FROM pessoa WHERE id = ?";
        Candidato candidato = null;
        Connection connection = getConnection();
        PreparedStatement stmt = connection.prepareStatement(select);

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            candidato = new Candidato();

            candidato.setId(rs.getInt("id"));
            candidato.setNome(rs.getString("nome"));
            candidato.setCpf(rs.getString("cpf"));
            candidato.setTelefone(rs.getString("telefone"));
            candidato.setTipo(rs.getInt("tipo"));
        }

        rs.close();
        stmt.close();
        connection.close();

        return candidato;
    }
}
