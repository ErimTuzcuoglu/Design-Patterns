/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

import factory.pattern.Shapes.*;

/**
 *
 * @author erim
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShapes("Square");
        s1.draw();
        Shape s2 = sf.getShapes("Rectangle");
        s2.draw();
        Shape s3 = sf.getShapes("Circle");
        s3.draw();
    }
    
}
