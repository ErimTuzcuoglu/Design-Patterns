/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıntercepting.filter.pattern;

import filters.AuthenticationFilter;
import filters.DebugFilter;

/**
 *
 * @author erim
 */
public class InterceptingFilterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Home");
    }
    
}
