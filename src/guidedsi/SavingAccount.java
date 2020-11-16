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
public class SavingAccount implements SavingInterface {
    
    private String number;
    private double balance;
    
    public SavingAccount(String num){
        number = num;
    }
    
    @Override
    public void openSavingAccount(double bal){
        balance = bal;
        displayBalance();
    }
    
    @Override
    public void storeCoins(ICurrency coins){
        balance = balance + coins.getValue();
        displayBalance();
    }
    
    @Override
    public void withdrawal(double amt){
        balance = balance - amt;
        displayBalance();
    }
    
    @Override
    public void displayBalance(){
        System.out.println("Rekening dengan nomor : "+number+" memiliki sisa saldo tabungan : "+balance);
    }

    void storeCoins(double coin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
