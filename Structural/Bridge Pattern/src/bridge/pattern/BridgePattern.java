/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

import bridge.pattern.shapes.Circle;
import bridge.pattern.shapes.GreenCircle;
import bridge.pattern.shapes.RedCircle;
import bridge.pattern.shapes.Shape;

/**
 *
 * @author erim
 */
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        
        redCircle.draw();
        greenCircle.draw();
    }
    
}
