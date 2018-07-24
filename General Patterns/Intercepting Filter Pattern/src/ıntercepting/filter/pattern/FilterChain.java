/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıntercepting.filter.pattern;

import filters.Filter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erim
 */
public class FilterChain {
    
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;
    
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    
    public void execute(String request){
        for(Filter filter : filters){
            filter.execute(request);
        }
        target.execute(request);
    }
    
    public void setTarget(Target target){
        this.target = target;
    }
}
