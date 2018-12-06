/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagni_verifica;

import java.util.Scanner;

    /**
     *
     * @author Cagni Lorenzo
     */
    public class Stanze {
       private int lunghezza;
       private int larghezza;
       private int altezza;
       private int volume;
       private int area;
       private int pittura;

    public Stanze() {
    }

    public Stanze (int lunghezza, int larghezza, int altezza, int volume, int area, int pittura) {
            this.lunghezza=lunghezza;
            this.larghezza=larghezza;
            this.altezza=altezza;
            this.volume=volume;
            this.area=area;
            this.pittura=pittura;
            
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPittura() {
        return pittura;
    }

    public void setPittura(int pittura) {
        this.pittura = pittura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public int calcolaVolume () {
        volume=lunghezza*larghezza*altezza;
        return volume;
    }
   
    
    public int calcolaArea() {
        area=(lunghezza*larghezza)+(lunghezza*altezza*2)+(larghezza*altezza*2);
        return area;
    }
    Scanner s=new Scanner (System.in);
    
    public int costoPittura() {
        System.out.println("Inserisci il tipo di pittura che preferisci: Ottanio=1, Ruggine=2, Ametista=3");
        int l;
        do {
          l=s.nextInt();
        }
        while(0<=l && l>3);

        switch (l) {
        case 1:  l = 1;
                setPittura(45);
                 break;
        case 2:  l = 2;
                setPittura(40);

                 break;
        case 3:  l = 3;
                setPittura(50);
                 break;
        }
    int costoPittura=area*pittura;    
    return costoPittura;
    }
    public int costoManodopera(int  noperai) {
        int costoMan=area/(80*noperai);
        return costoMan;
    }

}
