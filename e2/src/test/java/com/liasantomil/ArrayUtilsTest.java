package com.liasantomil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    /*encontrar mínimo*/
    @Test    
    void testEncontrarMinimo() {
        int[] array = {3, 1, 4, 1, 5, 9, 2};
        assertEquals(1, ArrayUtils.encontrarMinimo(array));
    }

    /*minimo arrayVacio*/
    @Test
    void testEncontrarMinimoArrayVacio() {
        int[] arrayVacio = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.encontrarMinimo(arrayVacio));
    }

    /*encontrar máximo */
    @Test 
    void testEncontrarMaximo() {
        int[] array = {3, 1, 4, 1, 5, 9, 2};
        assertEquals(9, ArrayUtils.encontrarMaximo(array));
    }

    /*máximo arrayVacio */
    @Test 
    void testEncontrarMaximoArrayVacio(){
        int[] arrayVacio = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.encontrarMaximo(arrayVacio));
    }

    /*calcular promedio*/
    @Test
    void testCalcularPromedio() {
        int[] array = {3, 1, 4, 1, 5, 9, 2};
        assertEquals(3.57, ArrayUtils.calcularPromedio(array));
    }

    /*promedio arrayVacio */
    @Test 
    void testCalcularPromedioArrayVacio(){
        int[] arrayVacio = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.calcularPromedio(arrayVacio));
    }
}
