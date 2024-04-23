package org.example;

public class TamGiac {
    public static String loaiTamGiac(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "KhongPhaiTamGiac"; // NotATriangle
        } else if (a == b && b == c) {
            return "TamGiacDeu"; // Equilateral
        } else if (a == b || a == c || b == c) {
            return "TamGiacCan"; // Isosceles
        } else {
            return "TamGiacThuong"; // Scalene
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        String loai = loaiTamGiac(a, b, c);
        System.out.println(loai);
    }
}

