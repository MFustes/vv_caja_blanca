package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SustituirPalabraTest {
    //Test de Ines y Dani
    Editor editor = new Editor();
    @BeforeEach
    public  void leerDatos(){
        editor = new Editor();
    }

    @Test
    public void sustituirPalabraCamino1() { //1-2-22
        editor.sustituirPalabra("","");
        assertEquals(0, editor.size());
    }
    //Camino no factible
    @Test
    public void sustituirPalabraCamino2() { //1-2-3-4-5-6-7-8-9-17-18-19-20-22
    }

    // No encuentra la palabra en el fichero
    @Test
    public void sustituirPalabrasCamino3() throws EmptyCollectionException { // 1-2-3-4-5-6-7-8-9-10-12-13-15-9-17-18-19-20-22
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero2.txt");
        editor.sustituirPalabra("hola", "flores");
        assertEquals("[palabra]", editor.getLinea(1).toString());
    }

    //Se encuentra la palabra
    @Test
    public void sustituirPalabrasCamino4() throws EmptyCollectionException { //1-2-3-4-5-6-7-8-9-10-11-15-9-17-18-19-20-22
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero2.txt");
        editor.sustituirPalabra("palabra", "flores");
        assertEquals("[flores]", editor.getLinea(1).toString());
    }


    @Test
    public void sustituirPalabrasCamino5() throws EmptyCollectionException { //1-2-3-4-5-6-8-9-10-11-15-9-17-18-19-5-6-7-8-9-10-11-15-9-17-18-19-20-22
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero4.txt");
        editor.sustituirPalabra("buenas", "buenisimas");
        assertEquals("[Hola, buenisimas]", editor.getLinea(1).toString());
    }





}
