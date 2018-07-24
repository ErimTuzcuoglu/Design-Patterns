/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern;

import prototype.pattern.shapes.Shape;

/**
 *
 * @author erim
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();
        
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
        
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        
        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
        
    }
    
}
