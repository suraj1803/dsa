package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void sqrt() {
        assertEquals(3, Sqrt.sqrt(10));
        assertEquals(4, Sqrt.sqrt(16));
        assertEquals(4, Sqrt.sqrt(20));
        assertEquals(1, Sqrt.sqrt(2));
    }
}