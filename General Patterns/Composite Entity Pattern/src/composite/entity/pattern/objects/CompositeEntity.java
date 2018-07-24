/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.entity.pattern.objects;

import composite.entity.pattern.objects.CoarseGrainedObject;

/**
 *
 * @author erim
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();
    
    public void setData(String data1, String data2){
      cgo.setData(data1, data2);
   }

   public String[] getData(){
      return cgo.getData();
   }
}
