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
public interface SavingInterface {
    public void openSavingAccount(double bal);
    public void storeCoins(double amt);
    public void withdrawal(double amt);
    public void displayBalance();
}
