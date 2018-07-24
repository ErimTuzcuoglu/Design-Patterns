/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.entity.pattern;

/**
 *
 * @author erim
 */
public class CompositeEntityPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "data");
        client.printData();
        client.setData("Second Test", "data1");
        client.printData();
    }
    
}
