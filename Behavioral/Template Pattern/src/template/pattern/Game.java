/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.pattern;

/**
 *
 * @author erim
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    public void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
