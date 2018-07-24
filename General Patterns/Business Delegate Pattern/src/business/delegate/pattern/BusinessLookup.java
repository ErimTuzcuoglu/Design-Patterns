/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.delegate.pattern;

/**
 *
 * @author erim
 */
public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
