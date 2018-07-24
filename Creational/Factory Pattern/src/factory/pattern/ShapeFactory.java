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
public class ShapeFactory {
    public Shape getShapes(String shape) {
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
    
}
