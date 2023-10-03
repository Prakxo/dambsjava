package ej1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){

        Scanner re = new Scanner(System.in);

        int initialSec;
        float seg, hour, min, day;
        float fractionalTemp;

        System.out.printf("Escriba segundos: \n");

        initialSec = re.nextInt();

        day = hour = min = seg = 0;


        min = initialSec / 60f;
        fractionalTemp = min - (int)min;
        seg = Math.round(fractionalTemp * 60f);


        if(min >= 60){
            hour = min / 60f;
            fractionalTemp = hour - (int)hour;
            min = Math.round(fractionalTemp * 60f);
        }

        if(hour >= 24){
            day = hour / 24f;
            fractionalTemp = day - (int)day;
            hour = Math.round(fractionalTemp * 24f);
        }
        System.out.printf("%d dias %d horas %d minutos y %d segundos",(int)day, (int)hour, (int)min, (int)seg);


        re.close();


    }
}
