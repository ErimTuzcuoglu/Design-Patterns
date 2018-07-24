/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıntercepting.filter.pattern;

import filters.Filter;

/**
 *
 * @author erim
 */
public class FilterManager {
    FilterChain filterChain;
    
    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    
    public void filterRequest(String request){
         filterChain.execute(request);
    }
}
