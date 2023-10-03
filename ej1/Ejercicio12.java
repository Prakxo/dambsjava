package ej1;

public class Ejercicio12 {
    
    public static void main(String[] args){

        final double pi = Math.PI;

        float diameter = 15.5f;
        float height = 42.4f;
        float radius = (diameter / 2.0f);

        System.out.printf("El área del cilindro es: %1.2f cm \n", pi * 2d * radius  * height + pi * 2d * (radius * radius));
        System.out.printf("El volumen del cilindro es: %1.2f cm \n", pi * (radius * radius) * height);
    }
}
