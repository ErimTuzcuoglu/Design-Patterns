/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern;

import adapter.pattern.interfaces.MediaAdapter;
import adapter.pattern.interfaces.MediaPlayer;

/**
 *
 * @author erim
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        
        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }
        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " is not supported.");
        }
    }
    
}
