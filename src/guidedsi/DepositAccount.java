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
public class DepositAccount implements DepositInterface {
    
    private String number;
    private double deposit;
    
    public DepositAccount(String num){
        number = num;
    }
    
    @Override
    public void openDeposit(double dep){
        deposit = dep;
        displayDeposit();
    }
    
    @Override
    public void displayDeposit(){
        System.out.println("Rekening dengan nomor : "+number+" memiliki saldo deposito sebanyak : "+deposit);
    }
    
}
