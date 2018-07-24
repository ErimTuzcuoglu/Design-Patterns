/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.pattern;


/**
 *
 * @author erim
 */
public interface State {
    public void doAction(Context context);
}
