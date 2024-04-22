public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            if (count % 2 == 0) {
                System.out.println("Số chẵn: " + count);
            } else {
                System.out.println("Số lẻ: " + count);
            }
            count++;
        }
    }
}
