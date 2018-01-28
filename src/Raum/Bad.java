/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raum;

/**
 *
 * @author RB_Development
 */
public class Bad extends Raum{
    
    boolean Dusche;
    boolean Badewanne;
    
    public Bad(float Laenge, float Breite) 
    {
        super(Laenge, Breite);
    }
    public Bad(float Laenge, float Breite, String Name)
    {
        super(Laenge, Breite);
        this.Name=Name;
    }
    //get-set Methoden
    public boolean get_Dusche()
    {
        return this.Dusche;
    }
    public boolean get_Badewanne()
    {
        return this.Badewanne;
    }
    public void set_Dusche(boolean Dusche)
    {
        this.Dusche=Dusche;
    }
    public void set_Badewanne(boolean Badewanne)
    {
        this.Badewanne=Badewanne;
    }
}
