/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.pattern.shapes;

/**
 *
 * @author erim
 */
public class ShapeMaker {
    private Shape circle, square, rectangle;
    
    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
}
