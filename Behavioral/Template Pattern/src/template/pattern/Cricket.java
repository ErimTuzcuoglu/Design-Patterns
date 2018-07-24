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
public class Cricket extends Game{

    @Override
    void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
      System.out.println("Cricket Game Finished!");
    }
    
}
