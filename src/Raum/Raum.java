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
    private float Laenge;
    private float Breite;
    private double Grundflaeche;
    
    public Raum(float Laenge, float Breite)
    {
        this.Laenge=Laenge;
        this.Breite=Breite;
        this.Grundflaeche=Laenge*Breite;
    }
}


