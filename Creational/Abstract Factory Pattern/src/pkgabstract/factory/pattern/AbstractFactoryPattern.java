/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.pattern;

import shapes.and.colors.Color;
import shapes.and.colors.Shape;

/**
 *
 * @author erim
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        
        Shape s1 = shapeFactory.getShape("Circle");
        s1.draw();
        Shape s2 = shapeFactory.getShape("Square");
        s2.draw();
        Shape s3 = shapeFactory.getShape("Rectangle");
        s3.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        
        Color c1 = colorFactory.getColor("blue");
        c1.fill();
        Color c2 = colorFactory.getColor("red");
        c2.fill();
        Color c3 = colorFactory.getColor("GREEN");
        c3.fill();
    }
    
}
