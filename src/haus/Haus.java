/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haus;

import Raum.*;

/**
 *
 * @author RB_Development
 */
public class Haus {
        //Strings
        String Besitzer;
        
        
        //byte/short/integer
        byte Anz_Zimmer;
        byte Hausnummer;
        short Wasserverbrauch;
        int Anz_Bewohner;
        int Anz_Geschosse;
        int Dachneigung;
        
        //Gleitkommazahlen
        float Laenge;
        float Breite;
        double Stromverbrauch;
        double Grundflaeche;
        double Wohnflaeche;
        
        //char 0 ... 65.535
        char Energieeffizienzklasse = 'A'; 
        
        //Boolean true / false
        boolean Photovoltaik;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Haus Haus1 = new Haus();
        Haus1.set_Besitzer("RB");
        Haus1.set_Grundflaeche();
        
        //Räume initialisieren
        Bad Gaeste_WC = new Bad(3,3);
        Wohnraum Kueche = new Wohnraum(5,6);
        Wohnraum Flur = new Wohnraum (2,3);
    }
    //Funktionserklärung get-set
    public String get_Besitzer()
    {
        return Besitzer;
    }
    
    public void set_Besitzer(String neuer_Besitzer)
    {
        Besitzer= neuer_Besitzer;
    }
    
    public void set_Grundflaeche()
    {
        Grundflaeche=Laenge*Breite*Anz_Geschosse;
    }
}
