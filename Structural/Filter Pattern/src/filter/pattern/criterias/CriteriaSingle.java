/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter.pattern.criterias;

import filter.pattern.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erim
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(person);
            }
        }
        
        return singlePersons;
    }
    
}
