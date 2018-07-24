/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern.interfaces;

/**
 *
 * @author erim
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 File: " + filename);
    }
    
}
