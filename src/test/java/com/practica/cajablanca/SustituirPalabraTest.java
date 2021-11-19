package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SustituirPalabraTest {
    //Test de Ines y Dani
    @BeforeEach
    public  void leerDatos(){
        editor.leerFichero("src/test/java/com/practica/cajablanca/fichero1.txt");
    }
    public static Editor editor= new Editor();
    @Test
    public void sustituirPalabraCamino1(){ //1-15
        Editor editor= new Editor();
        assertEquals(0,editor.size());
    }

    @Test

    public void sustituirPalabraCamino2() throws EmptyCollectionException {
        Editor editor= new Editor();
        AbstractSingleLinkedListImpl<String> lista= this.editor.getLinea(1);
       // assertEquals(" ",lista.getAtPos());
    }


}
