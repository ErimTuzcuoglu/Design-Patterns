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
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("Male")){
                malePersons.add(person);
            }
        }
        
        return malePersons;
    }
    
}
