/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burbujanoeficiente;

import java.util.Random;

/**
 *
 * @author avanza
 */
public class BurbujaEficiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        // TODO code application logic here
        int i=0,j=0;
        int antes,despues,aux;
        
        int[] lista = new int[10];
        Random bolsa = new Random();
        lista[0]=bolsa.nextInt(100);
        lista[1]=bolsa.nextInt(100);
        lista[2]=bolsa.nextInt(100);
        lista[3]=bolsa.nextInt(100);
        lista[4]=bolsa.nextInt(100);
        lista[5]=bolsa.nextInt(100);
        lista[6]=bolsa.nextInt(100);
        lista[7]=bolsa.nextInt(100);
        lista[8]=bolsa.nextInt(100);
        lista[9]=bolsa.nextInt(100);
        System.out.println("Array desordenado:");
        for (i=0;i<=9;i++)
            System.out.println(lista[i]);
        //AHORA, A ORDENAR:
        i=0;
        boolean ordenado=false;
        while ((i<=9) && (ordenado==false))
        {
          
            antes=0;
            despues=1;
            ordenado=true;
            for (antes=0;antes<=8;antes++)
            {
                //comparar antes y despues
                if (lista[antes]>lista[despues])
                { //Hay un intercambio -> desordenado
                    aux=lista[antes];
                    lista[antes]=lista[despues];
                    lista[despues]=aux;              
                    ordenado=false;
                }
                //aumentardespues en 1
                despues++;
            }        
            i++;
        }
        
        System.out.println("El array ordenado es:");
        for (i=0; i<=9; i++)
        {
            System.out.println(lista[i]);
        }
    }
}
    

