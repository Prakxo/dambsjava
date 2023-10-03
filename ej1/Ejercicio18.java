package ej1;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args){

    Scanner re = new Scanner(System.in);

    double side;

    double height;

    System.out.printf("Escriba longitud de lado: \n");

    side = re.nextFloat();

    height = Math.sqrt(((side * side) - (side / 2d * side /2d)));

    System.out.printf("El área del triángulo es: %f \n", (side * height) / 2d);
    System.out.printf("El perímetro del triángulo es: %f \n", side * 3d);


    }
}
