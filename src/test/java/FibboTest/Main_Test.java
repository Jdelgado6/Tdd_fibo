package FibboTest;


import Fibbo.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static Fibbo.Main.fibonacciSecuencia;
import static Fibbo.Main.generarSerieArray;

public class Main_Test {

    @Test
    public void fibonacciPrimerCasoCero(){
        long valorControl, valorObtenido;

        valorControl = 0;

        valorObtenido = fibonacciSecuencia(1);

        Assertions.assertEquals(valorControl, valorObtenido);
    }

    @Test
    public void fibonacciSegundoCasoUno(){

        long valorControl, valorObtenido;

        valorControl = 1;

        valorObtenido = fibonacciSecuencia(2);

        Assertions.assertEquals(valorControl, valorObtenido);

    }

    @Test
    public void fibonacciTercerCasoValoresSecuencia() {

        long valorControl, valorObtenido;

        valorControl = 3;

        valorObtenido = fibonacciSecuencia(5);

        Assertions.assertEquals(valorControl, valorObtenido);
    }

    @Test
    public void generarSerieArrayPrimerCaso(){

        int valorControl;
        int valorObtenido;

        valorControl = 0;
        valorObtenido = generarSerieArray(1);

        Assertions.assertEquals(valorControl, valorObtenido);


    }


    @Test
    public void generarSerieArraySegundoCaso(){

        int valorControl;
        int valorObtenido;

        valorControl = 1;

        valorObtenido = generarSerieArray(2);

        Assertions.assertEquals(valorControl, valorObtenido);

    }

    @Test
    public void generarSerieArrayTercerCaso(){

        int valorControl;
        int valorObtenido;

        valorControl = 3;

        valorObtenido = generarSerieArray(5);

        Assertions.assertEquals(valorControl, valorObtenido);

    }




}
