import org.example.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class NextDateTest {

    @Test
    public void testNextDateValidInput() {
        int day = 10;
        int month = 5;
        int year = 2024;

        LocalDate expectedDate = LocalDate.of(2024, 5, 11);
        LocalDate actualDate = NextDate.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDateLastDayOfMonth() {
        int day = 31;
        int month = 5;
        int year = 2024;

        LocalDate expectedDate = LocalDate.of(2024, 6, 1);
        LocalDate actualDate = NextDate.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDateEndOfYear() {
        int day = 31;
        int month = 12;
        int year = 2024;

        LocalDate expectedDate = LocalDate.of(2025, 1, 1);
        LocalDate actualDate = NextDate.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDateInvalidDay() {
        int day = 0;
        int month = 5;
        int year = 2024;

        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(day, month, year));
    }

    @Test
    public void testNextDateInvalidMonth() {
        int day = 10;
        int month = 0;
        int year = 2024;

        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(day, month, year));
    }

    @Test
    public void testNextDateInvalidYear() {
        int day = 10;
        int month = 5;
        int year = 1811;

        assertThrows(IllegalArgumentException.class, () -> NextDate.nextDate(day, month, year));
    }
}