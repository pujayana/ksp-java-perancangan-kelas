/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidedsi;

/**
 *
 * @author pujayana
 */
public class Notes implements ICurrency {
    
    private double value;
    
    public Notes(double value){
        this.value = value;
    }
    
    @Override
    public double getValue(){
        return value;
    }
    
}
