/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.pattern;

import visitor.pattern.parts.Computer;
import visitor.pattern.parts.ComputerPart;
import visitor.pattern.parts.ComputerPartDisplayVisitor;

/**
 *
 * @author erim
 */
public class VisitorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
