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
public class Client {
    FilterManager filterManager;
    
    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }
    
    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
