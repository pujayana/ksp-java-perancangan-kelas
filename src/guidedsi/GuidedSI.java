/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidedsi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pujayana
 */
public class GuidedSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        String num;
        double bal, coin, amt, dep;
        
        try {
            
            //Deposit Account
            System.out.println("=== Deposit Account ===");
            System.out.println("Masukan number : "); num = r.readLine();
            System.out.println("Masukan deposit : "); dep = Double.parseDouble(r.readLine());
            
            DepositAccount d = new DepositAccount(num);
            
            System.out.println("=== Open Deposit ===");
            d.openDeposit(dep);
            
            //Saving Account
            System.out.println("\n=== Saving Account ===");
            System.out.println("Masukan number : "); num = r.readLine();
            System.out.println("Masukan balance : "); bal = Double.parseDouble(r.readLine());
            System.out.println("Masukan coin : "); coin = Double.parseDouble(r.readLine());
            System.out.println("Masukan amt : "); amt = Double.parseDouble(r.readLine());
            
            SavingAccount s = new SavingAccount(num);
            
            System.out.println("=== Open Saving ===");
            s.openSavingAccount(bal);
            System.out.println("=== Store Coins ===");
            s.storeCoins(coin);
            System.out.println("=== Withdrawal ===");
            s.withdrawal(amt);
            
        } catch (Exception e) {
        }
        
        
    }
    
}
