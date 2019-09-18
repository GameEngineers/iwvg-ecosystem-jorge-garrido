package es.upm.miw.iwvg.ecosystem.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 2);
    }

    @Test
    void testFraction() {
        fraction = new Fraction(4, 2);
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testFractionInfinity() {
        fraction = new Fraction(4, 0);
        assertEquals(POSITIVE_INFINITY, fraction.decimal());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testGetNumerator() {
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
    }
}