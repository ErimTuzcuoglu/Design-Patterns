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
public class BusinessDelegate {
    private BusinessLookup lookupService = new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;
    
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }
    
    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
