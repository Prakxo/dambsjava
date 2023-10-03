package ej1;

public class Ejercicio15 {
        public enum DiasSemana{
            DIAS_START, 
            LUNES, 
            MARTES, 
            MIERCOLES, 
            JUEVES, 
            VIERNES, 
            SABADO, 
            DOMINGO, 
           // DIAS_MAX = DOMINGO; <- This is dumb, why doesn't this work
        }
    public static void main(String[] args){


        DiasSemana dia = DiasSemana.MARTES;

        System.out.printf("El día es: %s \n", dia);
        System.out.printf("El numero de día de domingo es: %d \n", DiasSemana.DOMINGO.ordinal());
    }
}
