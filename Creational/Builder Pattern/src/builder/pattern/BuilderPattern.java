/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.pattern;

import food.Meal;
import food.MealBuilder;

/**
 *
 * @author erim
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();
        
        Meal vegMeal = mb.prepareVegMeal();
        System.out.println("Veg Meal: ");
        vegMeal.showItems();
        System.out.println("Total Price: " + vegMeal.getCost());
        
        Meal nonVegMeal = mb.prepareNonVegMeal();
        System.out.println("\nNon Veg Meal: ");
        nonVegMeal.showItems();
        System.out.println("Total Price: " + nonVegMeal.getCost());
    }
    
}
