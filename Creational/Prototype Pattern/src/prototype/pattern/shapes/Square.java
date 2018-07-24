/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern.shapes;

/**
 *
 * @author erim
 */
public class Square extends Shape{

    public Square(){
        type =  "Square";
    }
    
    @Override
    void draw() {
        System.out.println("Square");
    }
    
}
