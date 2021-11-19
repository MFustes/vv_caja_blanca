package com.practica.cajablanca;

import org.junit.Test;
import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class SustituirPalabraTest {
    //Test de Ines y Dani
    @BeforeEach
    public static void leerDatos(){
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
    }
    public static Editor editor= new Editor();
    @Test
    public void sustituirPalabraCamino1(){ //1-15
        Editor editor= new Editor();
        assertEquals(0,editor.size());
    }
}
