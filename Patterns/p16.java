public class p16 {
    public static void shape16(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print((char) ((int) ('A' + i)) + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shape16(5);
    }
}