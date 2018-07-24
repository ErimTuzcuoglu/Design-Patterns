/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıterator.pattern;

/**
 *
 * @author erim
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.Next();
            System.out.println("Name: " + name);
        }
    }
    
}
