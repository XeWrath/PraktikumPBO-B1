package org.main;

import org.segitiga.*;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        persegipanjang persegi = new persegipanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Segitiga :"+persegi.hitungLuas());
        Segitiga segitiga = new Segitiga(10,10,4);
        segitiga.printInfo();
        System.out.println("Luas Segitiga :"+segitiga.hitungLuas());
    }
    
}
