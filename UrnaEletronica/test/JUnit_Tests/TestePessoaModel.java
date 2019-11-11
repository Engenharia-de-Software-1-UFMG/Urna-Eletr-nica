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

import urnaeletronica.models.Pessoa;

/**
 *
 * @author Bernardo
 */
public class TestePessoaModel {
    
    public TestePessoaModel(){
    //Construtor deixado em branco de forma proposital...
    }
    
    @Test
    public void testNomeValido(){
            //Pessoa que eu tenho...
            Pessoa pessoa = new Pessoa();

            // quando eu dou um nome...
            String nome = "Antonio George Sampaio";
            pessoa.setNome(nome);
            
            // então eu epero que apareça o nome...
            assertNotNull("Pessoa possui um nome valido", pessoa.getNome());
    }
    
    @Test
    public void testCpfValido(){
            //Pessoa que eu tenho...
            Pessoa pessoa = new Pessoa();

            // quando eu dou um CPF...
            String cpf = "Antonio George Sampaio";
            pessoa.setCpf(cpf);
            
            // então eu epero que apareça o CPF...
            assertNotNull("Pessoa possui um CPF valido", pessoa.getCpf());
    }
    
    @Test
    public void testTelefoneValido(){
            //Pessoa que eu tenho...
            Pessoa pessoa = new Pessoa();

            // quando eu dou um telefone...
            String telefone = "Antonio George Sampaio";
            pessoa.setTelefone(telefone);
            
            // então eu epero que apareça o telefone...
            assertNotNull("Pessoa possui um telefone valido", pessoa.getTelefone());
    }
    
    @Test
    public void testTipoValido(){
            //Pessoa que eu tenho...
            Pessoa pessoa = new Pessoa();

            // quando eu dou um tipo...
            int tipo;
            pessoa.setTipo(1);
            
            // então eu epero que apareça o tipo...
            assertNotEquals("Pessoa possui um tipo valido", 0, pessoa.getTipo());
    }
}
