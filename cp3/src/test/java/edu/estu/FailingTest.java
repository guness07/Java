package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

  public void testCollectionsMinWithNaN() {
        List<Double> doubleList = List.of(Double.NaN, 1D, 2D, 3D, -1D, -2D);
        Double minValue = Collections.min(doubleList);
        
        // Burada beklenen sonucu kontrol etmek önemli.
        assertEquals(-2.0, minValue, 0.001); // Örnek bir karşılaştırma
    }
}
