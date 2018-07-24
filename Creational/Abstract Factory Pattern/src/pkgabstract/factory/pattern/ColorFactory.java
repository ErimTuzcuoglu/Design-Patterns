/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.pattern;

import shapes.and.colors.Blue;
import shapes.and.colors.Color;
import shapes.and.colors.Green;
import shapes.and.colors.Red;
import shapes.and.colors.Shape;

/**
 *
 * @author erim
 */
public class ColorFactory extends AbstractFactory{

    //It must override all abstract methods.
    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("Green")){
            return new Green();
        }else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}
