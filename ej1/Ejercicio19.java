package ej1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){

        Scanner re = new Scanner(System.in);

        float precioporlitro1,totalpagado1,kilometros1,precioporlitro2,totalpagado2,kilometros2;

        precioporlitro1 = totalpagado1 = kilometros1 = precioporlitro2 = totalpagado2 = kilometros2 = 0;

        System.out.printf("Solicitud 1: \n");
        System.out.printf("Escriba precio del litro 1: \n");

        precioporlitro1 = re.nextFloat();

        System.out.printf("Total pagado 1: \n");
        
        totalpagado1 = re.nextFloat();
        
        System.out.printf("Kilometros en el cuentakilometros 1: \n");
        
        kilometros1 = re.nextFloat();


        System.out.printf("Solicitud 2: \n");
        System.out.printf("Escriba precio del litro 1: \n");
        
        precioporlitro2 = re.nextFloat();
        
        System.out.printf("Total pagado en 2: \n");
        
        totalpagado2 = re.nextFloat();

        System.out.printf("Solicitud 3: \n");
        
        System.out.printf("Kilometros en el cuentakilometros 2: \n");
        
        kilometros2 = re.nextFloat();


        float litroscargados1 = totalpagado1/precioporlitro1;
        float litroscargados2 = totalpagado2/precioporlitro2;

        float median = Math.round(((litroscargados1+litroscargados2)/(kilometros2-kilometros1))*100f);

        float costeKm = (Math.round((kilometros2-kilometros1)/(totalpagado1+totalpagado2)));


        System.out.printf("Consumo medio por 100 km es: %1.2f € \n", median);
        System.out.printf("Coste por km es : %1.2f € \n", costeKm);

        re.close();


    }
}