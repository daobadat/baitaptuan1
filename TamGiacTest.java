import  org.example.TamGiac;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TamGiacTest {
    @Test
    public void testTamGiacDeu() {
        assertEquals("TamGiacDeu", TamGiac.loaiTamGiac(3, 3, 3));
    }

    @Test
    public void testTamGiacCan() {
        assertEquals("TamGiacCan", TamGiac.loaiTamGiac(4, 4, 3));
        assertEquals("TamGiacCan", TamGiac.loaiTamGiac(3, 4, 4));
        assertEquals("TamGiacCan", TamGiac.loaiTamGiac(4, 3, 4));
    }

    @Test
    public void testTamGiacThuong() {
        assertEquals("TamGiacThuong", TamGiac.loaiTamGiac(3, 4, 5));
        assertEquals("TamGiacThuong", TamGiac.loaiTamGiac(5, 12, 13));
    }

    @Test
    public void testKhongPhaiTamGiac() {
        assertEquals("KhongPhaiTamGiac", TamGiac.loaiTamGiac(0, 3, 4));
        assertEquals("KhongPhaiTamGiac", TamGiac.loaiTamGiac(-1, -2, -3));
        assertEquals("KhongPhaiTamGiac", TamGiac.loaiTamGiac(1, 1, 200));
    }
}
