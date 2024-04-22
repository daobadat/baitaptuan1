import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testEvenNumber() {
        int count = 2;
        Main.main(new String[]{}); // Thay đổi main để nhận tham số
        String output = System.console().readLine();
        assertEquals("Số chẵn: 2", output);
    }

    @Test
    public void testOddNumber() {
        int count = 1;
        Main.main(new String[]{}); // Thay đổi main để nhận tham số
        String output = System.console().readLine();
        assertEquals("Số lẻ: 1", output);
    }
}
