package com.practica.cajablanca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class NumPalabrasTest {
    public static Editor editor = new Editor();
    @BeforeEach
    public  void leerDatos(){
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
    }

    @Test
    public void numPalabrasCamino1Test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            editor.numPalabras(0,1,"Hola");
        });
    }

    @Test
    public void numPalabrasCamino2Test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            editor.numPalabras(2,Integer.MAX_VALUE,"Hola");
        });
    }


    @Test
    public void numPalabrasCamino3Test() {
        editor = new Editor();
        assertEquals(0,editor.numPalabras(1,0,"Hola"));
    }

    @Test
    public void numPalabrasCamino4Test() {
        assertEquals(0,editor.numPalabras(1,0,"Hola"));
    }

    @Test
    public void numPalabrasCamino6Test() {
        assertEquals(1,editor.numPalabras(1,2,"Hola"));
    }

    @Test
    public void numPalabrasCamino7Test() {
        assertEquals(0,editor.numPalabras(1,2,"Guacamole"));
    }
}
