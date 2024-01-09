package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceInSortedTest {

    @Test
    void firstOccurrenceBin() {
        assertEquals(1, FirstOccurrenceInSorted.firstOccurrenceBin(new int[]{1, 10, 10, 10, 20}, 10, 0, 4));
        assertEquals(0, FirstOccurrenceInSorted.firstOccurrenceBin(new int[]{9, 9, 9, 9, 9}, 9, 0, 4));
    }
}