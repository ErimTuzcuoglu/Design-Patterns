/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.pattern;

import shapes.and.colors.Circle;
import shapes.and.colors.Color;
import shapes.and.colors.Rectangle;
import shapes.and.colors.Shape;
import shapes.and.colors.Square;

/**
 *
 * @author erim
 */
public class ShapeFactory extends AbstractFactory{

    //It must override all abstract methods.
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
    
}
