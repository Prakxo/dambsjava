package ej1;

import java.util.Scanner;

public class Jercicio20 {
    
    public static void main(String[] args){
        Scanner re = new Scanner(System.in);

        float quote;
        float investion;
        int time;

        float neto, ret;

        System.out.printf("Escribe dinero a invertir: \n");
        
        investion = re.nextFloat();

        System.out.printf("Escribe interés anual: \n");
        
        quote = re.nextFloat();

        System.out.printf("Escribe tiempo a invertir: \n");
        
        time = re.nextInt();

        neto = (investion * (quote / 100f)) / time;

        System.out.printf("El banco le dará un neto de %f\n", neto);

        ret = investion * 0.18f;

        System.out.printf("Hacienda le retendrá %f\n", ret);

        System.out.printf("Su saldo será %f €", neto + ret);



    }
}
