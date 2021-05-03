package Fibbo;

import java.util.ArrayList;

public class Main {

    public static int fibonacciSecuencia(int posicion) {

        if (posicion == 1)
            return 0;
         if(posicion == 2)
            return 1;
        else
            return  fibonacciSecuencia(posicion -2) + fibonacciSecuencia( posicion -1);
    }

    public static int generarSerieArray(int cant){
        ArrayList array = new ArrayList(cant);

        if (cant == 1){
            array.add(0);
        }
        if(cant == 2){
            array.add(0);
            array.add(1);
        }
        else
            array.add(0);
            array.add(1);
            array.add(1);
            for (int i = 2; i <=cant ; i++){
                array.add((i - 2) + (i - 1));
            }

        return (int) array.get(cant);
    }

    public static void main(String[] args){
        System.out.println(generarSerieArray(5));


    }

}
