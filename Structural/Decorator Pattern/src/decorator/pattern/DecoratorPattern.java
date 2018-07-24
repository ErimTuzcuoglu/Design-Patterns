/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern;

/**
 *
 * @author erim
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        
        System.out.println("Normal bordered circle");
        circle.draw();
        
        System.out.println("\nRed bordered circle");
        redCircle.draw();
        
        System.out.println("\nRed bordered rectangle");
        redRectangle.draw();
    }
    
}
