public class inverted_Right_Angle_Pyramid {
    public static void p5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p5(5);
    }
}
