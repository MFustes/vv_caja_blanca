package com.practica.cajablanca;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class NumPalabrasTest {
    public static Editor editor = new Editor();
    //Pruebas de mario y edu
    @BeforeEach
    public static void leerDatos(){
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
    }
    //Inicio Fin Palabra
    //1-2-3-1
    @Test
    public void numPalabrasCamino1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            editor.numPalabras(0,1,"Hola");
        });
    }

    @Test
    public void numPalabrasCamino2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            editor.numPalabras(2,Integer.MAX_VALUE,"Hola");
        });
    }


    @Test
    public void numPalabrasCamino3() {
        editor = new Editor();
        assertEquals(0,editor.numPalabras(1,0,"Hola"));
    }

    @Test
    public void numPalabrasCamino4() {
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals(0,editor.numPalabras(1,0,"Hola"));
    }

    @Test
    public void numPalabrasCamino6() {
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        editor.numPalabras(1,2,"Hola");
        assertEquals(1,editor.numPalabras(1,2,"Hola"));
    }

    @Test
    public void numPalabrasCamino7() {
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals(0,editor.numPalabras(1,2,"Guacamole"));
    }
}
