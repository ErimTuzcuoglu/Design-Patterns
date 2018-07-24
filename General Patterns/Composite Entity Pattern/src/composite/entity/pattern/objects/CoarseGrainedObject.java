/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.entity.pattern.objects;

/**
 *
 * @author erim
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();
    
    public void setData(String data1 , String data2 ){
        do1.setData(data1);
        do2.setData(data2);
    }
    
    public String[] getData(){
        return new String[]{do1.getData(), do2.getData()};
    }
}
