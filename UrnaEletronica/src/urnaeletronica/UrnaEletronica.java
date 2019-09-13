/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica;

import urnaeletronica.views.HomeView;
import urnaeletronica.views.Router;

/**
 * Classe principal que deve somente iniciar a aplicação na página home.
 *
 * @author Bernardo
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Router.getInstance().goToView(new HomeView());
    }

}
