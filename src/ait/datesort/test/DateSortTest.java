package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
В классе DateSortTest из классной работы, реализовать компаратор в методе setUp, чтобы тест был верный.
        Просьба не использовать Java Time API.*/
public class DateSortTest {
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            //TODO
            return 0;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);
    }
}

