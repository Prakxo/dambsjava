package ej1;

public class Ejercicio13 {
    
    public static void main(String[] args){
        
        float neto, ret;

        neto = (2000 * 0.275f) / 2;

        System.out.printf("El banco le dará un neto de %f\n", neto);

        ret = 2000 * 0.18f;
        System.out.printf("Hacienda le retendrá %f\n", ret);


        System.out.printf("Su saldo será %f €", neto + ret);
    }
}
