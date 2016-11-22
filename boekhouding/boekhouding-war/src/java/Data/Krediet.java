/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author jonas
 */
public class Krediet 
{
    
    private int krNr;
    private double krSaldo;
    private int krType; //1 => gewoon krediet; 2 => gewaarborgd krediet
    
    
    public int getKrNr()
    {
        return krNr;
    }
    
    public void setKrNr(int nr)
    {
        krNr = nr;
    }
    
    public double getKrSaldo()
    {
        return krSaldo;
    }
    
    public void setKrSaldo(double saldo)
    {
        krSaldo = saldo;
    }
}
