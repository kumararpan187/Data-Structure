public class p13 {
    public static void shape13(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;
                int num = (n - Math.min(Math.min(top, down), Math.min(left, right)));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void shape13_i(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int min = (Math.min(Math.min(i, 2 * n - i - 2), Math.min(j, 2 * n - j - 2)));
                System.out.print(min + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shape13(3);
        

    }
}
