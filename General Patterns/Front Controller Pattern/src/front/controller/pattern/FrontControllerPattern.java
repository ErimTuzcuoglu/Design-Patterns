/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.controller.pattern;

/**
 *
 * @author erim
 */
public class FrontControllerPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Student");
        frontController.dispatchRequest("Home");
    }
    
}
