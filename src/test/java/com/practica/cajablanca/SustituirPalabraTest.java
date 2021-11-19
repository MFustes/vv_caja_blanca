package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SustituirPalabraTest {
    //Test de Ines y Dani

    @Test
    public void sustituirPalabraCamino1() { //1-15
        Editor editor = new Editor();
        assertEquals(true, editor.editIsEmpty());
    }

    @Test

    public void sustituirPalabraCamino2() { //1-2-3-4-5-12-13-14-15
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero3.txt");
        //assertEquals(false, editor.editIsEmpty());
        editor.sustituirPalabra("hola", "dani");
    }

    @Test
    public void sustituirPalabrasCamino3() throws EmptyCollectionException { //1-2-3-4-5-6-7-9-10-11-5-12-13-14-15
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero2.txt");
        editor.sustituirPalabra("palabra", "hola");

    }

    @Test
    public void sustituirPalabrasCamino4() { //1-2-3-4-5-6-8-9-10-11-5-12-13-14-15
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero2.txt");
        editor.sustituirPalabra("flores", "hola");

    }

    @Test
    public void sustituirPalabrasCamino5() throws EmptyCollectionException { //1-2-3-4-5-6-8-9-10-11-5-12-13-3-4-5-12-13-14-15
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero4.txt");
        editor.sustituirPalabra("flores", "hola");
    }






}
