/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Tests;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import urnaeletronica.dao.CandidatoDAO;
import urnaeletronica.models.Candidato;

/**
 *
 * @author Bernardo
 */
public class TesteCandidatoController {
    
    private final CandidatoDAO candidatoDAO;
    
    public TesteCandidatoController() {
        this.candidatoDAO = new CandidatoDAO();
    }
    
    @Test
    public void testBuscaCandidato(){
        
        //Lista de candidatos que quero recuperar...
        ArrayList candidatos = new ArrayList();

        // quando eu busco a lista de candidatos...
        try {
            candidatos = (ArrayList) this.candidatoDAO.findCandidatos();

        } catch (SQLException ex) {
            System.out.println("CandidatoController: Falha ao recuperar lista de candidatos.");
            System.out.println(ex);
        }

        // então eu epero que apareçam os candidatos que tenho no banco de dados...
        assertNotNull("Lista de candidatos possui um numero de candidatos maior que zero", candidatos);
    }
}
