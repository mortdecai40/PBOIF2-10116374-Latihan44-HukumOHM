/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116374.latihan44.hukumohm;

/**
 *
 * @author Acromyrmex
 */
public class Baterai {

    private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                +"akan berbanding lurus dengan beda potensial\n"
                +"pada ujung-ujung kawat penghantar tersebut\n"
                +"asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.hambatan = hambatan;
        this.kuatArus = kuatArus;
        
        System.out.println("Kuat Arus : " + getKuatArus());
        System.out.println("Hambatan : " + getHambatan());
        System.out.println("Hasil Tegangan : " + hitungTegangan());
        
    }
    
    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return hambatan * kuatArus;
    }
    
}
