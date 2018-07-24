/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.entity.pattern;

import composite.entity.pattern.objects.CompositeEntity;

/**
 *
 * @author erim
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();
    
    public void printData(){
        for(int i = 0; i< compositeEntity.getData().length; i++){
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }
    
    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
