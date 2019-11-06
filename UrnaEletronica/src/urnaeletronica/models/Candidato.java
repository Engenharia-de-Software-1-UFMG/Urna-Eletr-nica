/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.models;

/**
 *
 * @author Bernardo
 */
public class Candidato extends Pessoa{
    
    protected int qtdVotos = 0;
    
    public Candidato(){
        super();
        this.qtdVotos = 0;
    }

    public int getQtdVotos() {
        return qtdVotos;
    }
    
    public void setQtdVotos(int qtdVotos) {
        this.qtdVotos = qtdVotos;
    }
    
    public void incrementaVotos(){
        this.qtdVotos += 1;
    }
}
