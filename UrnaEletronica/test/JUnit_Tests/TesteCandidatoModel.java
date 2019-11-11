/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import urnaeletronica.models.Candidato;

/**
 *
 * @author Bernardo
 */
public class TesteCandidatoModel {
    
    public TesteCandidatoModel() {
        //Construtor deixado em branco de forma proposital...
    }
    
    @Test
    public void testVotacao(){
            //candidato que eu tenho...
            Candidato candidato = new Candidato();

            // quando eu voto nele...
            int votos = 0;
            candidato.setQtdVotos(votos);
            candidato.incrementaVotos();
            int votado = candidato.getQtdVotos();

            // então eu epero que apareça o voto...
            assertNotEquals("Candidato possui um numero de votos maior que zero", 0, votado);
    }
}
