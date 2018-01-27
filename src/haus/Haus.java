/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haus;

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
        Haus1.set_Besitzer("Boesche");
        System.out.println(Haus1.get_Besitzer());
        Haus1.set_Grundflaeche();
        
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
