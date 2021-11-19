package com.practica.cajablanca;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class NumPalabrasTest {
    public static Editor editor = new Editor();
    //Pruebas de mario y edu
    @BeforeEach
    public  void leerDatos(){
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
    }
    //Inicio Fin Palabra
    //1-2-3-1
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
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals(0,editor.numPalabras(1,0,"Hola"));
    }

    @Test
    public void numPalabrasCamino6Test() {
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        editor.numPalabras(1,2,"Hola");
        assertEquals(1,editor.numPalabras(1,2,"Hola"));
    }

    @Test
    public void numPalabrasCamino7Test() {
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals(0,editor.numPalabras(1,2,"Guacamole"));
    }
}
