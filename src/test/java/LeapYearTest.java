import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    LeapYear currentYear;

    @BeforeEach
    public void setup() {
        currentYear = new LeapYear();
    }

    @Test
    public void isYearDivisibleBy4ButNot100(){
        assertEquals(true, currentYear.CheckLeapYear(2000));
    }

    @Test
    public void isYearDivisibleBy400(){
        assertEquals(true, currentYear.CheckLeapYear(2000));
    }

    @Test
    public void isYearNotDivisibleBy4(){
        assertEquals(false, currentYear.CheckLeapYear(2021));
    }

    @Test
    public void isYearDivisibleBy100ButNot400(){
        assertEquals(false, currentYear.CheckLeapYear(1700));
        assertEquals(false, currentYear.CheckLeapYear(1800));
        assertEquals(false, currentYear.CheckLeapYear(1900));
    }
}