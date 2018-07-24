/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.pattern;

/**
 *
 * @author erim
 */
public class Memento {
    private String state;
    
    public Memento(String state){
        this.state = state;
    }
    
    public String getState(){
        return this.state;
    }
    
}
