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
public class Werknemers 
{
    
    private int pnummer;
    private String pswd;
    private int type; //1 => gewone werknemer; 2 => manager; 3 => boekhouder

    public int getPnummer() 
    {
        return pnummer;
    }

    public void setPnummer(int pnummer) 
    {
        this.pnummer = pnummer;
    }

    public String getPswd() 
    {
        return pswd;
    }

    public void setPswd(String pswd) 
    {
        this.pswd = pswd;
    }

    public int getType() 
    {
        return type;
    }

    public void setType(int type) 
    {
        this.type = type;
    }
}