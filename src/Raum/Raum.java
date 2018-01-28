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
public class Raum {
    protected float Laenge;
    protected float Breite;
    protected double Grundflaeche;
    protected String Name;
    
    public Raum(float Laenge, float Breite)
    {
        this.Laenge=Laenge;
        this.Breite=Breite;
        this.Grundflaeche=Laenge*Breite;
    }
}


