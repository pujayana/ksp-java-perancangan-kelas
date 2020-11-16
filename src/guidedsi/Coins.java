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
public class Coins implements ICurrency {
    
    public double value;
    
    public Coins(double value){
        this.value = value;
    }
    
    @Override
    public double getValue(){
        return value;
    }
    
}
