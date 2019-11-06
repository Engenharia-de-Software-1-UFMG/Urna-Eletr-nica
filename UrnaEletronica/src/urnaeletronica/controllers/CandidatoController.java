/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import urnaeletronica.dao.CandidatoDAO;
import urnaeletronica.models.Candidato;

/**
 *
 * @author Bernardo
 */
public class CandidatoController {
    
     private final CandidatoDAO candidatoDAO;

    public CandidatoController() {
        this.candidatoDAO = new CandidatoDAO();
    }
    
    public ArrayList getCandidatos() {
        try {
            return (ArrayList) this.candidatoDAO.findCandidatos();
        } catch (SQLException ex) {
            System.out.println("CandidatoController: Falha ao recuperar lista de candidatos.");
            System.out.println(ex);
            return new ArrayList();
        }
    } 
    
    public Candidato getCandidatoById(int id) {
        try {
            return this.candidatoDAO.findById(id);
        } catch (SQLException ex) {
            System.out.println("CandidatoController: Falha ao recuperar candidato por ID.");
            System.out.println(ex);
            return new Candidato();
        }
    }
}
