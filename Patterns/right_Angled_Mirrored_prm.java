public class right_Angled_Mirrored_prm {

    public static void rightmpy(int n) {
        // for right pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for inverted pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightmpy(6);
    }
}