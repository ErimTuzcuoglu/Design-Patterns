/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıntercepting.filter.pattern;

/**
 *
 * @author erim
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
