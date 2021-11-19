package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MayorLongitudTest {

    //Hola chicos, os habla el Mario del pasado, suerte con los tests 😉
    @Test
    public void emptyMayorLongitudTest() throws EmptyCollectionException {  // 1-2-3-16
        Editor editor= new Editor();
        assertEquals(null,editor.mayorLongitud());
    }

    @Test
    public void singleMayorLongitudTest() throws EmptyCollectionException {  // 1-2-3-4-5-6-7-8-9-6-4-16
        Editor editor= new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals("buenos",editor.mayorLongitud());
    }


}
