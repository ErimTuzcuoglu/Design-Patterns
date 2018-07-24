/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.pattern;

/**
 *
 * @author erim
 */
public class FlyweightPattern {

    /**
     * @param args the command line arguments
     */
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomXOrY());
            circle.setY(getRandomXOrY());
            circle.draw();
        }
    }
    
    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomXOrY(){
        return (int)(Math.random() * 100);
    }

}
