package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MayorLongitudTest {

    @Test
    public void mayorLongitudCamino1Test() throws EmptyCollectionException {  // 1-2-3-16
        Editor editor= new Editor();
        assertEquals(null,editor.mayorLongitud());
    }

    @Test
    public void mayorLongitudCamino4Test() throws EmptyCollectionException {  // 1-2-3-4-5-6-7-8-9-6-4-16
        Editor editor= new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero2.txt");
        assertEquals("palabra",editor.mayorLongitud());
    }
    
    @Test
    public void mayorLongitudCamino6Test() throws EmptyCollectionException {  // 1-2-3-4-5-6-7-8-9-6-7-8-10-11-6-4-16
        Editor editor= new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
        assertEquals("buenos",editor.mayorLongitud());
    }


}
