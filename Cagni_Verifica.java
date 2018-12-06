/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagni_verifica;
import java.util.*;
import java.io.*;

/**
 *
 * @author Cagni Lorenzo
 */
public class Cagni_Verifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        Stanze st1=new Stanze (4,10,5,0,0,0);
        Stanze st2=new Stanze (4,5,5,0,0,0);
        Stanze st3=new Stanze (6,16,10,0,0,0);
        Stanze st4=new Stanze (6,16,5,0,0,0);
        
       
        int volumeTot=4*st1.calcolaVolume()+2*st2.calcolaVolume()+4*st3.calcolaVolume()+2*st4.calcolaVolume();
        System.out.println("Il volume totale e' = "+volumeTot);
        
        int areaTot=4*st1.calcolaArea()+2*st2.calcolaArea()+4*st3.calcolaArea()+2*st4.calcolaArea();
        System.out.println("L'area totale e' = "+areaTot);
        
        
        int pitturaTot=4*st1.costoPittura()+2*st2.costoPittura()+4*st3.costoPittura()+2*st4.costoPittura();
        System.out.println("Il costo totale della pittura e' = "+pitturaTot);
        
        System.out.println("Scegli il numero di operai");
        int operai=s.nextInt();
        int costoManTot=4*st1.costoManodopera(operai)+2*st2.costoManodopera(operai)+4*st3.costoManodopera(operai)+2*st4.costoManodopera(operai);
        System.out.println("Il costo totale degli operai e' = "+costoManTot);
        
        int costo=costoManTot+pitturaTot;
        
        System.out.println("Il costo totale e' = "+costo);

        

    }
    
}
